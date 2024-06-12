package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

import bancoDeDados.DaoCadastroCobra;
import telaInicial.CadastroMenuCobra;
import telaInicial.ListarMenuCobra;

public class ControllerMenuCobra implements ActionListener {
	JTextField opcdigitada1;

	CadastroMenuCobra cadastroMenuCobra = new CadastroMenuCobra();
	ListarMenuCobra listarCobra1 = new ListarMenuCobra();

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
			listarCobra1.cobraLista();
			break;
		}
		case "3": {
			System.out.println("digitou 3");
			break;
		}

		}

	}

}
