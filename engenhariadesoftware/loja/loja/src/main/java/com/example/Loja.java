package com.example;

import java.util.LinkedList;
import java.util.List;

public class Loja {
        public List<Celular> celulares = new LinkedList<
        public List<Tablet> tablets = new LinkedList<

    
         public void cadastrarCelular(String modeloCelular, String marcaCelular, int qntdCelular){
         Celular celular = new Celular(modeloCelular, marcaCelular, qntdCelular)
         celulares.add(celular);
        }

        public boolean cadastrarTablet(String modeloTablet, String marcaTablet, int qntdTable
         Tablet tablet = new Tablet(modeloTablet, marcaTablet, qntdTablet)
         tablets.add(tablet)
         System.out.println(modeloTablet + " adicionado!")
         return true
     

    
            public Celular buscarCelular(String modeloCe
        for (Celular celular : celulares) {
            if (celular.getModeloCelular().equalsIgnoreCase(modeloCelular)) {
                System.out.println(celular + " encontrado!");
                return celular;
            }
        }
        System.out.println("Celular não encontrado!");
        return null;
    }

    // Metodo Buscar Tablet
    public Tablet buscarTablet(String modeloTablet) {
        for (Tablet tablet : tablets) {
            if (tablet.getModeloTablet().equalsIgnoreCase(modeloTablet)) {
                System.out.println(tablet + " encontrado!");
                return tablet;
            }
        }
        System.out.println("Tablet não encontrado!");
        return null;
    }
}
