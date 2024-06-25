package controllerCachorro;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import entitis.Cachorro;
import repositorioCachorro.CachorroRepositorioImp;
import telaInicialCachorro.TelaFormularioCachorro;

public class AlterarCachorroControlador implements ActionListener {
	

	JTextField doc;
	JFrame jFrameTelaAlterar;
	
	
	CachorroRepositorioImp cachorroRepositorioImplemetacao = new CachorroRepositorioImp();
	TelaFormularioCachorro alterarCachorro = new TelaFormularioCachorro();

	
	public AlterarCachorroControlador(JTextField doc, JFrame framealterarGerentes) {
		this.doc = doc;
		this.jFrameTelaAlterar = framealterarGerentes;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		Cachorro cachorro  = cachorroRepositorioImplemetacao.buscaCachorroDoc(doc.getText());
		
		if ( cachorro == null) {
			JOptionPane.showMessageDialog(null, "Não foi encontrado o seguinte DOC: " + doc.getText() );
		}else {
			jFrameTelaAlterar.setVisible(false);
			alterarCachorro.chamarTelaCadastroCachorro(cachorro);
		}
		
	}


}
