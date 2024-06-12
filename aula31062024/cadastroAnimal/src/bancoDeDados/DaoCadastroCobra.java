package bancoDeDados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import entitis.Cobra;
import entitis.Cobra;

public class DaoCadastroCobra {
	
	public boolean CadastrarCobraDb(Cobra cobra) {

		FabricaDeConexao fabricaDeConexao = new FabricaDeConexao();
		Connection connection = null;
		PreparedStatement preparedStatement = null;

		String queryDeInsert = "insert into cd_Cobra(nome, doc, venenosa)values (?, ?, ?)";

		try { connection = fabricaDeConexao.criarConexaoComCadastrousUario();
		
		preparedStatement = connection.prepareStatement(queryDeInsert);
		
		preparedStatement.setString(1, cobra.getNome());
		preparedStatement.setString(2, cobra.getDoc());
		preparedStatement.setString(3, cobra.getVenenosa());
		
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
  return true;
}
	
public List<Cobra> retornaListaCobra(){
		
		String selectCobra = "select * from cd_Cobra";
		List<Cobra> listarCobra = new ArrayList<>();
		FabricaDeConexao fabricaDeConexao = new FabricaDeConexao();
		Connection connection = null; // Cria o objeto de conexão como null
		PreparedStatement preparedStatement = null; // Cria o objeto que prepara o comando SQL
		ResultSet resultadoDaTabelaDoBanco = null;
		
		try { connection = fabricaDeConexao.criarConexaoComCadastrousUario();
		     
		      preparedStatement = connection.prepareStatement(selectCobra);
		      resultadoDaTabelaDoBanco = preparedStatement.executeQuery();
		      
			
		  	
				while (resultadoDaTabelaDoBanco.next()) {
					Cobra Cobra = new Cobra();
					
					Cobra.setNome(resultadoDaTabelaDoBanco.getString("nome"));
					Cobra.setDoc(resultadoDaTabelaDoBanco.getString("doc"));
					Cobra.setVenenosa(resultadoDaTabelaDoBanco.getString("venenosa"));
					
					listarCobra.add(Cobra);
				}
				
			} catch (Exception e) {
				System.out.println("Erro ao buscar a lista de Cobra");
			}finally { // Esse é obrigatorio
				try {
					if(connection != null) {
						connection.close();//Se objeto connectionBaseExemplo estiver aberto essa linha vai encerrar
					}
					if(preparedStatement != null) {//Se objeto preparaOcomandoSQL estiver aberto essa linha vai encerrar
						preparedStatement.close();
					}
					
				} catch (Exception e2) {
					System.out.println("Não foi possivel fechar a conexão!!");
				}
			}
			
			
			
			
			
			return listarCobra;
			
			
		}

}
