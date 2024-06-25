package repositorioCachorro;

import java.util.List;

import dataBase.DaoCadastroCachorro;
import entitis.Cachorro;

public class CachorroRepositorioImp implements CachorroRepositorio {

	@Override
	public boolean CadastrarCachorroDb(Cachorro cachorro) {
		DaoCadastroCachorro teste = new DaoCadastroCachorro();
		return teste.CadastrarCachorroDb(cachorro);
	}

	@Override
	public List<Cachorro> retornaListaCachorro() {
		DaoCadastroCachorro daolistarCachorro = new DaoCadastroCachorro();
		return daolistarCachorro.retornaListaCachorro();
	}

	@Override
	public boolean deletarCachorro(String doc) {
		DaoCadastroCachorro delCachorro = new DaoCadastroCachorro();
		return delCachorro.deletarCachorro(doc);
	}

	@Override
	public boolean alterarCachorro(Cachorro cachorro) {
		DaoCadastroCachorro daoCadastroCachorro = new DaoCadastroCachorro();
		return daoCadastroCachorro.alterarCachorro(cachorro);
	}

	@Override
	public Cachorro buscaCachorroDoc(String cpf) {
		for(Cachorro cachorro:retornaListaCachorro() ) {
			if(cachorro.getDoc().equals(cpf)) {
				return cachorro;
			}
		}
		return null;
	}



}
