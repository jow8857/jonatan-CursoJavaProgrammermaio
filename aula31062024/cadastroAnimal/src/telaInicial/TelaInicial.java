package telaInicial;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.ControllerTelainicial;

public class TelaInicial {

	public void menuInicial() {

     	JFrame frameInicial = new JFrame();
		JPanel panel = new JPanel();

		frameInicial.setSize(200, 200);

		JLabel cadastrocachorro = new JLabel("digite 1 para cadastrar o cachorro");
		panel.add(cadastrocachorro);

		JLabel cadastroCobra = new JLabel("digite 2 para cadastrar cobra");
		panel.add(cadastroCobra);

		JTextField inputTexto = new JTextField(10);
		panel.add(inputTexto);

		JButton botaoEnviar = new JButton("enviar");
		panel.add(botaoEnviar);

		frameInicial.add(panel);
		frameInicial.setVisible(true);

		ControllerTelainicial controllerTelainicial = new ControllerTelainicial(inputTexto);
		botaoEnviar.addActionListener(controllerTelainicial);

	}
}
