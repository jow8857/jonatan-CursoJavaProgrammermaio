package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

import GerenciaArquivo.ManipularArquivo;
import entitis.Cobra;

public class ControllerSalvarCobra implements ActionListener {
	JTextField nomeCobra;
	JTextField cpfCobra;
	JTextField donaCobra;
	
	ManipularArquivo arquivo = new ManipularArquivo();
	
	
	public ControllerSalvarCobra(JTextField textNomeCobra, JTextField textCpfCobra,
			JTextField textDonaCobra) {
	 this.nomeCobra = textNomeCobra;
	 this.cpfCobra = textCpfCobra;
	 this.donaCobra = textDonaCobra;
	}



	public void actionPerformed(ActionEvent e) {
		
		salvaArquivo();
		System.out.println("o nome: " + nomeCobra.getText());
		System.out.println("o cpf: " + cpfCobra.getText());
		System.out.println("a gerencia: " + donaCobra.getText());
		
		
	}
	
	public void salvaArquivo() {
		Cobra Cobra = new Cobra();
		
		Cobra.setNome(nomeCobra.getText());
		Cobra.setDoc(cpfCobra.getText());
		Cobra.setVenenosa(donaCobra.getText());
		
		arquivo.salvarCadCobra(Cobra);
		
	}

}
