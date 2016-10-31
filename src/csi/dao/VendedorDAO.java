package csi.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


import csi.model.Vendedor;
import csi.util.ConectaPostGres;

public class VendedorDAO {
	public static void main(String args[]){
		ConectaPostGres.conexao();
	}
	//CREATE
	public boolean inserir(Vendedor v){
		System.out.println("Inseriu Vendedor: ");
		
		try{
		

			//pega conexao
			Connection con = ConectaPostGres.conexao();
			//cria declaraçao
			
			//Statement stmt = con.createStatement();
			
			String sql = "insert into vendedor (nomeVendedor,senha,salario,endVendedor) VALUES (?,?,?,?)";
			
			PreparedStatement pre = con.prepareStatement(sql);
			
			pre.setString(1,v.getNomeVendedor());
			pre.setString(2,v.getSenha());
			pre.setDouble(3, v.getSalario());
			pre.setString(4, v.getEndVendedor());
			
			System.out.println(sql);
			//executa sql
			pre.execute();
			
		}catch(SQLException e){
			e.printStackTrace();
		}
		return false;
	}
	//READ
	public Vendedor getVendedor(String nome){
		return null;
	}
	
	//READ ALL ALUNOS
	public ArrayList<Vendedor> getVendedores(){
		
		ArrayList<Vendedor> listaVendedores = new ArrayList<Vendedor>();
		
		//vai fazer um select * from vendedor
		
		Connection con = ConectaPostGres.conexao();
		
		String sql = "select * from vendedor";
		try{
			//con.prepareStatement(sql).executeQuery();
			PreparedStatement preStmt = con.prepareStatement(sql);
			ResultSet rs = preStmt.executeQuery();
			
			while(rs.next()){
				
				//montar objeto vendedor
				Vendedor v = new Vendedor();
				int id = rs.getInt("idVendedor");
				v.setIdVendedor(id);
				// Em uma unica linhaa o comando acima  a.setId(rs.getInt("id"));
				
				String nome =rs.getString("nomeVendedor");
				v.setNomeVendedor(nome);
				
				String senha = rs.getString("senha");
				v.setSenha(senha);
				
				String salario = rs.getString("salario");
				v.setSalario(new Double(salario));
				
				String endVendedor = rs.getString("endVendedor");
				v.setEndVendedor(endVendedor);
				
				listaVendedores.add(v);
			}
			
		}catch(SQLException e){
			e.printStackTrace();
		}
		return listaVendedores;
	}
	
	//UPDATE
	public boolean atualizar(Vendedor v){
		return false;
	}
	
	//DELETE
	public boolean deletar(Vendedor v){
		return false;
	}
}
