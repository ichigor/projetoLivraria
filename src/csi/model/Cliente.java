package csi.model;

public class Cliente {
	private int idCliente;
	private String nomeCliente;
	private String telCliente;
	private String endCliente;
	
	
	public Cliente( String nomeCliente, String telCliente, String endCliente) {
		this.nomeCliente = nomeCliente;
		this.telCliente = telCliente;
		this.endCliente = endCliente;
	}
	
	public Cliente(){
		
	}
	
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public String getTelCliente() {
		return telCliente;
	}
	public void setTelCliente(String telCliente) {
		this.telCliente = telCliente;
	}
	public String getEndCliente() {
		return endCliente;
	}
	public void setEndCliente(String endCliente) {
		this.endCliente = endCliente;
	}
	
	
}
