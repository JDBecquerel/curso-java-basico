/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loiane.cursojava.aula34.labs;

/**
 *
 * @author thiago
 */
public class Contador {
    
    private static int contInstancia;
    
    public Contador(){ 
        contInstancia++;
    }
    
    public static int obterValor(){
        return contInstancia;
    }  
    
    public static void zerar(){
        contInstancia = 0;
    }
    
    public static void incrementar(){
        contInstancia++;
    }
    
}
