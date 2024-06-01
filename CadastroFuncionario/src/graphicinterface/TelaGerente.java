package graphicinterface;

import java.util.jar.JarInputStream;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaGerente {

	public void menuGerente() {

		JFrame Gerente = new JFrame();
		Gerente.setSize(250, 250);

		JPanel panel = new JPanel();

		JLabel cadastroGerente = new JLabel("deseja cadastrar o gerente, digite 1");
		panel.add(cadastroGerente);

		JLabel visualizarGerentes = new JLabel("deseja cadastrar o gerente, digite 1");
		panel.add(visualizarGerentes);

		JTextField input2 = new JTextField(12);
		panel.add(input2);

		JButton botaoEnviar2 = new JButton("Enviar");
		panel.add(botaoEnviar2);
		
		Gerente.add(panel);
		Gerente.setVisible(true);
		
		

	}

}
