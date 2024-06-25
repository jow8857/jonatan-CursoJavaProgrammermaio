package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import telaInicialCachorro.TelaMenuCachorro;
import telaInicialCobra.TelaMenuCobra;

public class ControllerTelainicial implements ActionListener {
	JTextField opcdigitada;
	JFrame frameInicial;

	public ControllerTelainicial(JTextField inputTexto, JFrame frameInicial) { // criei o construtor com os parametro
																				// recebidos.
		this.opcdigitada = inputTexto;
		this.frameInicial = frameInicial;
	}

	TelaMenuCachorro telaCachorro = new TelaMenuCachorro();
	TelaMenuCobra telaMenuCobra = new TelaMenuCobra();

	public void actionPerformed(ActionEvent e) {


	
			if (opcdigitada.getText().equals("1") || opcdigitada.getText().equals("2")) {

				switch (opcdigitada.getText()) {
				case "1": {
					telaCachorro.MenuCachorro();
					System.out.println("digitou 1");
					frameInicial.setVisible(false);
					break;
				}
				case "2": {
					telaMenuCobra.MenuCobra();
					System.out.println("digitou 2");
					frameInicial.setVisible(false);
					break;
				}
				case "3": {
					System.out.println("digitou 3");
					break;
				}

				}

			} else {
				JOptionPane opcInvalida = new JOptionPane();
				opcInvalida.showMessageDialog(null, "digite uma opc valida");
				

			
		}
	} 	
}
