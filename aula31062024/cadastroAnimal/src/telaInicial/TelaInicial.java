package telaInicial;


import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.ControllerTelainicial;

public class TelaInicial {

	public void menuInicial() {   					//metodo sem retorno 

		JFrame frameInicial = new JFrame(); 		//estanciando o objeto JFrame objeto nativo do java
		JPanel panel = new JPanel();  				//estanciando o objeto Jpanel 

		frameInicial.setSize(280, 220);				//seta o tamanho do frame 
		panel.setLayout(new GridLayout(4, 1));		// seta um layout gri no painel

		JLabel cadastrocachorro = new JLabel("digite 1 para cadastrar o cachorro");//cria umalabel 
		panel.add(cadastrocachorro);				//adiona o label Cadastrocachorro dento do painel panel <-add--- cadastrocachorro

		JLabel cadastroCobra = new JLabel("digite 2 para cadastrar cobra");
		panel.add(cadastroCobra);

		JTextField inputTexto = new JTextField(10);		// adiona um input com tamanho de 10
		panel.add(inputTexto);              //add o input dentro do painel painel <-add-- input

		JButton botaoEnviar = new JButton("enviar"); //cria o objeto jbutton um botão
		panel.add(botaoEnviar);   //add o botão dentro do panel ----painel <-add-- botaoEnviar

		frameInicial.add(panel);  //adiciona o painel dentro do frame frameInicial <-add- panel
		frameInicial.setVisible(true); //seta a visibiliadae do frame 

		ControllerTelainicial controllerTelainicial = new ControllerTelainicial(inputTexto, frameInicial); //estanciando a classe ControllerTelainicial passando os parametro para o construtor
		
		botaoEnviar.addActionListener(controllerTelainicial);// adiciona o evento de addActionListener quando fazer o click.
		
		

	}


}
