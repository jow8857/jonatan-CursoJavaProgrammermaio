package webapp;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.ControllerTelaInicial;

public class TelaInicialCorrentista {
	
	public void TelaCorrentista() {
		
		String msgInicial = "<html><div style='text-align: center;'><div style='margin-top: 50px;'>Seja Bem vindo!<br>Selecione qual Opcão desejada :<br></html>";
		String bcorrentistaBasico = "CORRENTISTA BASICO";
		String bCorrentistaPremium = "CORRENTISTA PREMIUM";
		
		JFrame frame = new JFrame();
		JPanel jPanel = new JPanel();
		frame.setSize(250,350);
		
		
		
		JLabel labelBemVindo = new JLabel(msgInicial);
		jPanel.add(labelBemVindo);
		
		JButton correntistaBasico = new JButton(bcorrentistaBasico);
		jPanel.add(correntistaBasico);
		correntistaBasico.setSize(30,30);
		
		JButton CorrentistaPremium = new JButton(bCorrentistaPremium);
		jPanel.add(CorrentistaPremium);

		
		
		frame.add(jPanel);
		frame.setVisible(true);
		
		ControllerTelaInicial controllerTelaInicial = new ControllerTelaInicial(frame);
		correntistaBasico.addActionListener(controllerTelaInicial);
		CorrentistaPremium.addActionListener(controllerTelaInicial);
		
		
	}

}
