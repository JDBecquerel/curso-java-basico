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
public class SequenciaFibonacci {
    // o meu
    // prox = atual + ant; -> sequenciaFibonnaci
    // 0, 1, 1, 2, 3, 5, 8, 13, 21... n = 9
    public static int fibonacci(int enesimo, int termoAtual, int cont, int ant){
        int prox = 0;

        
        if(cont < enesimo){
            cont++;
        }
        
        if(termoAtual == 0 && cont < enesimo){
           prox = 1;
        } else if(termoAtual > 0 && cont < enesimo){
            prox = ant + termoAtual;
        }
        
        if(cont < enesimo){
            ant = termoAtual;
            termoAtual = prox;
        }
        
        
        if(enesimo > cont){
            return fibonacci(enesimo, termoAtual, cont, ant);
        }
        
        return termoAtual;
        
    }
}
