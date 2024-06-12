package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import entitis.Cachorro;
import repositorio.CachorroRepositorioImp;
import telaInicial.TelaMenuCachorro;

public class TelaAlterarCachorroCrontroller implements ActionListener {

	JTextField caixaTextoPrimeiroCampoRecebidoNome;
	String caixaTextoSegundoCampoRecebidoCpf;
	JTextField caixaTextoTerceiroCampoRecebidoGerencia;
	JFrame frameTelaAlterarCachorro;
	
	public TelaAlterarCachorroCrontroller(JTextField caixaTextoPrimeiroCampoRecebidoNome,String caixaTextoSegundoCampoRecebidoCpf, JTextField caixaTextoTerceiroCampoRecebidoGerencia,
			JFrame frameTelaAlterarCachorro) {
		this.caixaTextoPrimeiroCampoRecebidoNome = caixaTextoPrimeiroCampoRecebidoNome;
		this.caixaTextoSegundoCampoRecebidoCpf = caixaTextoSegundoCampoRecebidoCpf;
		this.caixaTextoTerceiroCampoRecebidoGerencia = caixaTextoTerceiroCampoRecebidoGerencia;
		this.frameTelaAlterarCachorro = frameTelaAlterarCachorro;
	}
	CachorroRepositorioImp cachorroRepositorioImplemetacao = new CachorroRepositorioImp();
	TelaMenuCachorro telaMenuCachorro = new TelaMenuCachorro();
	
	@Override
	public void actionPerformed(ActionEvent e) {
		alterarCachorroNoBanco();
		
	}
	
	public void alterarCachorroNoBanco() {
		Cachorro cachorro = new Cachorro();
		cachorro.setNome(caixaTextoPrimeiroCampoRecebidoNome.getText());
		cachorro.setDoc(caixaTextoSegundoCampoRecebidoCpf);
		cachorro.setCorPelo(caixaTextoTerceiroCampoRecebidoGerencia.getText());
		
		if(cachorroRepositorioImplemetacao.alterarCachorro(cachorro)){
			JOptionPane.showMessageDialog(null, "Alterou com sucesso");
			frameTelaAlterarCachorro.setVisible(false);
			telaMenuCachorro.MenuCachorro();
		}else {
			JOptionPane.showMessageDialog(null, "Não Alterou com sucesso");
			
		}
	}
}
