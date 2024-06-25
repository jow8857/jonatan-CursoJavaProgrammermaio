package controllerCobra;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import GerenciaArquivo.ManipularArquivo;
import client.ViaCepCliente;
import entitis.CEPEndereco;
import entitis.Cobra;
import enumm.Enumm;
import repositorioCobra.CobraRepositorioImp;
import telaInicialCobra.CadastroMenuCobra;
import telaInicialCobra.TelaMenuCobra;

public class ControllerSalvarCobra implements ActionListener {
	CEPEndereco cepEndereco = new CEPEndereco();
	JTextField nomeCobra;
	JTextField cpfCobra;
	JComboBox<Enumm> veneno;
	JTextField pesoCobra;
	JFrame frameTelaMenu;
	JTextField cepText;

	ManipularArquivo arquivo = new ManipularArquivo();
	CobraRepositorioImp cobraRepositorioImp = new CobraRepositorioImp();
	CadastroMenuCobra teste = new CadastroMenuCobra();

	public ControllerSalvarCobra(JTextField textNomeCobra, JTextField textCpfCobra, JComboBox<Enumm> caixaSelecaoSetor,
			JFrame frameTelaMenu, JTextField textValorCobra, JTextField cepText) {
		this.nomeCobra = textNomeCobra;
		this.cpfCobra = textCpfCobra;
		this.veneno = caixaSelecaoSetor;
		this.pesoCobra = textValorCobra;
		this.frameTelaMenu = frameTelaMenu;
		this.cepText = cepText;

	}

	public boolean salvaArquivo() {
		Cobra Cobra = new Cobra();
		Cobra.setNome(nomeCobra.getText());
		Cobra.setDoc(cpfCobra.getText());
		Cobra.setVenenosa(veneno.getSelectedItem().toString());
		cepEndereco.getBairro();
		cepEndereco.getCep();
		cepEndereco.getLogradouro();
		cepEndereco.getLocalidade();

		return cobraRepositorioImp.CadastrarCobraDb(Cobra, pesoCobra.getText());

	}

	public void actionPerformed(ActionEvent botao) {
		

		switch (botao.getActionCommand()) {
		case "cadastrar":
			try {
				cepEndereco = ViaCepCliente.BuscarClienteApi(cepText.getText());
				int opcao = JOptionPane.showConfirmDialog(null, cepEndereco, "Confirmação", // título da janela
						JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

				if (opcao == JOptionPane.YES_OPTION) {
					salvaArquivo();
				} else if (opcao == JOptionPane.NO_OPTION) {
					TelaMenuCobra telaMenuCobra = new TelaMenuCobra();
					teste.cadastroCobra();
					frameTelaMenu.setVisible(false);
					telaMenuCobra.MenuCobra();
				}
			} catch (Exception e) {
				System.out.println(e);
				e.printStackTrace();
			}
			// if (salvaArquivo()) {

			// voltarTelaMenu.MenuCobra();
			// System.out.println("o nome: " + nomeCobra.getText() + "o cpf: " +
			// cpfCobra.getText() + "doc : "
			// + veneno.getSelectedItem().toString());
			// }

			break;
		case "voltar":
			TelaMenuCobra telaMenuCobra = new TelaMenuCobra();
			frameTelaMenu.setVisible(false);
			telaMenuCobra.MenuCobra();
			break;

		}

	}

}
