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
public class Calculadora {
    //loiane fez o primeiro
    public static int fibonacci(int num){
        
        if(num < 2){
            return 1;
        }
        
        return fibonacci(num -1) + fibonacci(num -2);
    }
    //alterei para fazer o que eu quero
    public static int fibonacci2(int num){
        if(num == -1){ // isso é para imprimir: 0,1,1 e com a posição correta
            return 0;
        } else if(num < 2){
            return 1;
        }
        
        return fibonacci2(num -1) + fibonacci(num -2);
    }
}
