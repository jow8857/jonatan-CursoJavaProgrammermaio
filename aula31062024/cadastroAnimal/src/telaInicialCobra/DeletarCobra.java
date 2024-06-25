package telaInicialCobra;

import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import controllerCobra.ControllerDeletarCobra;
import entitis.Cobra;
import repositorioCobra.CobraRepositorioImp;

public class DeletarCobra {

	public void cobraLista() {

		// DaoCadastroCobra listCobra = new DaoCadastroCobra();
		CobraRepositorioImp cobraRepositorioImp = new CobraRepositorioImp();

		List<Cobra> listarCobra = cobraRepositorioImp.retornaListaCobra();
		{

			int quantidadeDeLinhas = listarCobra.size();

			String[][] tabela = new String[quantidadeDeLinhas][3];

			int coluna = 0;
			int linha = 0;

			for (Cobra cobra : listarCobra) {

				tabela[linha][coluna] = cobra.getNome();
				coluna++;

				tabela[linha][coluna] = cobra.getDoc();

				coluna++;
				tabela[linha][coluna] = cobra.getVenenosa();

				linha++;
				coluna = 0;

			}

			String nomeColunas[] = { "nome", "doc", "venenosa" };

			JFrame frameListarCobra = new JFrame();
			JPanel panelListarCobra = new JPanel();

			frameListarCobra.setSize(500, 600);

			JTable tabelaCobra = new JTable(tabela, nomeColunas);

			tabelaCobra.setBounds(30, 40, 300, 300);

			JScrollPane scrollPaneListarCobra = new JScrollPane(tabelaCobra);

			panelListarCobra.add(scrollPaneListarCobra);

			JTextField jTextField = new JTextField(10);
			panelListarCobra.add(jTextField);

			JButton botaoDeletar = new JButton("Delete");
			panelListarCobra.add(botaoDeletar);

			frameListarCobra.add(panelListarCobra);
			frameListarCobra.setVisible(true);
			
			ControllerDeletarCobra controllerDeletarCobra = new ControllerDeletarCobra(jTextField,frameListarCobra);
			botaoDeletar.addActionListener(controllerDeletarCobra);
			
			

		}
	}
}
