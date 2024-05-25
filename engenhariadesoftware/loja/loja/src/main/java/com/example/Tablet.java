package com.example;

public class Tablet {

    private String nomeTablet;
    private String tipoTablet;
    private String marcaTablet;
    private int qntdTablet;
 
    
    public Tablet(String nomeTablet, String tipoTablet, String marcaTablet, int qntdTablet){
    this.nomeTablet = nomeTablet;
    this.tipoTablet = tipoTablet;
    this.marcaTablet = marcaTablet;
    this.qntdTablet = qntdTablet;
    }


    public String getNomeTablet() {
        return nomeTablet;
    }

    public void setNomeTablet(String nomeTablet) {
        this.nomeTablet = nomeTablet;
    }

    // Metodo Acesso tipoTablet
    public String getTipoTablet() {
        return tipoTablet;
    }

    public void setTipoTablet(String tipoTablet) {
        this.tipoTablet = tipoTablet;
    }

    public String getMarcaTablet() {
        return marcaTablet;
    }

    public void setMarcaTablet(String marcaTablet) {
        this.marcaTablet = marcaTablet;
    }

    public int getQuantidade() {
        return qntdTablet;
    }

    public void setQuantidade(int qntdTablet) {
        this.qntdTablet = qntdTablet;
    }

}
