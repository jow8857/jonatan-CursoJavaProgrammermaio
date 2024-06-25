package webappcorrentistaPremium;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.CadastrarCorrentistaPremiumController;

public class CadastrarCorrentistaPremium {
	String nome = "Digite o nome ";
	String cpf = "Digite o Cpf";
	String email = "Digite o e-mail";
	String qtdTransacao = "Digite a qauntidade de transação";
	String valorUnidade = "Valor unitario";
	String cep = "Digite o cep";

	public void CadastroCorrentistaPremium() {
		JFrame framePremium = new JFrame();
		JPanel panelPremium = new JPanel();


		framePremium.setSize(400, 400);
		panelPremium.setLayout(new GridLayout(7, 0));

		JLabel nomeLabel = new JLabel(nome);
		panelPremium.add(nomeLabel);

		JTextField nomeText = new JTextField(10);
		panelPremium.add(nomeText);

		JLabel cpfLabel = new JLabel(cpf);
		panelPremium.add(cpfLabel);

		JTextField cpfText = new JTextField(10);
		panelPremium.add(cpfText);

		JLabel emailLabel = new JLabel(email);
		panelPremium.add(emailLabel);

		JTextField emailPremium = new JTextField(10);
		panelPremium.add(emailPremium);

		JLabel qtdLabel = new JLabel(qtdTransacao);
		panelPremium.add(qtdLabel);

		JTextField qtdText = new JTextField(10);
		panelPremium.add(qtdText);

		JLabel valorLabel = new JLabel(valorUnidade);
		panelPremium.add(valorLabel);

		JTextField valorText = new JTextField(10);
		panelPremium.add(valorText);

		JLabel cepLabel = new JLabel(cep);
		panelPremium.add(cepLabel);

		JTextField cepText = new JTextField(10);
		panelPremium.add(cepText);

		JButton botaoEnviarCadastro = new JButton("cadastrar");
		panelPremium.add(botaoEnviarCadastro);

		JButton botaoVoltar = new JButton("voltar");
		panelPremium.add(botaoVoltar);

		framePremium.add(panelPremium);
		framePremium.setVisible(true);
		
		CadastrarCorrentistaPremiumController cadastrarCorrentistaPremiumController = new CadastrarCorrentistaPremiumController(nomeText,cpfText,emailPremium,qtdText,valorText,cepText,framePremium);
        botaoEnviarCadastro.addActionListener(cadastrarCorrentistaPremiumController);
        botaoVoltar.addActionListener(cadastrarCorrentistaPremiumController);
	}

}
