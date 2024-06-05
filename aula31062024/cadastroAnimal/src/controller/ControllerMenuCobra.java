package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

import telaInicial.CadastroMenuCobra;

public class ControllerMenuCobra implements ActionListener {
	JTextField opcdigitada1;

	CadastroMenuCobra cadastroMenuCobra = new CadastroMenuCobra();

	public ControllerMenuCobra(JTextField inputMenuCobra) {
		this.opcdigitada1 = inputMenuCobra;
	}

	public void actionPerformed(ActionEvent e) {

		switch (opcdigitada1.getText()) {
		case "1": {
			cadastroMenuCobra.cadastroCobra();
			break;
		}
		case "2": {
			
			break;
		}
		case "3": {
			System.out.println("digitou 3");
			break;
		}

		}

	}

}
