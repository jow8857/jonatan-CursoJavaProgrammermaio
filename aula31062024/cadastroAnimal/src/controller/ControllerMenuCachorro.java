package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

import telaInicial.CadastroMenuCachorro;

public class ControllerMenuCachorro implements ActionListener {

	JTextField opcdigitada1;

	CadastroMenuCachorro cadastroMenuCachorro = new CadastroMenuCachorro();

	public ControllerMenuCachorro(JTextField inputMenuCachorro) {
		this.opcdigitada1 = inputMenuCachorro;
	}

	public void actionPerformed(ActionEvent e) {

		switch (opcdigitada1.getText()) {
		case "1": {
			cadastroMenuCachorro.cadastroCachorro();
			break;
		}
		case "2": {
			System.out.println("digitou 2");
			break;
		}
		case "3": {
			System.out.println("digitou 3");
			break;
		}

		}

	}
}