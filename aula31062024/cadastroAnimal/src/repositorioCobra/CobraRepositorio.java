package repositorioCobra;

import java.util.List;

import entitis.Cobra;

public interface CobraRepositorio {
	
	
	public boolean CadastrarCobraDb(Cobra cobra,int peso);
	
	public List<Cobra> retornaListaCobra();

	boolean DeletarCobraImplemetacao(String docCobra);

	boolean CadastrarCobraDb(Cobra cobra, String pesoCobra);
	
	public boolean alterarCobra(Cobra cobra);
	
	public Cobra ValidarDocNaBase(String doc);
	
	
	

}
