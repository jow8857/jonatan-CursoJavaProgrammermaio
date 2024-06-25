package telaInicialCachorro;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controllerCachorro.TelaAlterarCachorroCrontroller;
import entitis.Cachorro;

public class TelaFormularioCachorro {
	


	public void chamarTelaCadastroCachorro(Cachorro cachorro) {

		GridLayout grid = new GridLayout(0, 1);
		String primeiroCampo = "Digite o nome do cachorro";
		String terceiroCampo = "Digite o doc do cachorro";

		JFrame frameTelaCadastroCachorro = new JFrame();// Instanciando um JFrame Vazio

		frameTelaCadastroCachorro.setSize(400, 400); // Altura e largura
		JPanel panelTelaCadastroCachorro = new JPanel();// Cria o objeto painel
		
		JLabel labelSegundoCampo = new JLabel("DOC: " + cachorro.getDoc() ); // AQUI A GENTE APRESENTA O CPF DO GERENTE SEM A OPÇÃO DE ALTERAR
		panelTelaCadastroCachorro.add(labelSegundoCampo);

	
		JLabel labelPrimeiroCampo = new JLabel(primeiroCampo);
		panelTelaCadastroCachorro.add(labelPrimeiroCampo);

		panelTelaCadastroCachorro.setLayout(grid);

		JTextField caixaTextoPrimeiroCampo = new JTextField(10);
		caixaTextoPrimeiroCampo.setText(cachorro.getNome());//AQUI A GENTE COLOCA O NOME DO GERENTE QUE VAI SER ALTERADO
		panelTelaCadastroCachorro.add(caixaTextoPrimeiroCampo);

		JLabel labelTerceiroCampo = new JLabel(terceiroCampo);
		panelTelaCadastroCachorro.add(labelTerceiroCampo);

		JTextField caixaTextoTerceiroCampo = new JTextField(10);
		caixaTextoTerceiroCampo.setText(cachorro.getCorPelo());// AQUI A GENTE COLOCAR A GERENCIA DO GERENTE QUE VAI SER ALTERADO
		panelTelaCadastroCachorro.add(caixaTextoTerceiroCampo);

		JButton botaoCadastrar = new JButton("Alterar Cachorro");
		panelTelaCadastroCachorro.add(botaoCadastrar);

		frameTelaCadastroCachorro.add(panelTelaCadastroCachorro);
		frameTelaCadastroCachorro.setVisible(true);
		
		TelaAlterarCachorroCrontroller alterarCachorroControlador = new TelaAlterarCachorroCrontroller(caixaTextoPrimeiroCampo, cachorro.getDoc(), caixaTextoTerceiroCampo, frameTelaCadastroCachorro);
		botaoCadastrar.addActionListener(alterarCachorroControlador);
		
		

	
	}

}
