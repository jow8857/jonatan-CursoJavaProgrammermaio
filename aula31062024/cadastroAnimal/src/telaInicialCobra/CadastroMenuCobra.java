package telaInicialCobra;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controllerCobra.ControllerSalvarCobra;
import enumm.Enumm;

public class CadastroMenuCobra {
	String nomeCobra = "Digite o nome da Cobra:";
	String cpfCobra = "Digite o doc da cobra:";
	String venenoCobra = "Digite o tipo de veneno da Cobra:";
	String pesoCobra = "Digite o Peso da cobra:";
	String CEP = "Digite o cep: ";

	public void cadastroCobra() {
		JFrame frameCobraCadastro = new JFrame();
		JPanel panelCadastroCobra = new JPanel();
		
		frameCobraCadastro.setSize(200, 200);
		
		frameCobraCadastro.setSize(400, 220);
		panelCadastroCobra.setLayout(new GridLayout(6, 1));

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
		
		JComboBox<Enumm> caixaSelecaoSetor = new JComboBox<>(Enumm.values());
		panelCadastroCobra.add(caixaSelecaoSetor);

		//JTextField textDonaCobra = new JTextField(10);
		//panelCadastroCobra.add(textDonaCobra);
		
		JLabel labelPesoCobra = new JLabel(pesoCobra);
		panelCadastroCobra.add(labelPesoCobra);

		JTextField textValorCobra = new JTextField(10);
		panelCadastroCobra.add(textValorCobra);
		
		JLabel labelcep = new JLabel(CEP);
		panelCadastroCobra.add(labelcep);

		JTextField cepText = new JTextField(10);
		panelCadastroCobra.add(cepText);


		JButton botaoEnviarCadastro = new JButton("cadastrar");
		panelCadastroCobra.add(botaoEnviarCadastro);
		
		JButton botaoVoltar = new JButton("voltar");
		panelCadastroCobra.add(botaoVoltar);
		
		

		frameCobraCadastro.add(panelCadastroCobra);
		frameCobraCadastro.setVisible(true);

		ControllerSalvarCobra controllerSalvarCobra = new ControllerSalvarCobra(textNomeCobra,
				textCpfCobra, caixaSelecaoSetor, frameCobraCadastro, textValorCobra,cepText);
		botaoEnviarCadastro.addActionListener(controllerSalvarCobra);
		botaoVoltar.addActionListener(controllerSalvarCobra);


	}

}
