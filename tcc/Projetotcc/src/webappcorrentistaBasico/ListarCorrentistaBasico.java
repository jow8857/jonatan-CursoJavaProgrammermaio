package webappcorrentistaBasico;

import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import entitis.CorrentistaBasico;
import repository.RepositoryCorrentistaBasicoImp;

public class ListarCorrentistaBasico {  
	
	public void listarCorrentistaBasico() {
		RepositoryCorrentistaBasicoImp correntistaBasicoImp = new RepositoryCorrentistaBasicoImp();
		
		  List<CorrentistaBasico> retornoListar = correntistaBasicoImp.retornaListarCorrentistaBasico();

	
		
		
	    String[][] tabela = new String [retornoListar.size()][10];
		
		int coluna = 0;
		int linha = 0;
		
		for(CorrentistaBasico correntistaBasico : retornoListar) {
			
			tabela[linha][coluna] = correntistaBasico.getNome();
			coluna ++;
			
			tabela [linha][coluna] = correntistaBasico.getCpF();
			
			coluna ++;
			tabela [linha][coluna] = correntistaBasico.getEmail();
			
			coluna ++;
			tabela [linha][coluna] = correntistaBasico.getEndereco().getCEP();
			
			coluna ++;
			tabela [linha][coluna] = correntistaBasico.getEndereco().getLOCALIDADE();
			
			coluna ++;
			tabela [linha][coluna] = correntistaBasico.getEndereco().getLAGRADOURO();
			
			coluna ++;
			tabela [linha][coluna] = correntistaBasico.getEndereco().getUF();
			
			coluna ++;
			tabela [linha][coluna] = Integer.toString(correntistaBasico.getqtdTransacao());
			coluna ++;
			tabela [linha][coluna] = Double.toString(correntistaBasico.getLimiteDeSaque());
			
			coluna ++;
			tabela [linha][coluna] = Double.toString(correntistaBasico.getValorAnuidade());
			
			linha ++;
			coluna = 0;
			
		}
		
		String nomeColunas [] = {"NOME", "CPF", "EMAIL","QTD TRANSAÇÃO","LIMITE SAQUE","VALOR ANUIDADE","CEP","LOCALIDADE","LAGRADOURO","UF"};
		JFrame frameListarCobra = new JFrame();
		
		frameListarCobra.setSize(700,700);
		
		JTable tabelaCobra = new JTable(tabela, nomeColunas);
		
		tabelaCobra.setBounds(30, 40, 600, 600);
		
		JScrollPane scrollPaneListarCobra = new JScrollPane(tabelaCobra);
		
		JPanel panelListarCobra = new JPanel();
		
		panelListarCobra.add(scrollPaneListarCobra);
		
		JTextField iputCobra = new JTextField(10);
		panelListarCobra.add(iputCobra);
		
		JButton button = new JButton("voltar");
		panelListarCobra.add(button);
		
		JButton gerarPdfCobra = new JButton("gerarPDF");
		panelListarCobra.add(gerarPdfCobra);
		

		frameListarCobra.add(panelListarCobra);
		frameListarCobra.setVisible(true);
	}

}
