package controllerCorrentistaBasico;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

import entitis.CorrentistaBasico;
import repository.RepositoryCorrentistaBasicoImp;
import service.ServiceCorrentista;

public class DeletarCorrentistaBasicoController implements ActionListener {
	JTextField inputBasico;

	public DeletarCorrentistaBasicoController(JTextField inputBasico) {
		this.inputBasico = inputBasico;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		ServiceCorrentista correntista = new ServiceCorrentista(); 
		RepositoryCorrentistaBasicoImp basicoImp = new RepositoryCorrentistaBasicoImp();
		if (e.getActionCommand() == "deletar") {
			  CorrentistaBasico Basico  =  correntista.ValidarDocNaBase(inputBasico.getText());
			basicoImp.DeletarCorrentistaBasico(Basico.getCpF());
		}
		
	}

}
