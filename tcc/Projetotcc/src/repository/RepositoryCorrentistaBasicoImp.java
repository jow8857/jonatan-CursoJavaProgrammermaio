package repository;

import java.util.List;

import dao.DaoCorrentistaBasico;
import entitis.CorrentistaBasico;

public class RepositoryCorrentistaBasicoImp implements RepositoryCorrentistaBasico {

	@Override
	public boolean cadastrarCorrentistaBasico(CorrentistaBasico correntistaBasico) {
		 DaoCorrentistaBasico daoCorrentistaBasico = new DaoCorrentistaBasico();
		 daoCorrentistaBasico.cadastrarCorrentistaBasico(correntistaBasico);
		return false;
	}

	@Override
	public List<CorrentistaBasico> retornaListarCorrentistaBasico() {
		DaoCorrentistaBasico daoCorrentistaBasico = new DaoCorrentistaBasico();
		return daoCorrentistaBasico.retornaListarCorrentistaBasico();
	}

	@Override
	public boolean alterarCorrentistaBasico(CorrentistaBasico correntistaBasico) {
		DaoCorrentistaBasico daoCorrentistaBasico = new DaoCorrentistaBasico();
		daoCorrentistaBasico.alterarCorrentistaBasico(correntistaBasico);
		
		return false;
	}

	@Override
	public boolean DeletarCorrentistaBasico(String docCorrentistaBasico) {
		DaoCorrentistaBasico daoCorrentistaBasico = new DaoCorrentistaBasico();
		daoCorrentistaBasico.DeletarCorrentistaBasico(docCorrentistaBasico);
		
		return false;
	}



}
