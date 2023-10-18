package com.projeto.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.destino.model.Destino;

public class DestinoDAO {
    private static final String INSERT_SQL = "INSERT INTO destino (valorPromocionalDestino, promocoesDestino, nomeDestino, valorDestino, foto, descricao) VALUES (?,?,?,?,?,?)";
    private static final String SELECT_ALL_SQL = "SELECT * FROM destino";
    private static final String UPDATE_SQL = "UPDATE destino SET valorPromocionalDestino = ?, promocoesDestino = ?, nomeDestino = ?, valorDestino = ?, foto = ?, descricao = ? WHERE idDestino = ?";
    private static final String DELETE_SQL = "DELETE FROM destino WHERE idDestino = ?";

    private final Connection connection;

    public DestinoDAO(Connection connection) {
        this.connection = connection;
    }

    public void createDestino(Destino destino) {
        try (PreparedStatement stmt = connection.prepareStatement(INSERT_SQL)) {
            stmt.setDouble(1, destino.getValorPromocionalDestino());
            stmt.setInt(2, destino.getPromocoesDestino());
            stmt.setString(3, destino.getNomeDestino());
            stmt.setDouble(4, destino.getValorDestino());
            stmt.setString(5, destino.getFoto());
            stmt.setString(6, destino.getDescricao());
            stmt.executeUpdate();
            System.out.println("Destino criado com sucesso: " + destino.getNomeDestino());
        } catch (SQLException e) {
            System.out.println("[LOG] Não foi possível criar o destino. Mensagem: " + e.getMessage());
        }
    }

    public void readAllDestinos() {
        try (PreparedStatement stmt = connection.prepareStatement(SELECT_ALL_SQL)) {
            ResultSet r = stmt.executeQuery();
            int id = 1;
            while (r.next()) {
                Destino destino = new Destino();
                destino.setValorPromocionalDestino(r.getDouble("valorPromocionalDestino"));
                destino.setPromocoesDestino(r.getInt("promocoesDestino"));
                destino.setNomeDestino(r.getString("nomeDestino"));
                destino.setValorDestino(r.getDouble("valorDestino"));
                destino.setFoto(r.getString("foto"));
                destino.setDescricao(r.getString("descricao"));

                System.out.printf("ID: %d\nNome: %s \nPromoções: %d \nValor Promocional: %.2f \nValor: %.2f \nFoto: %s \nDescrição: %s \n",
                        id, destino.getNomeDestino(), destino.getPromocoesDestino(), destino.getValorPromocionalDestino(), destino.getValorDestino(), destino.getFoto(), destino.getDescricao());
                id++;
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void updateDestino(Destino destino) {
        try (PreparedStatement stmt = connection.prepareStatement(UPDATE_SQL)) {
            stmt.setDouble(1, destino.getValorPromocionalDestino());
            stmt.setInt(2, destino.getPromocoesDestino());
            stmt.setString(3, destino.getNomeDestino());
            stmt.setDouble(4, destino.getValorDestino());
            stmt.setString(5, destino.getFoto());
            stmt.setString(6, destino.getDescricao());
            stmt.setInt(7, destino.getIdDestino());
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void deleteDestino(int id) {
        try (PreparedStatement stmt = connection.prepareStatement(DELETE_SQL)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
            System.out.println("Destino deletado com sucesso!");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
