/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loiane.cursojava.aula32;

/**
 *
 * @author thiago
 */
public class TesteCarro {
    
    public static void main(String[] args){
        
        Carro van = new Carro();
        
        // get e set (encapsulamento)
        van.setMarca("Fiat");
        
        System.out.println(van.getMarca());
    }
    
}
