package service;

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
}
