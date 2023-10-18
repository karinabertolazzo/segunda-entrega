package com.projeto.model;

public class Cliente {
	
	private int idCliente;
	
	private String nomeCliente;
	
	private String cpfCliente;
	
	private String enderecoCliente;
	
	private String telefoneCliente;
	
	private String emailCliente;
	
	private String senhaCliente;
	
	
	

	public Cliente() {
		super();
		
	}




	public Cliente(String nomeCliente, String cpfCliente, String enderecoCliente, String telefoneCliente,
			String emailCliente, String senhaCliente) {
		super();
		this.nomeCliente = nomeCliente;
		this.cpfCliente = cpfCliente;
		this.enderecoCliente = enderecoCliente;
		this.telefoneCliente = telefoneCliente;
		this.emailCliente = emailCliente;
		this.senhaCliente = senhaCliente;
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




	public String getCpfCliente() {
		return cpfCliente;
	}




	public void setCpfCliente(String cpfCliente) {
		this.cpfCliente = cpfCliente;
	}




	public String getEnderecoCliente() {
		return enderecoCliente;
	}




	public void setEnderecoCliente(String enderecoCliente) {
		this.enderecoCliente = enderecoCliente;
	}




	public String getTelefoneCliente() {
		return telefoneCliente;
	}




	public void setTelefoneCliente(String telefoneCliente) {
		this.telefoneCliente = telefoneCliente;
	}




	public String getEmailCliente() {
		return emailCliente;
	}




	public void setEmailCliente(String emailCliente) {
		this.emailCliente = emailCliente;
	}




	public String getSenhaCliente() {
		return senhaCliente;
	}




	public void setSenhaCliente(String senhaCliente) {
		this.senhaCliente = senhaCliente;
	}




	@Override
	public String toString() {
		return "Cliente [idCliente=" + idCliente + ", nomeCliente=" + nomeCliente + ", cpfCliente=" + cpfCliente
				+ ", enderecoCliente=" + enderecoCliente + ", telefoneCliente=" + telefoneCliente + ", emailCliente="
				+ emailCliente + ", senhaCliente=" + senhaCliente + "]";
	}




	
	
    
	
	
}
