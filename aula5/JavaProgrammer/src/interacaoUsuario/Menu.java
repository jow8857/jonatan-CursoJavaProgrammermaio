package interacaoUsuario;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Menu {

	public void menuInicial() {

		CaracteristicasAnimais caracteristicasanimais = new CaracteristicasAnimais();

		

		/*
		 * if (opcao == 1) { // SE A OPÇÃO DIGITADA FOR 1
		 * caracteristicasanimais.CaracteristicaCachorro();// VAI EXECUTAR ESSA LINHA }
		 * if (opcao == 2) { caracteristicasanimais.CaracteristicaCobra(); }
		 * 
		 * if (opcao != 1 || opcao != 2) { JOptionPane.showMessageDialog(null,
		 * "Insira 1 ou 2"); }
		 */
boolean menuResultado = true; 
		
	
		while (menuResultado) {
			
			int opcao = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 para Cobra e Qualquer Tecla para cahorro:"));			
			
			switch (opcao) { 
			case 1: { 
				caracteristicasanimais.CaracteristicaCachorro();
				break;
			}
			case 2: {
				 caracteristicasanimais.CaracteristicaCobra();
				break;
			}
			case 3: { 
				System.exit(0);
				break;
			}
			default: 
				JOptionPane.showMessageDialog(null, "Insira 1 ou 2");
			
				break;
			}
			
			
			if(opcao == 1 || opcao == 2) {
				menuResultado = false;
			}
			
		}

	}}
