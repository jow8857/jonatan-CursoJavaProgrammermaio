package FabricaDeConexao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoDB {

	  private static final String URL = "jdbc:mysql://localhost:3306/teste";
	    private static final String USUARIO = "root";
	    private static final String SENHA = "root";

	    // Método para obter uma conexão com o banco de dados
	    public static Connection conectarDb() {

	    	Connection conexao = null;
	        try {
	            // Registrar o driver JDBC
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            
	            // Estabelecer a conexão
	            conexao = DriverManager.getConnection(URL, USUARIO, SENHA);
	            System.out.println("Conexão com o banco de dados estabelecida!");
	        } catch (ClassNotFoundException | SQLException e) {
	            System.out.println("Erro ao conectar ao banco de dados: " + e.getMessage());
	        }
	        return conexao;
	    }}
		
		