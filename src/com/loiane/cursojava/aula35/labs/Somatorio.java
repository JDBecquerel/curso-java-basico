/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loiane.cursojava.aula35.labs;

/**
 *
 * @author thiago
 */
public class Somatorio {
    
    public static int somatorio(int num){
        int soma;
        if(num > 0){
            
        soma = num + somatorio(num);
        
        }
        
        return num;
    }
    
}
