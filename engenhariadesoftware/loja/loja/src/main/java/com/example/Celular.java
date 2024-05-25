package com.example;

public class Celular {

    private String nomeCelular;
    private String marcaCelular;
    private String tipoCelular;
    private int qntdCelular;

    public Celular(String nomeCelular, String marcaCelular, String tipoCelular, int qntdCelular) {
        this.nomeCelular = nomeCelular;
        this.marcaCelular = marcaCelular;
        this.tipoCelular = tipoCelular;
        this.qntdCelular = qntdCelular;
    }


    public String getnomeCelular() {
        return nomeCelular;
    }

    public void setnomeCelular(String nomeCelular) {
        this.nomeCelular = nomeCelular;
    }


    public String gettipoCelular() {
        return this.tipoCelular;
    }

    public void settipoCelular(String tipoCelular) {
        this.tipoCelular = tipoCelular;
    }

    public String getmarcaCelular() {
        return marcaCelular;
    }

    public void setmarcaCelular(String marcaCelular) {
        this.marcaCelular = marcaCelular;
    }

   
    public int getQuantidade() {
        return qntdCelular;
    }

    public void setQuantidade(int qntdCelular) {
        this.qntdCelular = qntdCelular;
    }

}
