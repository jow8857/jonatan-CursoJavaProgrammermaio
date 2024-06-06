package principal;

import FabricaDeConexao.ConexaoDB;
import FabricaDeConexao.DaoPessoa;
import FabricaDeConexao.Pessoa;

public class Main {

	public static void main(String[] args) {
		//ConexaoDB conexaoDb = new ConexaoDB();
		//ConexaoDB.conectarDb();
		
		DaoPessoa daoPessoa = new DaoPessoa();
		Pessoa pessoa = new Pessoa();
		pessoa.setCpf("031");
		pessoa.setNome("jonatan");
        pessoa.setEmail("edu@gmail.com");
		
		daoPessoa.inserirPessoaDb(pessoa);
		

	}

}
