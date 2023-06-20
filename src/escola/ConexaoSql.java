package escola;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class ConexaoSql{

// Informamos qual o Driver que está sendo utilizado

	private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:3306/escola";
	private static final String USER = "root";
	private static final String PASSWORD = "";
	
	private static Connection conn;

	public static Connection getConexao() {
		
		try {
			if(conn == null) {
				conn = DriverManager.getConnection(URL,USER,PASSWORD);
				return conn;
			}else {
				return conn;
			}
		}catch(SQLException e) {
			e.printStackTrace();
			return null;
		}
		
	}
}