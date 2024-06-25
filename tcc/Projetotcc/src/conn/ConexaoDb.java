package conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoDb {

	private static final String URL = "jdbc:mysql://localhost:3306/banco_javaprogrammer?useTimezone=true&serverTimezone=UTC";
	private static final String USUARIO = "root";
	private static final String SENHA = "root";
 
	public static Connection conn() throws SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			return  DriverManager.getConnection(URL, USUARIO, SENHA);      
		} catch (ClassNotFoundException e) {
			throw new SQLException("Driver MySQL não encontrado", e);
		}
	}

	/*
	 * // Método para fechar a conexão com o banco de dados public static void
	 * closeConnDb(Connection connection) { if (connection != null) { try {
	 * connection.close(); System.out.println("Connection close"); } catch
	 * (SQLException e) { e.printStackTrace(); // ou trate de outra forma
	 * System.out.println("Not closed"); } } }
	 */

}
