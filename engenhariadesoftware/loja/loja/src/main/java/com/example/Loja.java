package com.example;

import java.util.LinkedList; import java.util.List;

public class Loja {

 
public List<Celular> celulares = new LinkedList<>();
public List<Tablet> tablets = new LinkedList<>();

    // Cadastrando Itens
public void cadastrarCelular(String nomeCelular, String marcaCelular, double precoCelular, int qntdCelular) {
    Celular celular = new Celular(nomeCelular, marcaCelular, precoCelular, qntdCelular);
    celulares.add(celular);
}
public boolean cadastrarTablet(String nomeTablet, String marcaTablet, double precoTablet, int qntdTablet) {
    Tablet tablet = new Tablet(nomeTablet, marcaTablet, precoTablet, qntdTablet);
    tablets.add(tablet);
    System.out.println(nomeTablet + " adicionado!");
    return true;
}

    // Metodo Buscar Celular
public Celular buscarCelular(String nomeCelular) {
    for(Celular celular : celulares){
        if (celular.getnomeCelular().equalsIgnoreCase(nomeCelular)){
            System.out.println(celular + " encontrado!");
            return celular;
        }
    }
    System.out.println("Celular não encontrado!");
    return null;
}

    // Metodo Buscar Tablet
public Tablet buscarTablet(String nomeTablet){
    for(Tablet tablet : tablets){
        if (tablet.getnomeTablet().equalsIgnoreCase(nomeTablet)) {
            System.out.println(tablet + " encontrado!");
            return tablet;
        }
    }
    System.out.println("Tablet não encontrado!");
    return null;
}
}
