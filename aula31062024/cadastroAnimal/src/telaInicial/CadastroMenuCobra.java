package telaInicial;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.ControllerSalvarCobra;

public class CadastroMenuCobra {
	String nomeCobra = "Digite o nome da Cobra:";
	String cpfCobra = "Digite o doc da cobra:";
	String venenoCobra = "Digite o tipo de veneno da Cobra:";
	String botom = "enviar";

	public void cadastroCobra() {
		JFrame frameCobraCadastro = new JFrame();
		frameCobraCadastro.setSize(200, 200);

		JPanel panelCadastroCobra = new JPanel();

		JLabel labelNomeCobra = new JLabel(nomeCobra);
		panelCadastroCobra.add(labelNomeCobra);

		JTextField textNomeCobra = new JTextField(10);
		panelCadastroCobra.add(textNomeCobra);

		JLabel labeCpfCobra = new JLabel(cpfCobra);
		panelCadastroCobra.add(labeCpfCobra);

		JTextField textCpfCobra = new JTextField(10);
		panelCadastroCobra.add(textCpfCobra);

		JLabel labeDonaCobra = new JLabel(venenoCobra);
		panelCadastroCobra.add(labeDonaCobra);

		JTextField textDonaCobra = new JTextField(10);
		panelCadastroCobra.add(textDonaCobra);

		JButton botaoEnviarCadastro = new JButton(botom);
		panelCadastroCobra.add(botaoEnviarCadastro);

		frameCobraCadastro.add(panelCadastroCobra);
		frameCobraCadastro.setVisible(true);

		ControllerSalvarCobra controllerSalvarCobra = new ControllerSalvarCobra(textNomeCobra,
				textCpfCobra, textDonaCobra);
		botaoEnviarCadastro.addActionListener(controllerSalvarCobra);


	}

}
