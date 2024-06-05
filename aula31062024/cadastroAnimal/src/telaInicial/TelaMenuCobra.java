package telaInicial;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.ControllerMenuCachorro;
import controller.ControllerMenuCobra;

public class TelaMenuCobra {
	
	public void MenuCobra() {

		JFrame frameMenuCobra = new JFrame();
		frameMenuCobra.setSize(200, 200);

		JPanel panelCobra = new JPanel();

		JLabel opcCadastroCobra = new JLabel("Para cadastrar o Cobra digite 1");
		panelCobra.add(opcCadastroCobra);

		JLabel opclistarCobra = new JLabel("Para listar o Cobra digite 2");
		panelCobra.add(opclistarCobra);

		JTextField inputMenuCobra = new JTextField(10);
		panelCobra.add(inputMenuCobra);

		JButton botaoMenuCobra = new JButton("enviar");
		panelCobra.add(botaoMenuCobra);

		frameMenuCobra.add(panelCobra);
		frameMenuCobra.setVisible(true);

		ControllerMenuCobra cadastroMenuCachorro = new ControllerMenuCobra(inputMenuCobra);
		botaoMenuCobra.addActionListener(cadastroMenuCachorro);


	}
}
