package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import webappcorrentistaBasico.CadastrarCorrentistaBasico;

public class MenuCorrentistaBasicoController implements ActionListener {
	CadastrarCorrentistaBasico cadastrarCorrentistaBasico = new CadastrarCorrentistaBasico();

	@Override
	public void actionPerformed(ActionEvent e) {
		switch (e.getActionCommand()) {
		case "Novo Correntista Basico":
			cadastrarCorrentistaBasico.CadastroCorrentistaBasico();
			System.out.println("op-1");

			break;
		case "Listar correntistas cadastrados":
			System.out.println("op-2");

			break;
		case "Alterar Correntista Basico":
			System.out.println("op-3");

			break;
		case "Deletar correntista":
			System.out.println("op-4");

			break;

		}

	}

}
