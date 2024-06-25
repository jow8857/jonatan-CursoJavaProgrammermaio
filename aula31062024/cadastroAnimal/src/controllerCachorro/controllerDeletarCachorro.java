package controllerCachorro;

import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import repositorioCachorro.CachorroRepositorioImp;
import telaInicialCachorro.TelaMenuCachorro;

public class controllerDeletarCachorro implements ActionListener {

	TextField docRecebido;
	JFrame frameDeletar;
	CachorroRepositorioImp repositorioDeletarCachorro = new CachorroRepositorioImp();
	
	TelaMenuCachorro telaMenuCachorro = new TelaMenuCachorro();
	
	

	public controllerDeletarCachorro(TextField doc,JFrame frameDeletarCachorros) {
		
		this.docRecebido = doc;
		this.frameDeletar = frameDeletarCachorros;
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(repositorioDeletarCachorro.deletarCachorro(docRecebido.getText())) {
			JOptionPane.showMessageDialog(null, "O gerente de cpf " +docRecebido.getText()+ " Foi deletado");
			frameDeletar.setVisible(false);
			telaMenuCachorro.MenuCachorro();
			
		}else {
			JOptionPane.showMessageDialog(null, "O gerente de cpf " +docRecebido.getText()+ " Não foi deletado");
		}
		
		
	}
	
	

}
