package controllerCobra;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import entitis.Cobra;
import repositorioCobra.CobraRepositorioImp;
import telaInicialCobra.TelaFormularioAlteracao;
import telaInicialCobra.TelaMenuCobra;

public class ControllerAlterar implements ActionListener {

	TelaMenuCobra telaMenuCobra = new TelaMenuCobra();
	CobraRepositorioImp listarCobraRepositorioImp = new CobraRepositorioImp();
	TelaFormularioAlteracao telaFormularioAlteracao = new TelaFormularioAlteracao();

	JFrame fListarCobra;
	JTextField tListarCobra;

	public ControllerAlterar(JFrame frameListarCobra, JTextField jTextField) {
		this.fListarCobra = frameListarCobra;
		this.tListarCobra = jTextField;

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		Cobra cobra = listarCobraRepositorioImp.ValidarDocNaBase(tListarCobra.getText());

		switch (e.getActionCommand()) {
		case "alterar":
			if (tListarCobra.getText().isEmpty() || cobra == null) {
				JOptionPane.showMessageDialog(null, "Favor preencher o campo de alteração ou doc não existe na base");
			} else {
				
				fListarCobra.setVisible(false);
				telaFormularioAlteracao.chamarTelaCobraAlteracao(cobra);

			}

			break;
		case "voltar":
			telaMenuCobra.MenuCobra();
			fListarCobra.setVisible(false);

			break;
		}

	}

}
