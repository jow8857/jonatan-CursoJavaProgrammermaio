package controllerCorrentistaBasico;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.util.List;

import javax.swing.JTextField;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import entitis.CorrentistaBasico;
import repository.RepositoryCorrentistaBasicoImp;
import service.ServiceCorrentista;

public class ListarCorrentistaBasicoController implements ActionListener {
	RepositoryCorrentistaBasicoImp correntistaBasicoImp = new RepositoryCorrentistaBasicoImp();
	
	boolean opc = false;
	JTextField inputBasico;

	public ListarCorrentistaBasicoController(JTextField inputBasico) {
		this.inputBasico = inputBasico;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		ServiceCorrentista serviceCorrentista = new ServiceCorrentista();

		switch (e.getActionCommand()) {
		case "gerarPDF":
			if (inputBasico.getText().isEmpty()) {
				System.out.println("Preencha o campo antes de prosseguir");
				return;
			}  		 CorrentistaBasico correntistaBasico = serviceCorrentista.ValidarDocNaBase(inputBasico.getText());
			         salvarCadCachorro(correntistaBasico);
			System.out.println("1");
			break;
		case "voltar":
			System.out.println("2");
			break;

		}

	}

	public void salvarCadCachorro(CorrentistaBasico correntistaBasico) {
		
		String enderecoArquivo = "C:\\Users\\jonatan\\Documents\\cursojavaprogrammer\\jonatan-CursoJavaProgrammermaio\\tcc\\Projetotcc\\REGISTRACORRENTISTABASICO.pdf";
		Document document = new Document();
		try {

			PdfWriter.getInstance(document, new FileOutputStream(enderecoArquivo));
			
			document.open();// Abre o documento para receber parametros
			document.add(new Paragraph("O nome do CorrentistaBasico :" + correntistaBasico.getNome())); // Adiciona o paragrafo CFP
			document.add(new Paragraph("CPF do CorrentistaBasico :" + correntistaBasico.getCpF()));
			document.add(new Paragraph("Email do CorrentistaBasico" + correntistaBasico.getEmail()));
			document.add(new Paragraph("Transaçoes feitas Pelo CorrentistaBasico:" + correntistaBasico.getqtdTransacao()));
			document.add(new Paragraph("O limite de saque é :" + correntistaBasico.getValorAnuidade()));// Adicionar o paragrafo NOME
			

			document.close();

		} catch (Exception e) {
			System.out.println("Erro ao registrar o cachorro");
		}
	}

}
