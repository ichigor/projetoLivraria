package csi.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConectaPostGres {
	
	public static Connection conexao(){
		Connection c = null;
		
		try{
			Class.forName("org.postgresql.Driver");
			String url = "jdbc:postgresql://localhost:5432/livraria";
			String user = "postgres";
			String senha = "1234";
			
			c = DriverManager.getConnection(url,user,senha);
			
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return c;
	}
}
