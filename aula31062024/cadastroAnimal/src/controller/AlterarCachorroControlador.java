package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import entitis.Cachorro;
import repositorio.CachorroRepositorioImp;
import telaInicial.TelaFormularioCachorro;

public class AlterarCachorroControlador implements ActionListener {
	

	JTextField cpf;
	JFrame jFrameTelaAlterar;
	
	
	CachorroRepositorioImp cachorroRepositorioImplemetacao = new CachorroRepositorioImp();
	TelaFormularioCachorro alterarCachorro = new TelaFormularioCachorro();

	
	public AlterarCachorroControlador(JTextField cpf, JFrame framealterarGerentes) {
		this.cpf = cpf;
		this.jFrameTelaAlterar = framealterarGerentes;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		Cachorro cachorro  = cachorroRepositorioImplemetacao.buscaCachorroDoc(cpf.getText());
		
		if ( cachorro == null) {
			JOptionPane.showMessageDialog(null, "Não foi encontrado o seguinte CPF: " + cpf.getText() );
		}else {
			jFrameTelaAlterar.setVisible(false);
			alterarCachorro.chamarTelaCadastroCachorro(cachorro);
		}
		
	}


}
