package telaInicialCobra;

import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import controllerCobra.ControllerAlterar;
import controllerCobra.ControllerLista;
import entitis.Cobra;
import repositorioCobra.CobraRepositorioImp;

public class ListarCobraAlteracao {

	public void alterarCobra() {

		CobraRepositorioImp cobraRepositorioImp = new CobraRepositorioImp();

		List<Cobra> listarCobra = cobraRepositorioImp.retornaListaCobra();
		{

			int quantidadeDeLinhas = listarCobra.size();

			String[][] tabela = new String[quantidadeDeLinhas][4];

			int coluna = 0;
			int linha = 0;

			for (Cobra cobra : listarCobra) {

				tabela[linha][coluna] = cobra.getNome();
				coluna++;

				tabela[linha][coluna] = cobra.getDoc();

				coluna++;
				tabela[linha][coluna] = cobra.getVenenosa();

				coluna++;
				tabela[linha][coluna] = Double.toString(cobra.getPeso());

				linha++;
				coluna = 0;

			}

			String nomeColunas[] = { "nome", "doc", "venenosa", "peso" };

			JFrame frameListarCobra = new JFrame();

			frameListarCobra.setSize(500, 600);

			JTable tabelaCobra = new JTable(tabela, nomeColunas);

			tabelaCobra.setBounds(30, 40, 300, 300);

			JScrollPane scrollPaneListarCobra = new JScrollPane(tabelaCobra);

			JPanel panelListarCobra = new JPanel();

			panelListarCobra.add(scrollPaneListarCobra);

			JTextField jTextField = new JTextField(10);
			panelListarCobra.add(jTextField);

			JButton button = new JButton("alterar");
			panelListarCobra.add(button);

			JButton botaovoltar = new JButton("voltar");
			panelListarCobra.add(botaovoltar);

			frameListarCobra.add(panelListarCobra);
			frameListarCobra.setVisible(true);
			ControllerAlterar controllerAlterar = new ControllerAlterar(frameListarCobra, jTextField);
			button.addActionListener(controllerAlterar);
			botaovoltar.addActionListener(controllerAlterar);

		}
	}
}
