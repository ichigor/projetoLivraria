package csi.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import csi.model.Cliente;
import csi.util.ConectaPostGres;

public class ClienteDAO {
	public static void main(String args[]){
		ConectaPostGres.conexao();
	}
	//CREATE
	public boolean inserir(Cliente c){
		System.out.println("Inseriu Cliente: ");
		
		try{
		

			//pega conexao
			Connection con = ConectaPostGres.conexao();
			//cria declaraçao
			
			//Statement stmt = con.createStatement();
			
			String sql = "insert into cliente (nomeCliente,telCliente, endCliente) VALUES (?,?,?)";
			
			PreparedStatement pre = con.prepareStatement(sql);
			
			pre.setString(1,c.getNomeCliente());
			pre.setString(2,c.getTelCliente());
			pre.setString(3, c.getEndCliente());
			
			
			System.out.println(sql);
			//executa sql
			pre.execute();
			
		}catch(SQLException e){
			e.printStackTrace();
		}
		return false;
	}
	//READ
	public Cliente getCliente(String nome){
		return null;
	}
	
	//READ ALL ALUNOS
	public ArrayList<Cliente> getClientes(){
		
		ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();
		
		//vai fazer um select * from cliente
		
		Connection con = ConectaPostGres.conexao();
		
		String sql = "select * from cliente";
		try{
			//con.prepareStatement(sql).executeQuery();
			PreparedStatement preStmt = con.prepareStatement(sql);
			ResultSet rs = preStmt.executeQuery();
			
			while(rs.next()){
				
				//montar objeto aluno
				Cliente c = new Cliente();
				int id = rs.getInt("idCliente");
				c.setIdCliente(id);
				// Em uma unica linhaa o comando acima  a.setId(rs.getInt("id"));
				
				String nome =rs.getString("nomeCliente");
				c.setNomeCliente(nome);
				
				String telCliente = rs.getString("telCliente");
				c.setTelCliente(telCliente);
				
				String endCliente = rs.getString("endCliente");
				c.setEndCliente(endCliente);
				
				listaClientes.add(c);
			}
			
		}catch(SQLException e){
			e.printStackTrace();
		}
		return listaClientes;
	}
	
	//UPDATE
	public boolean atualizar(Cliente c){
		return false;
	}
	
	//DELETE
	public boolean deletar(Cliente c){
		return false;
	}
}
