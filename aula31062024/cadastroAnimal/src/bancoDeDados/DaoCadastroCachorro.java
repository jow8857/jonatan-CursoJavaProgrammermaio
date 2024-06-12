package bancoDeDados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import entitis.Cachorro;

public class DaoCadastroCachorro {

	public boolean CadastrarCachorroDb(Cachorro cachorro) {

		FabricaDeConexao fabricaDeConexao = new FabricaDeConexao();
		Connection connection = null;
		PreparedStatement preparedStatement = null;

		String queryDeInsert = "insert into cd_cachorro(nome, doc, cor_pelo)values (?, ?, ?)";

		try {
			connection = fabricaDeConexao.criarConexaoComCadastrousUario();

			preparedStatement = connection.prepareStatement(queryDeInsert);

			preparedStatement.setString(1, cachorro.getNome());
			preparedStatement.setString(2, cachorro.getDoc());
			preparedStatement.setString(3, cachorro.getCorPelo());

			preparedStatement.execute();

			System.out.println("processo feito corretamente");
		} catch (Exception e) {
			System.out.println(e + "processo com falha");

		} finally {
			try {

				if (preparedStatement != null) {
					preparedStatement.close();

				}
				if (connection != null) {
					connection.close();

				}

			} catch (Exception e2) {
				System.out.println(e2 + "não fechou a conexão");
			}
		}
		return true;
	}

	public List<Cachorro> retornaListaCachorro() {

		String selectCachorro = "select * from cd_cachorro";
		List<Cachorro> listarCachorro = new ArrayList<>();
		FabricaDeConexao fabricaDeConexao = new FabricaDeConexao();
		Connection connection = null; // Cria o objeto de conexão como null
		PreparedStatement preparedStatement = null; // Cria o objeto que prepara o comando SQL
		ResultSet resultadoDaTabelaDoBanco = null;

		try {
			connection = fabricaDeConexao.criarConexaoComCadastrousUario();

			preparedStatement = connection.prepareStatement(selectCachorro);
			resultadoDaTabelaDoBanco = preparedStatement.executeQuery();

			while (resultadoDaTabelaDoBanco.next()) {
				Cachorro cachorro = new Cachorro();

				cachorro.setNome(resultadoDaTabelaDoBanco.getString("nome"));
				cachorro.setDoc(resultadoDaTabelaDoBanco.getString("doc"));
				cachorro.setCorPelo(resultadoDaTabelaDoBanco.getString("cor_pelo"));

				listarCachorro.add(cachorro);
			}

		} catch (Exception e) {
			System.out.println("Erro ao buscar a lista de cachorro");
		} finally { // Esse é obrigatorio
			try {
				if (connection != null) {
					connection.close();// Se objeto connectionBaseExemplo estiver aberto essa linha vai encerrar
				}
				if (preparedStatement != null) {// Se objeto preparaOcomandoSQL estiver aberto essa linha vai encerrar
					preparedStatement.close();
				}

			} catch (Exception e2) {
				System.out.println("Não foi possivel fechar a conexão!!");
			}
		}

		return listarCachorro;

	}
	
	public boolean deletarCachorro(String doc) {

		FabricaDeConexao fabricaDeConexao = new FabricaDeConexao();
		Connection connection = null;
		PreparedStatement preparedStatement = null;

		String queryDelete = "delete from cd_cachorro where doc = ?";

		try { connection = fabricaDeConexao.criarConexaoComCadastrousUario();
		
		preparedStatement = connection.prepareStatement(queryDelete);
		
		preparedStatement.setString(1, doc);
		
		preparedStatement.execute();
		
		System.out.println("processo feito corretamente");
		} catch (Exception e) {
			System.out.println(e + "processo com falha");
			
		}finally {
			try {
				
				if(preparedStatement != null) {
					preparedStatement.close();
					
				}if (connection != null){
					connection.close();
					
				}
				
			} catch (Exception e2) {
				System.out.println(e2 + "não fechou a conexão");
			}
		}
  return deletarCachorro(doc);
}
	
	public boolean alterarCachorro(Cachorro cachorro) {

		boolean salvamento = false;
		
		FabricaDeConexao fabricaConexao = new FabricaDeConexao();

		Connection connection = null; 
		
		PreparedStatement preparedStatement = null; 
		
		String comandoSqlUpdate = "UPDATE cd_cachorro SET nome = ?, doc = ? WHERE cor_pelo = ? "; 
																									

		try {
			connection = fabricaConexao.criarConexaoComCadastrousUario(); 
																																										
			preparedStatement = connection.prepareStatement(comandoSqlUpdate);																																	
			
			
			preparedStatement.setString(1, cachorro.getNome());
			preparedStatement.setString(2, cachorro.getDoc()); 
			preparedStatement.setString(3, cachorro.getCorPelo());
			

			preparedStatement.execute(); // Executa o comando no banco de dados

			System.out.println("A pessoa foi registrada");// Log

			salvamento = true; // Se tudo funcionar certo

		} catch (Exception error) {
			System.out.println(error.getMessage());
			System.out.println(" Não foi possivel salvar a pessoa!!!");

		} finally { // Esse é obrigatorio
			try {
				if (connection != null) {
					connection.close();    // Se objeto connectionBaseExemplo estiver aberto essa linha vai
													// encerrar
				}
				if (preparedStatement != null) {// Se objeto preparaOcomandoSQL estiver aberto essa linha vai encerrar
					preparedStatement.close();
				}

			} catch (Exception e2) {
				System.out.println("Não foi possivel fechar a conexão!!");
			}

		}

		return salvamento;

	}
	
}
