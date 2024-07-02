package controllerCorrentistaBasico;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

import entitis.CorrentistaBasico;
import service.ServiceCorrentista;
import webappcorrentistaBasico.AlterarBasico;

public class ListarAlterarCorrentistaBasicoController implements ActionListener{
	AlterarBasico alterarBasico = new AlterarBasico();
	JTextField inputBasico;
	public ListarAlterarCorrentistaBasicoController(JTextField inputBasico) {
		this.inputBasico = inputBasico;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		ServiceCorrentista serviceCorrentista = new ServiceCorrentista();
		AlterarBasico alterarBasico = new AlterarBasico();

		if(e.getActionCommand().equals("Alterar")) {
			System.out.println("passou alterar");
		//CorrentistaBasico basico = serviceCorrentista.ValidarDocNaBase(inputBasico.getText());
		//basico.getCpF(toString());
		
		alterarBasico.alteraTela(serviceCorrentista.ValidarDocNaBase(inputBasico.getText()));
		}
		else {
			
		}
		
	}

}
