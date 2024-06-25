package dataBase;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import entitis.Cachorro;
import entitis.Cobra;

public class DaoCadastroCobra {

	public boolean CadastrarCobraDb(Cobra Cobra) {

		FabricaDeConexao fabricaDeConexao = new FabricaDeConexao();
		Connection connection = null;
		PreparedStatement preparedStatement = null;

		String queryDeInsert = "insert into cd_Cobra(nome, doc, venenosa,peso)values (?, ?, ?,?)";

		try {
			connection = fabricaDeConexao.criarConexaoComCadastrousUario();

			preparedStatement = connection.prepareStatement(queryDeInsert);

			preparedStatement.setString(1, Cobra.getNome());
			preparedStatement.setString(2, Cobra.getDoc());
			preparedStatement.setString(3, Cobra.getVenenosa());
			preparedStatement.setString(4, Double.toString(Cobra.getPeso()));
			

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

	public List<Cobra> retornaListaCobra() {

		String selectCobra = "select * from cd_Cobra";
		List<Cobra> listarCobra = new ArrayList<>();
		FabricaDeConexao fabricaDeConexao = new FabricaDeConexao();
		Connection connection = null; // Cria o objeto de conexão como null
		PreparedStatement preparedStatement = null; // Cria o objeto que prepara o comando SQL
		ResultSet resultadoDaTabelaDoBanco = null;

		try {
			connection = fabricaDeConexao.criarConexaoComCadastrousUario();

			preparedStatement = connection.prepareStatement(selectCobra);
			resultadoDaTabelaDoBanco = preparedStatement.executeQuery();

			while (resultadoDaTabelaDoBanco.next()) {
				Cobra Cobra = new Cobra();

				Cobra.setNome(resultadoDaTabelaDoBanco.getString("nome"));
				Cobra.setDoc(resultadoDaTabelaDoBanco.getString("doc"));
				Cobra.setVenenosa(resultadoDaTabelaDoBanco.getString("venenosa"));
				Cobra.setPeso(resultadoDaTabelaDoBanco.getDouble("peso")); 

				listarCobra.add(Cobra);
			}

		} catch (Exception e) {
			System.out.println("Erro ao buscar a lista de Cobra");
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

		return listarCobra;

	}

	public boolean DeletarCobra(String docCobra) {
		
		boolean deletado = false;

		FabricaDeConexao fabricaDeConexao = new FabricaDeConexao();
		Connection connection = null;
		PreparedStatement preparedStatement = null;

		String queryDeInsert = "delete from cd_cobra where doc = ?";

		try {
			connection = fabricaDeConexao.criarConexaoComCadastrousUario();

			preparedStatement = connection.prepareStatement(queryDeInsert);

			preparedStatement.setString(1, docCobra);

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
		return deletado;
	}
	
	public boolean alterarCobra(Cobra cobra) {

		boolean salvamento = false;
		
		FabricaDeConexao fabricaConexao = new FabricaDeConexao();

		Connection connection = null; 
		
		PreparedStatement preparedStatement = null; 
		
		String comandoSqlUpdate = "UPDATE cd_cobra SET nome = ?, venenosa = ?, peso = ? WHERE doc = ? "; 
																									

		try {
			connection = fabricaConexao.criarConexaoComCadastrousUario(); 
																																										
			preparedStatement = connection.prepareStatement(comandoSqlUpdate);																																	
			
			
			preparedStatement.setString(1, cobra.getNome());
			preparedStatement.setString(4, cobra.getDoc()); 
			preparedStatement.setString(2, cobra.getVenenosa());
			preparedStatement.setString(3, Double.toString(cobra.getPeso()));

			

			preparedStatement.execute(); // Executa o comando no banco de dados

			System.out.println("A Cobra foi registrada");// Log

			salvamento = true; // Se tudo funcionar certo

		} catch (Exception error) {
			System.out.println(error.getMessage());
			System.out.println(" Não foi possivel salvar a Cobra!!!");

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
