package repository;

import java.util.List;

import entitis.CorrentistaBasico;

public interface RepositoryCorrentistaBasico {
	
	public boolean cadastrarCorrentistaBasico(CorrentistaBasico correntistaBasico);
	public List<CorrentistaBasico> retornaListarCorrentistaBasico();

}
