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
    
    public static int somatorio(int num, int soma){
        soma += num;
        
        if(num == 0){
            return soma;
        } else{
            
            num--;
            return somatorio(num, soma);
        }

    }
    
    public static int somatorio2(int num){
        
        if(num == 1){
            return 1;
        }
        return num + somatorio2(num-1);
    }
    
}
