package csi.model;

public class Livro {
	private int idLivro;
	private String titulo;
	private double preco;
	private int quantidade;
	private String autor;
	
	public Livro(){
		
	}
	
	public Livro(String titulo, double preco, int quantidade, String autor) {
		this.titulo = titulo;
		this.preco = preco;
		this.quantidade = quantidade;
		this.autor = autor;
	}

	public int getIdLivro() {
		return idLivro;
	}

	public void setIdLivro(int idLivro) {
		this.idLivro = idLivro;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	
	
}
