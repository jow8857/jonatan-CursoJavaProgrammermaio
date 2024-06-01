package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import graphicinterface.TelaGerente;

public class ControllerTelaprincipal implements ActionListener {
	JTextField opcdigitada;
	JFrame jframePrincipal;

	public ControllerTelaprincipal(JTextField opcdigitada, JFrame jframePrincipal) {
		super();
		this.opcdigitada = opcdigitada;
		this.jframePrincipal = jframePrincipal;
	}

	@Override
	public void actionPerformed(ActionEvent clicoubotao) {
		TelaGerente telaGerente = new TelaGerente();

		String opc = opcdigitada.getText();

		if (opc.equals("1") || opc.equals("2")) {

			switch (opc) {
			case "1":
				telaGerente.menuGerente();
				break;
			}
			switch (opc) {
			case "2":
				System.out.println("criar tela de visualizar cadastro");
				break;
			}

		}else {
			JOptionPane.showMessageDialog(null, "Somente 1 ou 2 é Valido");
		}

	}
	
}
