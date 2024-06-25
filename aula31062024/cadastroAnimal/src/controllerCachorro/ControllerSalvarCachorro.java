package controllerCachorro;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

import GerenciaArquivo.ManipularArquivo;
import dataBase.DaoCadastroCachorro;
import entitis.Animal;
import entitis.Cachorro;
import repositorioCachorro.CachorroRepositorioImp;

public class ControllerSalvarCachorro extends Animal implements ActionListener {
	
	JTextField nomeCachorro;
	JTextField cpfCachorro;
	JTextField CorDoPelo;
	JTextField textlabeCep;
	
	
	ManipularArquivo arquivo = new ManipularArquivo();
   	
	CachorroRepositorioImp repositorio = new CachorroRepositorioImp();
	
	
	public ControllerSalvarCachorro(JTextField textNomeCachorro, JTextField textCpfCachorro,
			JTextField textlabeCorPelo,JTextField textlabeCep) {
	 this.nomeCachorro = textNomeCachorro;
	 this.cpfCachorro = textCpfCachorro;
	 this.CorDoPelo = textlabeCorPelo;
	 this.textlabeCep = textlabeCep;
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
		

		//arquivo.salvarCadCachorro(cachorro);
		//daoCadastroCachorro.CadastrarCachorroDb(cachorro);
		repositorio.CadastrarCachorroDb(cachorro);
		
		
	}

}
