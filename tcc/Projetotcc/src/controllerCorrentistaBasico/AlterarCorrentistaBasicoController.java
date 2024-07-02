package controllerCorrentistaBasico;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

import entitis.CorrentistaBasico;
import entitis.Endereco;
import repository.RepositoryCorrentistaBasicoImp;

public class AlterarCorrentistaBasicoController implements ActionListener {
	JTextField jTextNome;
	JTextField jTextEmail;
	JTextField jTextCep;
	JTextField jTextLocal;
	JTextField jTextLagradourou;
	JTextField jTextUf;

	public AlterarCorrentistaBasicoController(JTextField jTextNome, JTextField jTextEmail, JTextField jTextCep,
			JTextField jTextLocal, JTextField jTextLagradourou, JTextField jTextUf) {
		this.jTextNome = jTextNome;
		this.jTextEmail = jTextEmail;
		this.jTextCep = jTextCep;
		this.jTextLocal = jTextLocal;
		this.jTextLagradourou = jTextLagradourou;
		this.jTextUf = jTextUf;

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand() == "alterar") {
			RepositoryCorrentistaBasicoImp repositoryCorrentistaBasicoImp = new RepositoryCorrentistaBasicoImp();
			CorrentistaBasico correntistaBasico = new CorrentistaBasico();
			Endereco endereco = new Endereco();
			
			
			correntistaBasico.setNome(jTextNome.getText());
			correntistaBasico.setEmail(jTextEmail.getText());
			endereco.setCEP(jTextCep.getText());
			endereco.setLOCALIDADE(jTextLocal.getText());
			endereco.setLAGRADOURO(jTextLagradourou.getText());
			endereco.setUF(jTextUf.getText());
	
			
			repositoryCorrentistaBasicoImp.alterarCorrentistaBasico(correntistaBasico);
			
		}

	}
	

}
