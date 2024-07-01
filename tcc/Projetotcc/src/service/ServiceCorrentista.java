package service;

import entitis.CorrentistaBasico;
import repository.RepositoryCorrentistaBasicoImp;

public class ServiceCorrentista {
	
	double calculo = 0.7;
	
	public Double calculaAnuidade(int qtdTransacao) {
		return qtdTransacao * calculo;
	}
	
	
	
	public Integer tratarString(String qtdText) {	
		int qtdTextint;
		try {
			qtdTextint = Integer.parseInt(qtdText);
		} catch (Exception e) {
			System.out.println(e);
		 return null;
		}
		
		return qtdTextint;
	}
	public  CorrentistaBasico ValidarDocNaBase(String cpf) {
		RepositoryCorrentistaBasicoImp correntistaBasicoImp = new RepositoryCorrentistaBasicoImp();
		
		for (CorrentistaBasico correntistaBasico : correntistaBasicoImp.retornaListarCorrentistaBasico()) {
			if (correntistaBasico.getCpF().equals(cpf)) {
				return correntistaBasico;

			}
		}

		return null;
	}
}
