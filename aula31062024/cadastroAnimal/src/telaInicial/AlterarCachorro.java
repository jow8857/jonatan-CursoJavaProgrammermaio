package telaInicial;

import java.awt.Dimension;
import java.security.PublicKey;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import controller.AlterarCachorroControlador;
import controller.TelaAlterarCachorroCrontroller;
import entitis.Cachorro;

public class AlterarCachorro {

	public void listarCachorroParaAlteracao(List<Cachorro> retornaListaCachorro) {
		
		int quantidadeDeLinhas = retornaListaCachorro.size();

		String[][] tabelaString = new String[quantidadeDeLinhas][3];

		int coluna = 0;
		int linha = 0;

		for (Cachorro cachorro : retornaListaCachorro) {

			tabelaString[linha][coluna] = cachorro.getNome();
			coluna++;

			tabelaString[linha][coluna] = cachorro.getDoc();

			coluna++;
			tabelaString[linha][coluna] = cachorro.getCorPelo();

			linha++;
			coluna = 0;

		
	    }
		
		String nomeColunas[] = { "nome", "doc", "cor_pelo" };
		
		
		JFrame framelistarAtualizacao = new JFrame();
		framelistarAtualizacao.setSize(200,200);
		
		JTable tabelaCachorro = new JTable(tabelaString, nomeColunas);
		
		
		tabelaCachorro.setSize(1000, 1000);
		tabelaCachorro.setBounds(30, 40, 300, 300);
		
		JScrollPane scrollPaneListarCachorro = new JScrollPane(tabelaCachorro);
		scrollPaneListarCachorro.setPreferredSize(new Dimension(400, 160));

		
		JPanel panelListar= new JPanel();
		panelListar.setSize(1000,100);
		
		
		panelListar.add(scrollPaneListarCachorro);
		
		JTextField doc = new JTextField(10);
		panelListar.add(doc);
		
		
		JButton botaoalterar = new JButton("Alterar");
		panelListar.add(botaoalterar);

		framelistarAtualizacao.add(panelListar);
		framelistarAtualizacao.setVisible(true);

		
		
		
		
		
		AlterarCachorroControlador telaAlterarController = new AlterarCachorroControlador(doc, framelistarAtualizacao);
		botaoalterar.addActionListener(telaAlterarController);
		
	}
		

	}

