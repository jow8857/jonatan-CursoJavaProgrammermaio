package telaInicial;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.ControllerMenuCachorro;

public class TelaMenuCachorro {

	public void MenuCachorro() {

		JFrame frameMenuCachorro = new JFrame();
		frameMenuCachorro.setSize(200, 200);

		JPanel panelCachorro = new JPanel();

		JLabel opcCadastroCachorro = new JLabel("Para cadastrar o cachorro digite 1");
		panelCachorro.add(opcCadastroCachorro);

		JLabel opclistarCachorro = new JLabel("Para listar o cachorro digite 2");
		panelCachorro.add(opclistarCachorro);

		JTextField inputMenuCachorro = new JTextField(10);
		panelCachorro.add(inputMenuCachorro);

		JButton botaoMenuCachorro = new JButton("enviar");
		panelCachorro.add(botaoMenuCachorro);

		frameMenuCachorro.add(panelCachorro);
		frameMenuCachorro.setVisible(true);

		ControllerMenuCachorro cadastroMenuCachorro = new ControllerMenuCachorro(inputMenuCachorro);
		botaoMenuCachorro.addActionListener(cadastroMenuCachorro);

	}
}
