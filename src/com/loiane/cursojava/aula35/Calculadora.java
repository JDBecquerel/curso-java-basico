/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loiane.cursojava.aula35;

/**
 *
 * @author thiago
 */
public class Calculadora {
    
    public static int fatorialNaoRecursivo(int fatorial){
        int resultado = fatorial;
        if(fatorial == 0)
            resultado++;
        while(fatorial > 1)
            resultado *= --fatorial;
        
        return resultado;
    }
    
    //fatorial(5) = 5*fatorial(4)
    //fatorial(4) = 4*fatorial(3)
    //fatorial(3) = 3*fatorial(2)
    //fatorial(2) = 2*fatorial(1)
    //fatorial(1) = 1*fatorial(0)
    //fatorial(0) = 1;
    public static int fatorial(int num){
        
        if(num == 0){ //ponto de parada se não ia rodar em um loop infinito
            return 1;
        }
        
        return num*fatorial(num-1);
    }
    
}
