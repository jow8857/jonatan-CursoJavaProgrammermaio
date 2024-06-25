package telaInicialCobra;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controllerCachorro.ControllerMenuCachorro;
import controllerCobra.ControllerMenuCobra;

public class TelaMenuCobra {
	
	public void MenuCobra() {

		JFrame frameMenuCobra = new JFrame();
		frameMenuCobra.setSize(200, 200);

		JPanel panelCobra = new JPanel();
		
		frameMenuCobra.setSize(280, 220);
		panelCobra.setLayout(new GridLayout(7, 1));

		JLabel opcCadastroCobra = new JLabel("Para cadastrar o Cobra digite 1");
		panelCobra.add(opcCadastroCobra);

		JLabel opclistarCobra = new JLabel("Para listar o Cobra digite 2");
		panelCobra.add(opclistarCobra);
		
		JLabel opcDeletarCobra = new JLabel("Para deletar cobra 3");
		panelCobra.add(opcDeletarCobra);

		JLabel opcAlterarCobra = new JLabel("Para alterar cobra digite 4");
		panelCobra.add(opcAlterarCobra);


		JTextField inputMenuCobra = new JTextField(10);
		panelCobra.add(inputMenuCobra);

		JButton botaoMenuCobra = new JButton("enviar");
		panelCobra.add(botaoMenuCobra);
		
		JButton botaoVoltar = new JButton("voltar");
		panelCobra.add(botaoVoltar);

		frameMenuCobra.add(panelCobra);
		frameMenuCobra.setVisible(true);

		ControllerMenuCobra cadastroMenuCachorro = new ControllerMenuCobra(inputMenuCobra);
		botaoMenuCobra.addActionListener(cadastroMenuCachorro);
		botaoVoltar.addActionListener(cadastroMenuCachorro);


	}
}
