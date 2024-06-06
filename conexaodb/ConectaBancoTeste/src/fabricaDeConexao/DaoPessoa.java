package FabricaDeConexao;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class DaoPessoa {
	  public void inserirPessoaDb(Pessoa pessoa) {
		  ConexaoDB conexaoDb  = new ConexaoDB();
		   
		   Connection conectadb1;
		  
		   PreparedStatement praparaQuery;
		   
		   String query = "insert into teste(cpf, nome, email)values(?, ?, ?)";
		   
		   try {
			   conectadb1 = conexaoDb.conectarDb();
			   
			   praparaQuery = conectadb1.prepareStatement(query);
			   
			   praparaQuery.setString(1, pessoa.getCpf());// Coloca o valor no campo cpf
			   praparaQuery.setString(2, pessoa.getNome()); // Colocar o valor no campo nome
			   praparaQuery.setString(3, pessoa.getEmail()); // Colocar o valor no campo email
			   
			   praparaQuery.execute();
			   
			   System.out.println("A pessoa foi inserida!");
			
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("não foi possivel cadastrar a pessoa");
		}finally {
			
		}
	
	
	  }
}