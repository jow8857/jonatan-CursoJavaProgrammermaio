package telaInicial;

import java.util.List;
import java.util.logging.XMLFormatter;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import bancoDeDados.DaoCadastroCobra;
import entitis.Cobra;

public class ListarMenuCobra {
	
	public void cobraLista() {

	DaoCadastroCobra listCobra = new DaoCadastroCobra();

	List<Cobra> listarCobra = listCobra.retornaListaCobra();{
	
	
	int quantidadeDeLinhas = listarCobra.size();
	
	
	String[][] tabela = new String [quantidadeDeLinhas][3];
	
	int coluna = 0;
	int linha = 0;
	
	for(Cobra cobra : listarCobra) {
		
		tabela[linha][coluna] = cobra.getNome();
		coluna ++;
		
		tabela [linha][coluna] = cobra.getDoc();
		
		coluna ++;
		tabela [linha][coluna] = cobra.getVenenosa();
		
		linha ++;
		coluna = 0;
		
	}
	
	String nomeColunas [] = {"nome", "doc", "venenosa"};
	
	
	JFrame frameListarCobra = new JFrame();
	
	frameListarCobra.setSize(500,600);
	
	JTable tabelaCobra = new JTable(tabela, nomeColunas);
	
	tabelaCobra.setBounds(30, 40, 300, 300);
	
	JScrollPane scrollPaneListarCobra = new JScrollPane(tabelaCobra);
	
	JPanel panelListarCobra = new JPanel();
	
	panelListarCobra.add(scrollPaneListarCobra);
	
	frameListarCobra.add(panelListarCobra);
	frameListarCobra.setVisible(true);
	
	
}
}
}