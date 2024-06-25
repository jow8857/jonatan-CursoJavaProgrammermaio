package repositorioCachorro;

import java.util.List;

import entitis.Cachorro;

public interface CachorroRepositorio {

	public boolean CadastrarCachorroDb(Cachorro cachorro);

	public List<Cachorro> retornaListaCachorro();

	public boolean deletarCachorro(String doc);
	
	public boolean alterarCachorro(Cachorro cachorro);
	
	public Cachorro buscaCachorroDoc(String cpf);


}
