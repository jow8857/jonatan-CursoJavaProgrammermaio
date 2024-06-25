package repositorioCobra;

import java.util.List;

import javax.swing.JOptionPane;

import calidacao.EntidadeValidacao;
import dataBase.DaoCadastroCobra;
import entitis.Cobra;
import service.EntidadeService;

public class CobraRepositorioImp implements CobraRepositorio {

	@Override
	public boolean CadastrarCobraDb(Cobra cobra, String pesoCobra) {
		DaoCadastroCobra daoCadastroCobra = new DaoCadastroCobra();
		EntidadeService entidadeService = new EntidadeService();
		if (cobra.getNome().isEmpty() || cobra.getDoc().isEmpty() || cobra.getVenenosa().isEmpty()
				|| pesoCobra.isEmpty()) {
			JOptionPane.showMessageDialog(null, "preencha todos os campos");
			return false;
		}

		cobra.setPeso(entidadeService.buscarSalarioAtendente(pesoCobra));
		return daoCadastroCobra.CadastrarCobraDb(cobra);

	}

	@Override
	public List<Cobra> retornaListaCobra() {
		DaoCadastroCobra cadastroCobra = new DaoCadastroCobra();
		return cadastroCobra.retornaListaCobra();
	}

	@Override
	public boolean DeletarCobraImplemetacao(String docCobra) {
		DaoCadastroCobra cadastroCobra = new DaoCadastroCobra();
		List<Cobra> listaCobras = cadastroCobra.retornaListaCobra();

		if (docCobra.isEmpty()) {
			JOptionPane.showMessageDialog(null, "DIGITE O DOC A SER DELETADO");
			return false;
		}
		for (Cobra cobra : listaCobras) {
			if (cobra.getDoc().equals(docCobra)) {
				cadastroCobra.DeletarCobra(docCobra);
				return true;
			}

		}
		JOptionPane.showMessageDialog(null, "Cobra com DOC " + docCobra + " não encontrada");
		return false; // Ret

	}

	@Override
	public boolean CadastrarCobraDb(Cobra cobra, int peso) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean alterarCobra(Cobra cobra) {
		DaoCadastroCobra cadastroCobra = new DaoCadastroCobra();
		cadastroCobra.alterarCobra(cobra); 

		return false;
	}

	@Override
	public Cobra ValidarDocNaBase(String doc) {
		for (Cobra cobra : retornaListaCobra()) {
			if (cobra.getDoc().equals(doc)) {
				return cobra;

			}
		}

		return null;
	}

}
