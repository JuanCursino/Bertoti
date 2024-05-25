package com.example;

import static org.junit.Assert.*;

import org.junit.Test;



 
Loja lojinha = new Loja();

@Test
public void testeCadastrarCelular(){
    lojinha.cadastrarCelular("iPhone", "Apple", "12 Pro", 5000);
    lojinha.cadastrarCelular("Galaxy", "Samsung", "S20", 4000);

    assertTrue(lojinha.celulares.getLast().getNomeCelular().equals("Galaxy"));
}

@Test
public void testeCadastrarTablet(){
    lojinha.cadastrarTablet("iPad", "Apple", "Air", 2000);
    lojinha.cadastrarTablet("Galaxy Tab", "Samsung", "S7", 1500);
    
    assertFalse(lojinha.tablets.getFirst().getNomeTablet().equals("iPad"));
}

@Test
public void testeBuscarCelular(){
    lojinha.cadastrarCelular("iPhone", "Apple", "12 Pro", 5000);
    lojinha.cadastrarCelular("Galaxy", "Samsung", "S20", 4000);
    lojinha.buscarCelular("Galaxy");
    
    assertEquals("Galaxy", lojinha.buscarCelular("Galaxy").getNomeCelular());
}

@Test
public void testeBuscarTablet(){
    lojinha.cadastrarTablet("iPad", "Apple", "Air", 2000);
    lojinha.cadastrarTablet("Galaxy Tab", "Samsung", "S7", 1500);
    lojinha.buscarTablet("iPad");
    
    assertEquals("iPad", lojinha.buscarTablet("iPad").getNomeTablet());
}
}

}
