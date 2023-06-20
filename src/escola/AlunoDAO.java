package escola;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class AlunoDAO {
	
	public void cadastrarAluno(aluno aluno) {
		
		String sql = "INSERT INTO ALUNO(matricula, nome) VALUES (?, ?)";
		
		PreparedStatement ps = null;
		
		try {
			ps = ConexaoSql.getConexao().prepareStatement(sql);
			ps.setString(1, aluno.getMatricula());
			ps.setString(2, aluno.getNome());
			
			ps.execute();
			
			ps.close();
			
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		
	}
	
}
