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



}
