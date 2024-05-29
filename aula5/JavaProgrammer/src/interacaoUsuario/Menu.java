package interacaoUsuario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

import entidades.Cachorro;
import entidades.Cobra;

public class Menu {

	public void menuInicial() {

		CaracteristicasAnimais caracteristicasanimais = new CaracteristicasAnimais();

		Cachorro Cachorrolist = new Cachorro();
		List<Cachorro> CachorroLista = new ArrayList<Cachorro>();

		boolean menuResultado = true;

		while (true) {

			int opcao = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 para cahorro" + "\n"
					+ "digite 2 para Cobra" + "\n" + "digite 3 para imprimir Cor do Cachorro" + "\n"));

			switch (opcao) {
			case 1: {
				Cachorrolist = caracteristicasanimais.CaracteristicaCachorro();
				CachorroLista.add(Cachorrolist);
				break;
			}
			case 2: {
				caracteristicasanimais.CaracteristicaCobra();
				break;
			}
			case 3: {
				caracteristicasanimais.imprimirCachorro(CachorroLista);
				break;
			}
			default:
				JOptionPane.showMessageDialog(null, "Insira 1 ou 2");

				break;
			}

		}

	}
}
