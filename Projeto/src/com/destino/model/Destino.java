package com.destino.model;

public class Destino {
    private int idDestino;
    private double valorPromocionalDestino;
    private int promocoesDestino;
    private String nomeDestino;
    private double valorDestino;
    private String foto;
    private String descricao;

    // Construtor vazio
    public Destino() {
    }

    // Construtor com todos os campos
    public Destino(int idDestino, double valorPromocionalDestino, int promocoesDestino, String nomeDestino, double valorDestino, String foto, String descricao) {
        this.idDestino = idDestino;
        this.valorPromocionalDestino = valorPromocionalDestino;
        this.promocoesDestino = promocoesDestino;
        this.nomeDestino = nomeDestino;
        this.valorDestino = valorDestino;
        this.foto = foto;
        this.descricao = descricao;
    }

    // Getters e Setters para todos os campos
    public int getIdDestino() {
        return idDestino;
    }

    public void setIdDestino(int idDestino) {
        this.idDestino = idDestino;
    }

    public double getValorPromocionalDestino() {
        return valorPromocionalDestino;
    }

    public void setValorPromocionalDestino(double valorPromocionalDestino) {
        this.valorPromocionalDestino = valorPromocionalDestino;
    }

    public int getPromocoesDestino() {
        return promocoesDestino;
    }

    public void setPromocoesDestino(int promocoesDestino) {
        this.promocoesDestino = promocoesDestino;
    }

    public String getNomeDestino() {
        return nomeDestino;
    }

    public void setNomeDestino(String nomeDestino) {
        this.nomeDestino = nomeDestino;
    }

    public double getValorDestino() {
        return valorDestino;
    }

    public void setValorDestino(double valorDestino) {
        this.valorDestino = valorDestino;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}