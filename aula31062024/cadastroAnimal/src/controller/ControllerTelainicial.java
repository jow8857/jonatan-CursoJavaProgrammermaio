package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

import telaInicial.TelaMenuCachorro;
import telaInicial.TelaMenuCobra;

public class ControllerTelainicial implements ActionListener {
	

	JTextField opcdigitada;
	
	TelaMenuCachorro telaCachorro = new TelaMenuCachorro();
	TelaMenuCobra telaMenuCobra = new TelaMenuCobra();

	public ControllerTelainicial(JTextField inputTexto) {
		this.opcdigitada = inputTexto;
	}

	public void actionPerformed(ActionEvent e) {
		
		switch (opcdigitada.getText()) {
		case "1": {	
			telaCachorro.MenuCachorro();
			System.out.println("digitou 1");
	    break;
		}
		case "2": {
			telaMenuCobra.MenuCobra();
			System.out.println("digitou 2");
			break;
		}
		case "3": {
			System.out.println("digitou 3");
			break;
		}
		
		
	}
	

}}
  

