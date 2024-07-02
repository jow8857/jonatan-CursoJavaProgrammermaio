package controllerCorrentistaBasico;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import webappcorrentistaBasico.AlterarCorrentistaBasico;
import webappcorrentistaBasico.CadastrarCorrentistaBasico;
import webappcorrentistaBasico.DeletarCorrentista;
import webappcorrentistaBasico.ListarCorrentistaBasico;

public class MenuCorrentistaBasicoController implements ActionListener {
	CadastrarCorrentistaBasico cadastrarCorrentistaBasico = new CadastrarCorrentistaBasico();
	ListarCorrentistaBasico listarCorrentistaBasico = new ListarCorrentistaBasico();
	AlterarCorrentistaBasico alterarCorrentistaBasico = new AlterarCorrentistaBasico();
	DeletarCorrentista deletarCorrentista = new DeletarCorrentista();

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
			deletarCorrentista.deletarCorrentistaBasico();
			System.out.println("op-4");

			break;

		}

	}

}
