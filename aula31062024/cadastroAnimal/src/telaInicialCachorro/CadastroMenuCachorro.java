package telaInicialCachorro;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controllerCachorro.ControllerSalvarCachorro;

public class CadastroMenuCachorro {
	String nomeCachorro = "Digite o nome do Cachorro:";
	String cpfCachorro = "Digite o cpf do Cachorro:";
	String corPelocachorro = "Digite a cor do pelo do Cachorro:";
	String Cepcachorro = "Digite o Cep";
	String botom = "enviar";

	public void cadastroCachorro() {
		JFrame frameCachorroCadastro = new JFrame();
		frameCachorroCadastro.setSize(200, 200);

		JPanel panelCadastroCachorro = new JPanel();

		frameCachorroCadastro.setSize(280, 220);
		panelCadastroCachorro.setLayout(new GridLayout(4, 1));

		JLabel labelNomeCachorro = new JLabel(nomeCachorro);
		panelCadastroCachorro.add(labelNomeCachorro);

		JTextField textNomeCachorro = new JTextField(10);
		panelCadastroCachorro.add(textNomeCachorro);

		JLabel labeCpfCachorro = new JLabel(cpfCachorro);
		panelCadastroCachorro.add(labeCpfCachorro);

		JTextField textCpfCachorro = new JTextField(10);
		panelCadastroCachorro.add(textCpfCachorro);

		JLabel labeCorPelo = new JLabel(corPelocachorro);
		panelCadastroCachorro.add(labeCorPelo);

		JTextField textlabeCorPelo = new JTextField(10);
		panelCadastroCachorro.add(textlabeCorPelo);
		
		JLabel labeCeP = new JLabel(Cepcachorro);
		panelCadastroCachorro.add(labeCeP);

		JTextField textlabeCep = new JTextField(10);
		panelCadastroCachorro.add(textlabeCep);

		JButton botaoEnviarCadastro = new JButton(botom);
		panelCadastroCachorro.add(botaoEnviarCadastro);

		frameCachorroCadastro.add(panelCadastroCachorro);
		frameCachorroCadastro.setVisible(true);

		ControllerSalvarCachorro controllerSalvarCachorro = new ControllerSalvarCachorro(textNomeCachorro,
				textCpfCachorro, textlabeCorPelo,textlabeCep);
		botaoEnviarCadastro.addActionListener(controllerSalvarCachorro);

	}

}
