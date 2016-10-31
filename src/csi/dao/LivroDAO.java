package csi.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import csi.model.Livro;
import csi.util.ConectaPostGres;

public class LivroDAO {
	
	public static void main(String args[]){
		ConectaPostGres.conexao();
	}
	//CREATE
	public boolean inserir(Livro l){
		System.out.println("Inseriu Livro: ");
		
		try{
		

			//pega conexao
			Connection con = ConectaPostGres.conexao();
			//cria declaraçao
			
			//Statement stmt = con.createStatement();
			
			String sql = "insert into livro (titulo,preco, quantidade, autor) VALUES (?,?,?,?)";
			
			PreparedStatement pre = con.prepareStatement(sql);
			
			pre.setString(1,l.getTitulo());
			pre.setDouble(2,l.getPreco());
			pre.setInt(3, l.getQuantidade());
			pre.setString(4, l.getAutor());
			
			
			System.out.println(sql);
			//executa sql
			pre.execute();
			
		}catch(SQLException e){
			e.printStackTrace();
		}
		return false;
	}
	//READ
	public Livro getLivro(String nome){
		return null;
	}
	
	//READ ALL LIVROS
	public ArrayList<Livro> getLivros(){
		
		ArrayList<Livro> listaLivros = new ArrayList<Livro>();
		
		//vai fazer um select * from livro
		
		Connection con = ConectaPostGres.conexao();
		
		String sql = "select * from livro";
		try{
			//con.prepareStatement(sql).executeQuery();
			PreparedStatement preStmt = con.prepareStatement(sql);
			ResultSet rs = preStmt.executeQuery();
			
			while(rs.next()){
				
				Livro l = new Livro();
				int id = rs.getInt("idLivro");
				l.setIdLivro(id);
				// Em uma unica linhaa o comando acima  a.setId(rs.getInt("id"));
				
				String titulo =rs.getString("titulo");
				l.setTitulo(titulo);
				
				String preco = rs.getString("preco");
				l.setPreco(new Double(preco));
				
				int quantidade = rs.getInt("quantidade");
				l.setQuantidade(quantidade);
				
				String autor = rs.getString("autor");
				l.setAutor(autor);
				
				listaLivros.add(l);
			}
			
		}catch(SQLException e){
			e.printStackTrace();
		}
		return listaLivros;
	}
	
	//UPDATE
	public boolean atualizar(Livro l){
		return false;
	}
	
	//DELETE
	public boolean deletar(Livro l){
		return false;
	}
}
