package csi.model;

public class Vendedor {
	
	private int idVendedor;
	private String nomeVendedor;
	private String senha;
	private double salario;
	private String endVendedor;
	
	
	public Vendedor(){
		
	}
	
	
	public Vendedor(String nomeVendedor, String senha, double salario, String endVendedor) {
		this.nomeVendedor = nomeVendedor;
		this.senha = senha;
		this.salario = salario;
		this.endVendedor = endVendedor;
	}
	
	public int getIdVendedor() {
		return idVendedor;
	}
	public void setIdVendedor(int idVendedor) {
		this.idVendedor = idVendedor;
	}
	public String getNomeVendedor() {
		return nomeVendedor;
	}
	public void setNomeVendedor(String nomeVendedor) {
		this.nomeVendedor = nomeVendedor;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getEndVendedor() {
		return endVendedor;
	}
	public void setEndVendedor(String endVendedor) {
		this.endVendedor = endVendedor;
	}
	
	
}
