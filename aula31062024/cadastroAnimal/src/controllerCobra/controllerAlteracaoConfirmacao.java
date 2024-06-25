package controllerCobra;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextField;

import entitis.Cobra;
import repositorioCobra.CobraRepositorioImp;

public class controllerAlteracaoConfirmacao implements ActionListener {
	Cobra cobra = new Cobra();

	JTextField textNome;
	JTextField textVeneno;
	JTextField textPeso;
	String doc;
	JFrame frameCadastroCobra;

	public controllerAlteracaoConfirmacao(JTextField caixaTextoNome, JTextField caixaTextoVeneno,
			JTextField caixaTextoPeso, JFrame frameTelaCadastroCobra, String doc) {
		this.textNome = caixaTextoNome;
		this.textVeneno = caixaTextoVeneno;
		this.textPeso = caixaTextoPeso;
		this.doc = doc;

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		CobraRepositorioImp cobraRepositorioImp = new CobraRepositorioImp();
		Cobra cobra = new Cobra();

		cobra.setNome(textNome.getText());
		cobra.setVenenosa(textVeneno.getText());
		cobra.setPeso(Double.parseDouble(textPeso.getText()));
		cobra.setDoc(doc);

		cobraRepositorioImp.alterarCobra(cobra);

	}

}
