package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import bancoDeDados.DaoCadastroCachorro;
import repositorio.CachorroRepositorio;
import repositorio.CachorroRepositorioImp;
import telaInicial.AlterarCachorro;
import telaInicial.CadastroMenuCachorro;
import telaInicial.DeletarCachorro;
import telaInicial.ListarMenuCachorro;

public class ControllerMenuCachorro implements ActionListener {

	JTextField opcdigitada1;

	CadastroMenuCachorro cadastroMenuCachorro = new CadastroMenuCachorro();
	//DaoCadastroCachorro teste = new DaoCadastroCachorro();
	ListarMenuCachorro listarCachorro = new ListarMenuCachorro();
	DeletarCachorro deletarCachorro = new DeletarCachorro();
	CachorroRepositorioImp cachorroRepositorioImp = new CachorroRepositorioImp();
	AlterarCachorro alteraCachorro = new AlterarCachorro();
	

	public ControllerMenuCachorro(JTextField inputMenuCachorro) {
		this.opcdigitada1 = inputMenuCachorro;
	}

	public void actionPerformed(ActionEvent acaoDoBotaoenviar) {
		
		System.out.println("acessou");
       
		if(opcdigitada1.getText().equals("1") || opcdigitada1.getText().equals("2") || opcdigitada1.getText().equals("3") || opcdigitada1.getText().equals("4")) {
		switch (opcdigitada1.getText()) {
		case "1": {
			cadastroMenuCachorro.cadastroCachorro();
			break;
		}
		case "2": {
			listarCachorro.listCachorro();
			//teste.retornaListaCachorro();
			System.out.println("digitou 2");
			break;
		}
		case "3": {
			System.out.println("digitou 3");
			deletarCachorro.ChamarTelaDeletarCachorro(cachorroRepositorioImp.retornaListaCachorro());
			break;
		}
		case "4": {
			alteraCachorro.listarCachorroParaAlteracao(cachorroRepositorioImp.retornaListaCachorro());
			
			
			System.out.println("digitou 4");
			break;
		}

		}

	}else{
		JOptionPane opcInvalida = new JOptionPane();
		opcInvalida.showMessageDialog(null, "digite uma opc valida");
		
	}}
}