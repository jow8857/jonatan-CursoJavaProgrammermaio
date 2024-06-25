package telaInicialCobra;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controllerCobra.controllerAlteracaoConfirmacao;
import entitis.Cobra;
import repositorioCobra.CobraRepositorioImp;

public class TelaFormularioAlteracao {
	
	public void chamarTelaCobraAlteracao(Cobra cobra) {

		GridLayout grid = new GridLayout(0, 1);
		String campoNome = "Digite o nome da cobra";
		String campoVeneno = "Digite o tipo de veneno";
		String peso = "digite o peso";

		JFrame frameTelaCadastroCobra = new JFrame();// Instanciando um JFrame Vazio

		frameTelaCadastroCobra.setSize(200, 250); // Altura e largura
		JPanel panelTelaCadastroCobra = new JPanel();// Cria o objeto painel
		
		JLabel labelDoc = new JLabel("Doc: " + cobra.getDoc() ); // AQUI A GENTE APRESENTA O CPF DO GERENTE SEM A OPÇÃO DE ALTERAR
		panelTelaCadastroCobra.add(labelDoc);

	
		JLabel labelNome = new JLabel(campoNome);
		panelTelaCadastroCobra.add(labelNome);

		panelTelaCadastroCobra.setLayout(grid);

		JTextField caixaTextoNome = new JTextField(10);
		caixaTextoNome.setText(cobra.getNome());//nome a ser atualizado
		panelTelaCadastroCobra.add(caixaTextoNome);

		JLabel labelVeneno = new JLabel(campoVeneno);
		panelTelaCadastroCobra.add(labelVeneno);

		JTextField caixaTextoVeneno = new JTextField(10);
		caixaTextoVeneno.setText(cobra.getVenenosa());
		panelTelaCadastroCobra.add(caixaTextoVeneno);
		
		JLabel labelPeso = new JLabel(peso);
		panelTelaCadastroCobra.add(labelPeso);
		

		JTextField caixaTextoPeso = new JTextField(10);
		caixaTextoPeso.setText(Double.toString(cobra.getPeso()));
		panelTelaCadastroCobra.add(caixaTextoPeso);

		JButton botaoCadastrar = new JButton("Alterar Gerente");
		panelTelaCadastroCobra.add(botaoCadastrar);

		frameTelaCadastroCobra.add(panelTelaCadastroCobra);
		frameTelaCadastroCobra.setVisible(true);
		
		controllerAlteracaoConfirmacao controllerCobraEnviarAtualizacao = new controllerAlteracaoConfirmacao(caixaTextoNome,caixaTextoVeneno,caixaTextoPeso,frameTelaCadastroCobra,cobra.getDoc());
		botaoCadastrar.addActionListener(controllerCobraEnviarAtualizacao);
		

}
	}
