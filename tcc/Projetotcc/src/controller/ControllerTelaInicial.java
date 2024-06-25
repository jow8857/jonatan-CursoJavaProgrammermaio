package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import webappcorrentistaBasico.CadastrarCorrentistaBasico;
import webappcorrentistaBasico.TelaCorrentistaBasico;
import webappcorrentistaPremium.CadastrarCorrentistaPremium;
import webappcorrentistaPremium.TelaCorrentistaPremium;

public class ControllerTelaInicial implements ActionListener {
	TelaCorrentistaBasico correntistaBasico = new TelaCorrentistaBasico();
	TelaCorrentistaPremium correntistaPremium = new TelaCorrentistaPremium();

	
	JFrame frame;
	public ControllerTelaInicial(JFrame frame) {
		this.frame = frame;
		
	}

	@Override
	public void actionPerformed(ActionEvent retornoBotao) {
		switch (retornoBotao.getActionCommand()) {
		case "CORRENTISTA BASICO" :
			correntistaBasico.menuOpcBasico();
			System.out.println("1");
			
			break;
			
			case "CORRENTISTA PREMIUM":
				correntistaPremium.menuOpcPremium();
				System.out.println("2");
				break;

		}
		
	}

}
