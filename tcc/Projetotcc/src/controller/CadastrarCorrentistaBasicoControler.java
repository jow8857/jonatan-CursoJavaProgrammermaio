package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import client.ClientApiViaCep;
import dao.DaoCorrentistaBasico;
import entitis.Correntista;
import entitis.CorrentistaBasico;
import repository.RepositoryCorrentistaBasicoImp;
import service.ServiceCorrentista;

public class CadastrarCorrentistaBasicoControler implements ActionListener {
	ServiceCorrentista serviceCorrentista = new ServiceCorrentista();

	JTextField nomeText;
	JTextField cpfText;
	JTextField emailPlus;
	JTextField qtdText;
	JTextField limiteCreditoText;
	JTextField cepText;
	JFrame framePlus;

	public CadastrarCorrentistaBasicoControler(JTextField nomeText, JTextField cpfText, JTextField emailPlus,
			JTextField qtdText,JTextField limiteCreditoText, JTextField cepText, JFrame framePlus) {
		this.nomeText = nomeText;
		this.cpfText = cpfText;
		this.emailPlus = emailPlus;
		this.qtdText = qtdText;
		this.limiteCreditoText = limiteCreditoText;
		this.cepText = cepText;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		RepositoryCorrentistaBasicoImp repositoryCorrentistaBasico = new RepositoryCorrentistaBasicoImp();
        
		Double valorAnuidade = serviceCorrentista.calculaAnuidade(serviceCorrentista.tratarString(qtdText.getText()));
		
		CorrentistaBasico correntistaBasico = new CorrentistaBasico();

		// DaoCorrentistaPlus correntistaPlus = new DaoCorrentistaPlus();
		if (e.getActionCommand().equals("cadastrar")) {
			
			if(nomeText.getText().isEmpty() || cpfText.getText().isEmpty() || emailPlus.getText().isEmpty() || cepText.getText().isEmpty() || limiteCreditoText.getText().isEmpty()) {
				JOptionPane.showMessageDialog(null, "Preencha todos os campos");
	
			}else
			
			JOptionPane.showMessageDialog(null, "Valor da anuidade " + valorAnuidade);
		
			repositoryCorrentistaBasico.cadastrarCorrentistaBasico(salvarDados(correntistaBasico, valorAnuidade));

			System.out.println("1");

		} else {
			System.out.println("2");
		}

	}

	public CorrentistaBasico salvarDados(CorrentistaBasico correntistaBasico, Double valorAnuidade) {

		try {
			correntistaBasico.setEndereco(ClientApiViaCep.BuscarClienteApi(cepText.getText()));
		} catch (Exception e) {
			e.printStackTrace();
		}

		correntistaBasico.setNome(nomeText.getText());
		correntistaBasico.setCpF(cpfText.getText());
		correntistaBasico.setEmail(emailPlus.getText());
		correntistaBasico.setqtdTransacao(Integer.parseInt(qtdText.getText()));
		correntistaBasico.setValorAnuidade(valorAnuidade);
		correntistaBasico.setLimiteDeSaque(Double.parseDouble(limiteCreditoText.getText()));
		correntistaBasico.getEndereco().getCEP();
		correntistaBasico.getEndereco().getLOCALIDADE();
		correntistaBasico.getEndereco().getLAGRADOURO();
		correntistaBasico.getEndereco().getUF();

		return correntistaBasico;

	}

}
