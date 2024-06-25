package service;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.List;

import javax.swing.JOptionPane;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfDocument;
import com.itextpdf.text.pdf.PdfWriter;

import calidacao.EntidadeValidacao;
import entitis.Cobra;

public class EntidadeService {

	public Double buscarSalarioAtendente(String pesoCobra) {
		Cobra cobra = new Cobra();
		EntidadeValidacao entidadeValidacao = new EntidadeValidacao();
		
		if (entidadeValidacao.validaPeso(pesoCobra)== null) {
			JOptionPane.showMessageDialog(null, "O valor "+ pesoCobra + " Não é valido" );
		}else {
	
			return cobra.CalcularPeso(entidadeValidacao.validaPeso(pesoCobra));
		
		
	
	}
		return null;
	}

	public static boolean gerarPdfDetalharCobra(Cobra cobra) {
		String caminhoArquivo = "C:\\Users\\jonatan\\Documents\\cursojavaprogrammer\\jonatan-CursoJavaProgrammermaio\\aula31062024\\cadastroAnimal\\Cobra.pdf";
		// Caminho do arquivo PDF
		Document document = new Document();

		try {
			PdfWriter.getInstance(document, new FileOutputStream(caminhoArquivo));// Objeto que transfoma o documento
																					// criado em PDF
			if (cobra != null) {
				document.open();// Abre o documento para receber parametros
				document.add(new Paragraph("Doc: " + cobra.getDoc())); // Adiciona o paragrafo CFP
				document.add(new Paragraph("Nome: " + cobra.getNome()));
				document.add(new Paragraph("Venenosa?: " + cobra.getVenenosa()));
				document.add(new Paragraph("Peso: " + cobra.getPeso()));// Adicionar o paragrafo NOME
			}
			document.close();// Finaliza a preparaç2ão do documento
		} catch (Exception e) {
			e.getMessage();
			System.out.println(e);
			return false ;
		}
		return true;

	}

}
