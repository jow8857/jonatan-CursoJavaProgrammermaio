package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextField;

import webapp.TelaInicialCorrentista;

public class CadastrarCorrentistaPremiumController implements ActionListener {
	TelaInicialCorrentista correntista = new TelaInicialCorrentista();
	
	JTextField nomeField;
	JTextField cpfField;
	JTextField emailField;
	JTextField qtdField;
	JTextField valorfield;
	JTextField cepField;
	JFrame frame;
	  

	public CadastrarCorrentistaPremiumController(JTextField nomeText, JTextField cpfText, JTextField emailPremium,
			JTextField qtdText, JTextField valorText, JTextField cepText, JFrame framePremium) {
		this.nomeField = nomeText;
		this.cpfField = cpfText;
		this.emailField = emailPremium;
		this.qtdField = qtdText;
		this.valorfield = valorText;
		this.cepField = cepText;
		
		
		
		
	        
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getActionCommand().equals("cadastrar")) {
			System.out.println("cadastrar");
			
		}
		else {
			System.out.println("voltar");
			correntista.TelaCorrentista();
		}
		
		
	}


}
