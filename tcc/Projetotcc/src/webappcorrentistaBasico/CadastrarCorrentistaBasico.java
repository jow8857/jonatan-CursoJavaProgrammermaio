package webappcorrentistaBasico;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.CadastrarCorrentistaBasicoControler;

public class CadastrarCorrentistaBasico {

	String nome = "Digite o nome ";
	String cpf = "Digite o Cpf";
	String email = "Digite o e-mail";
	String qtdTransacao = "Digite a qauntidade de transação";
	String valorUnidade = "Valor Da anuidade";
	String limiteCredito = "Isira o limite de credito";
	String cep = "Digite o cep";

	public void CadastroCorrentistaBasico() {
		JFrame frameBasico = new JFrame();
		JPanel panelBasico = new JPanel();

		frameBasico.setSize(400, 400);
		panelBasico.setLayout(new GridLayout(7, 0));

		JLabel nomeLabel = new JLabel(nome);
		panelBasico.add(nomeLabel);

		JTextField nomeText = new JTextField(10);
		panelBasico.add(nomeText);

		JLabel cpfLabel = new JLabel(cpf);
		panelBasico.add(cpfLabel);

		JTextField cpfText = new JTextField(10);
		panelBasico.add(cpfText);

		JLabel emailLabel = new JLabel(email);
		panelBasico.add(emailLabel);

		JTextField emailBasico = new JTextField(10);
		panelBasico.add(emailBasico);

		JLabel qtdLabel = new JLabel(qtdTransacao);
		panelBasico.add(qtdLabel);

		JTextField qtdText = new JTextField(10);
		panelBasico.add(qtdText);
		
		JLabel limiteCreditoLabel = new JLabel(limiteCredito);
		panelBasico.add(limiteCreditoLabel);

		JTextField limiteCreditoText = new JTextField(10);
		panelBasico.add(limiteCreditoText);

		JLabel cepLabel = new JLabel(cep);
		panelBasico.add(cepLabel);

		JTextField cepText = new JTextField(10);
		panelBasico.add(cepText);

		JButton botaoEnviarCadastro = new JButton("cadastrar");
		panelBasico.add(botaoEnviarCadastro);

		JButton botaoVoltar = new JButton("voltar");
		panelBasico.add(botaoVoltar);

		frameBasico.add(panelBasico);
		frameBasico.setVisible(true);

		CadastrarCorrentistaBasicoControler cadastrarCorrentistaBasicoControler = new CadastrarCorrentistaBasicoControler(
				nomeText, cpfText, emailBasico, qtdText,limiteCreditoText, cepText, frameBasico);
		botaoEnviarCadastro.addActionListener(cadastrarCorrentistaBasicoControler);
		botaoVoltar.addActionListener(cadastrarCorrentistaBasicoControler);

	}

}
