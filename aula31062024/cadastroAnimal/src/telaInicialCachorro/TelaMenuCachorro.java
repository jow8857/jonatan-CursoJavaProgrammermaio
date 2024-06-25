package telaInicialCachorro;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controllerCachorro.ControllerMenuCachorro;
import telaInicial.TelaInicial;

public class TelaMenuCachorro {

	public void MenuCachorro() {

		JFrame frameMenuCachorro = new JFrame();
		JPanel panelCachorro = new JPanel();

		frameMenuCachorro.setSize(200, 200);
		panelCachorro.setLayout(new GridLayout(7, 1));

		JLabel opcCadastroCachorro = new JLabel("Para cadastrar o cachorro digite 1");
		panelCachorro.add(opcCadastroCachorro);

		JLabel opclistarCachorro = new JLabel("Para listar o cachorro digite 2");
		panelCachorro.add(opclistarCachorro);
		
		JLabel opcDeletarCachorro= new JLabel("Para deletar digite 3");
		panelCachorro.add(opcDeletarCachorro);
		
		JLabel opcAlterarCachorro= new JLabel("Para alterar o cachorro digite 4");
		panelCachorro.add(opcAlterarCachorro);

		JTextField inputMenuCachorro = new JTextField(10);
		panelCachorro.add(inputMenuCachorro);

		JButton botaoMenuCachorro = new JButton("enviar");
		panelCachorro.add(botaoMenuCachorro);

		JButton botaoVoltar = new JButton("voltar");
		panelCachorro.add(botaoVoltar);

		frameMenuCachorro.add(panelCachorro);
		frameMenuCachorro.setVisible(true);

		ControllerMenuCachorro cadastroMenuCachorro = new ControllerMenuCachorro(inputMenuCachorro);
		botaoMenuCachorro.addActionListener(cadastroMenuCachorro);
		
		TelaInicial voltarTelaInicial = new TelaInicial();
		botaoVoltar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent acaoDoBotaoVoltar) {
				voltarTelaInicial.menuInicial();
				frameMenuCachorro.setVisible(false);
				
			}
		});
		
		

		
		
		
		

	}
}
