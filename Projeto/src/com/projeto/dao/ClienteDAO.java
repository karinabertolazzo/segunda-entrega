package com.projeto.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.projeto.model.Cliente;

public class ClienteDAO {
	
	
	
	private static String sql;
	
	private final Connection connection;
	
	public ClienteDAO(Connection connection ) {
		this.connection = connection;
	}

	//CREATE
	public void createClient(Cliente cliente) {
		sql = "INSERT INTO cliente (nomeCliente, cpfCliente, enderecoCliente, telefoneCliente, emailCliente, senhaCliente) VALUES (?,?,?,?,?,?)";
		try(PreparedStatement stmt = connection.prepareStatement(sql)){
			stmt.setString(1, cliente.getNomeCliente());
			stmt.setString(2, cliente.getCpfCliente());
			stmt.setString(3, cliente.getEnderecoCliente());
			stmt.setString(4, cliente.getTelefoneCliente());
			stmt.setString(5, cliente.getEmailCliente());
			stmt.setString(6, cliente.getSenhaCliente());
			
			stmt.executeUpdate();
			System.out.println("Cliente criado com sucesso: " + cliente.getNomeCliente()  + " e CPF: " + cliente.getCpfCliente());
			
			
			
		}
				
	catch(SQLException e) {
		System.out.println("[LOG] Nao foi possivel criar o cliente. Mensagem" + e.getMessage());
    }
	
  }
	
	
	//READ
	public void readAllClients() {
		sql="SELECT * FROM cliente";
		try(PreparedStatement stmt = connection.prepareStatement(sql)){
			ResultSet r = stmt.executeQuery();
			int id = 1;
			while(r.next()) {
				Cliente cliente = new Cliente ();
				cliente.setNomeCliente(r.getString("nomeCliente"));
				cliente.setCpfCliente(r.getString("cpfCliente"));
				cliente.setEnderecoCliente(r.getString("enderecoCliente"));
				cliente.setTelefoneCliente(r.getString ("telefonecliente"));
				cliente.setEmailCliente(r.getString("emailCliente"));
				cliente.setSenhaCliente(r.getString("senhaCliente"));
				
				System.out.printf("ID: %d\nNome: %s \n CPF: %s Endereco: %s \n Telefone: %s \n Email: %s \n Senha: %s \n",
					id,	cliente.getNomeCliente(), cliente.getCpfCliente(), cliente.getEnderecoCliente(), cliente.getTelefoneCliente(), cliente.getEmailCliente() , cliente.getSenhaCliente() );
				id++;
			}
		}catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	
	
	
	//UPDATE
		public void updateClient (Cliente cliente) {
			sql="UPDATE cliente SET nomeCliente = ?, cpfCliente = ?, enderecoCliente = ?, telefoneCliente = ?, emailCliente = ?, senhaCliente = ? WHERE idCliente = ?";
			try(PreparedStatement stmt = connection.prepareStatement(sql)) {
				stmt.setString(1, cliente.getNomeCliente());
				stmt.setString(2, cliente.getCpfCliente());
				stmt.setString(3, cliente.getEnderecoCliente());
				stmt.setString(4, cliente.getTelefoneCliente());
				stmt.setString(5, cliente.getEmailCliente());
				stmt.setString(6, cliente.getSenhaCliente());
				stmt.setInt(7, cliente.getIdCliente());
				
				stmt.executeUpdate();
				
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
		}
	
	//DELETE	
		public void deleteClient(int id) {
			sql = "DELETE FROM cliente WHERE idCliente = ?";
			try (PreparedStatement stmt = connection.prepareStatement(sql)) {			
				stmt.setInt(1, id);
				
				stmt.executeUpdate();
				System.out.println("Cliente deletado com sucesso!");
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
}
}