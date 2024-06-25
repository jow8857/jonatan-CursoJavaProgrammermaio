package controllerCobra;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

import telaInicial.TelaInicial;
import telaInicialCobra.ListarCobraAlteracao;
import telaInicialCobra.CadastroMenuCobra;
import telaInicialCobra.DeletarCobra;
import telaInicialCobra.ListarMenuCobra;

public class ControllerMenuCobra implements ActionListener {
	JTextField opcdigitada1;

	CadastroMenuCobra cadastroMenuCobra = new CadastroMenuCobra();
	ListarMenuCobra listarCobra1 = new ListarMenuCobra();
	DeletarCobra deletarCobra = new DeletarCobra();
	ListarCobraAlteracao ListarCobraAlteracao = new ListarCobraAlteracao();

	public ControllerMenuCobra(JTextField inputMenuCobra) {
		this.opcdigitada1 = inputMenuCobra;
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("enviar")) {
			switch (opcdigitada1.getText()) {
			case "1": {
				cadastroMenuCobra.cadastroCobra();
				break;
			}
			case "2": {
				listarCobra1.cobraLista();
				break;
			}
			case "3": {
				deletarCobra.cobraLista();
				System.out.println("digitou 3");
				break;
			}
			case "4": {
				ListarCobraAlteracao.alterarCobra();
				System.out.println("digitou 4");
				break;
			}
			}
		} else {
			
			TelaInicial telaInicial = new TelaInicial();
			telaInicial.menuInicial();
		}
	

	}

}
