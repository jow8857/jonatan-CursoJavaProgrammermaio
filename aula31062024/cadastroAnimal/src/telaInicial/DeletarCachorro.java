package telaInicial;

import java.awt.Dimension;
import java.awt.TextField;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import controller.controllerDeletarCachorro;
import entitis.Cachorro;

public class DeletarCachorro {
	
	public void ChamarTelaDeletarCachorro(List<Cachorro> listaCachorro) {

		int quantidadeDeLinhas = listaCachorro.size();

		String[][] tabelaString = new String[quantidadeDeLinhas][3];

		int posicaoColuna = 0;
		int posicaoLinha = 0;

		for (Cachorro cachorro : listaCachorro) {

			tabelaString[posicaoLinha][posicaoColuna] = cachorro.getDoc();
			posicaoColuna++;

			tabelaString[posicaoLinha][posicaoColuna] = cachorro.getNome() ;

			posicaoColuna++;
			tabelaString[posicaoLinha][posicaoColuna] = cachorro.getCorPelo();

			posicaoLinha++;
			posicaoColuna = 0;

		}

		String nomeColunas[] = { "cpf", "nome", "cor pelo" };

		JFrame frameDeletarCachorros = new JFrame();

		frameDeletarCachorros.setSize(475, 450);

		JTable tabelaCachorros = new JTable(tabelaString, nomeColunas);
		tabelaCachorros.setSize(1000, 1000);
		tabelaCachorros.setBounds(30, 40, 300, 300);

		JScrollPane scrollPaneListarGerente = new JScrollPane(tabelaCachorros);
		scrollPaneListarGerente.setPreferredSize(new Dimension(400, 160));

		JPanel panelListarCachorro = new JPanel();
		panelListarCachorro.setSize(1000, 1000);

		panelListarCachorro.add(scrollPaneListarGerente);
		
		TextField doc = new TextField(10);
		panelListarCachorro.add(doc);
		
		JButton botaoDeletar = new JButton("Deletar");
		panelListarCachorro.add(botaoDeletar);

		frameDeletarCachorros.add(panelListarCachorro);
		frameDeletarCachorros.setVisible(true);
		
		controllerDeletarCachorro telaDeletarCachorro = new controllerDeletarCachorro(doc, frameDeletarCachorros);
		botaoDeletar.addActionListener(telaDeletarCachorro);

	}
	

}
