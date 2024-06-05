package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

import GerenciaArquivo.ManipularArquivo;
import entitis.Animal;
import entitis.Cachorro;

public class ControllerSalvarCachorro extends Animal implements ActionListener {
	
	JTextField nomeCachorro;
	JTextField cpfCachorro;
	JTextField CorDoPelo;
	
	ManipularArquivo arquivo = new ManipularArquivo();
	
	
	public ControllerSalvarCachorro(JTextField textNomeCachorro, JTextField textCpfCachorro,
			JTextField textlabeCorPelo) {
	 this.nomeCachorro = textNomeCachorro;
	 this.cpfCachorro = textCpfCachorro;
	 this.CorDoPelo = textlabeCorPelo;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		salvaArquivo();
		System.out.println("o nome: " + nomeCachorro.getText());
		System.out.println("o cpf: " + cpfCachorro.getText());
		System.out.println("a cor do pelo: " + CorDoPelo.getText());
		
		
	}
	
	public void salvaArquivo() {
		Cachorro cachorro = new Cachorro();	
		cachorro.setNome(nomeCachorro.getText());
		cachorro.setDoc(cpfCachorro.getText());
		cachorro.setCorPelo(CorDoPelo.getText());
		

		arquivo.salvarCadCachorro(cachorro);
		
	}

}
