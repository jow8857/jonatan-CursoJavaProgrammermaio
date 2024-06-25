package telaInicialCachorro;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import dataBase.DaoCadastroCachorro;
import entitis.Cachorro;
import repositorioCachorro.CachorroRepositorioImp;

public class ListarMenuCachorro {

	public void listCachorro() {

		//DaoCadastroCachorro teste = new DaoCadastroCachorro();

		CachorroRepositorioImp repositorio = new CachorroRepositorioImp();
		
		List<Cachorro> listarCachorro = repositorio.retornaListaCachorro();
	
		int quantidadeDeLinhas = listarCachorro.size();{

		String[][] tebela = new String[quantidadeDeLinhas][3];

		int coluna = 0;
		int linha = 0;

		for (Cachorro cachorro : listarCachorro) {

			tebela[linha][coluna] = cachorro.getNome();
			coluna++;

			tebela[linha][coluna] = cachorro.getDoc();

			coluna++;
			tebela[linha][coluna] = cachorro.getDoc();

			linha++;
			coluna = 0;

		}

		String nomeColunas[] = { "nome", "doc", "cor do pelo" };

		JFrame frameListarCachorro = new JFrame();

		frameListarCachorro.setSize(500, 600);

		JTable tabelaCachorro = new JTable(tebela, nomeColunas);

		tabelaCachorro.setBounds(30, 40, 300, 300);

		JScrollPane scrollPaneListarGerente = new JScrollPane(tabelaCachorro);

		JPanel panelListarCachorro = new JPanel();

		panelListarCachorro.add(scrollPaneListarGerente);

		frameListarCachorro.add(panelListarCachorro);
		frameListarCachorro.setVisible(true);

	}

}}
