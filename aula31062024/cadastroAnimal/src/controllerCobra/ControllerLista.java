package controllerCobra;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import entitis.Cobra;
import repositorioCobra.CobraRepositorioImp;
import service.EntidadeService;
import telaInicialCobra.TelaMenuCobra;

public class ControllerLista implements ActionListener {
	CobraRepositorioImp cobraRepositorioImp = new CobraRepositorioImp();

	Cobra cobra = new Cobra();
	EntidadeService entidadeService = new EntidadeService();

	JFrame frameListarCobra;
	JTextField inputDoc;

	public ControllerLista(JFrame frameListarCobra, JTextField field) {
		this.frameListarCobra = frameListarCobra;
		this.inputDoc = field;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		switch (e.getActionCommand()) {
		case "voltar":
			TelaMenuCobra telaMenuCobra = new TelaMenuCobra();
			telaMenuCobra.MenuCobra();
			frameListarCobra.setVisible(false);
			break;
		case "gerarPDF":
			Cobra cobra = cobraRepositorioImp.ValidarDocNaBase(inputDoc.getText());

			if (cobra == null || inputDoc.getText().isEmpty()) {
				JOptionPane.showMessageDialog(null, "cobra ou esta vazia ou não existe na base");

			} else {
				System.out.println("passou");
				boolean validar = entidadeService.gerarPdfDetalharCobra(cobra);
				if (validar == true) {
					frameListarCobra.setVisible(false);

				} else {
					JOptionPane.showMessageDialog(null, "erro");
				}
				break;
			}
		}
	}

}
