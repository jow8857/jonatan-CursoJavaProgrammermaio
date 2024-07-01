package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import entitis.CorrentistaBasico;
import webappcorrentistaBasico.AlterarBasico;
import webappcorrentistaBasico.AlterarCorrentistaBasico;
import webappcorrentistaBasico.CadastrarCorrentistaBasico;
import webappcorrentistaBasico.ListarCorrentistaBasico;

public class MenuCorrentistaBasicoController implements ActionListener {
	CadastrarCorrentistaBasico cadastrarCorrentistaBasico = new CadastrarCorrentistaBasico();
	ListarCorrentistaBasico listarCorrentistaBasico = new ListarCorrentistaBasico();
	AlterarCorrentistaBasico alterarCorrentistaBasico = new AlterarCorrentistaBasico();

	@Override
	public void actionPerformed(ActionEvent e) {
		switch (e.getActionCommand()) {
		case "Novo Correntista Basico":
			cadastrarCorrentistaBasico.CadastroCorrentistaBasico();
			System.out.println("op-1");

			break;
		case "Listar correntistas cadastrados":
			listarCorrentistaBasico.listarCorrentistaBasico();
			System.out.println("op-2");

			break;
		case "Alterar Correntista Basico":
			alterarCorrentistaBasico.listarAlterarCorrentistaBasico();
			System.out.println("op-3");

			break;
		case "Deletar correntista":
			System.out.println("op-4");

			break;

		}

	}

}
