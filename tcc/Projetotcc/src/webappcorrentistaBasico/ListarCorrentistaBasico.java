package webappcorrentistaBasico;

import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import controllerCorrentistaBasico.ListarCorrentistaBasicoController;
import entitis.CorrentistaBasico;
import repository.RepositoryCorrentistaBasicoImp;

public class ListarCorrentistaBasico {

	public void listarCorrentistaBasico() {
		RepositoryCorrentistaBasicoImp correntistaBasicoImp = new RepositoryCorrentistaBasicoImp();

		List<CorrentistaBasico> retornoListar = correntistaBasicoImp.retornaListarCorrentistaBasico();

		String[][] tabela = new String[retornoListar.size()][10];

		int coluna = 0;
		int linha = 0;

		for (CorrentistaBasico correntistaBasico : retornoListar) {

			tabela[linha][coluna] = correntistaBasico.getNome();
			coluna++;

			tabela[linha][coluna] = correntistaBasico.getCpF();

			coluna++;
			tabela[linha][coluna] = correntistaBasico.getEmail();

			coluna++;
			tabela[linha][coluna] = Integer.toString(correntistaBasico.getqtdTransacao());
			coluna++;
			tabela[linha][coluna] = Double.toString(correntistaBasico.getLimiteDeSaque());

			coluna++;
			tabela[linha][coluna] = Double.toString(correntistaBasico.getValorAnuidade());

			coluna++;
			tabela[linha][coluna] = correntistaBasico.getEndereco().getCEP();

			coluna++;
			tabela[linha][coluna] = correntistaBasico.getEndereco().getLOCALIDADE();

			coluna++;
			tabela[linha][coluna] = correntistaBasico.getEndereco().getLAGRADOURO();

			coluna++;
			tabela[linha][coluna] = correntistaBasico.getEndereco().getUF();

			linha++;
			coluna = 0;

		}

		String nomeColunas[] = { "NOME", "CPF", "EMAIL", "QTD TRANSAÇÃO", "LIMITE SAQUE", "VALOR ANUIDADE", "CEP",
				"LOCALIDADE", "LAGRADOURO", "UF" };
		JFrame frameListarBasico = new JFrame();

		frameListarBasico.setSize(900, 600);

		JTable tabelaBasico = new JTable(tabela, nomeColunas);
		tabelaBasico.setPreferredScrollableViewportSize(new Dimension(800, 400)); 
        //tabelaBasico.setBounds(100, 100, 800, 800);

		JScrollPane scrollPaneListarBasico = new JScrollPane(tabelaBasico);

		JPanel panelBasico = new JPanel();

		panelBasico.add(scrollPaneListarBasico);

		JTextField inputBasico = new JTextField(10);
		panelBasico.add(inputBasico);

		JButton button = new JButton("voltar");
		panelBasico.add(button);

		JButton gerarPdfBasico = new JButton("gerarPDF");
		panelBasico.add(gerarPdfBasico);

		frameListarBasico.add(panelBasico);
		frameListarBasico.setVisible(true);
		
		ListarCorrentistaBasicoController listarCorrentistaBasicoController = new ListarCorrentistaBasicoController(inputBasico);
		gerarPdfBasico.addActionListener(listarCorrentistaBasicoController);
		button.addActionListener(listarCorrentistaBasicoController);
	}

}
