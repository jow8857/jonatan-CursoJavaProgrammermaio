package controllerCobra;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextField;

import repositorioCobra.CobraRepositorioImp;

public class ControllerDeletarCobra implements ActionListener {
	JTextField docCobra = null;
	JFrame frameVisible = null;
	
	CobraRepositorioImp cobraRepositorioImp = new CobraRepositorioImp();
	
	public ControllerDeletarCobra(JTextField doc, JFrame frameVisible) {
		this.docCobra = doc;
		this.frameVisible = frameVisible;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		cobraRepositorioImp.DeletarCobraImplemetacao(docCobra.getText());
		System.out.println("entrou");
		
		
	}

}
