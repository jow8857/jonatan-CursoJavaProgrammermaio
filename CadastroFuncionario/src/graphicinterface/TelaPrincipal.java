package graphicinterface;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.ControllerTelaprincipal;

public class TelaPrincipal {
	
	public void MenuInicial() {
		
		JFrame framemenuinicial = new JFrame();//criei o objeto JFrame
		framemenuinicial.setSize(250, 250);//inclui o tamanhado dosite da janela
		
		JPanel panel = new JPanel();//
		JLabel labe1 = new JLabel("1 para menu gerente" + "\n");//criando um label1 dentro do panel acima
		panel.add(labe1);//adicionando a label dentro do painel panel ---> adiciona a (label).
		
		JLabel label2 = new JLabel("2  para munu atendente");
		panel.add(label2);
		
		
		JTextField input1 = new JTextField(20);
		panel.add(input1);
		
		
		JButton botaoEnviar = new JButton("Enviar");
		panel.add(botaoEnviar);
	
		framemenuinicial.add(panel);
		framemenuinicial.setVisible(true);
	
		ControllerTelaprincipal controller = new ControllerTelaprincipal(input1, framemenuinicial);
		botaoEnviar.addActionListener(controller);
		
	}

}
