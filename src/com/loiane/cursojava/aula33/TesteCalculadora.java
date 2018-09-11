/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loiane.cursojava.aula33;

/**
 *
 * @author thiago
 */
public class TesteCalculadora {
    
    public static void main(String[] args){
        
        MinhaCalculadora calculadora = new MinhaCalculadora();
        double[] vetorReais = new double[3];
        
        int soma1 = calculadora.soma(1, 2);
        System.out.println(soma1);
        vetorReais[0] = soma1;
        
        int soma2 = calculadora.soma(1, 2, 3);
        System.out.println(soma2);
        vetorReais[1] = soma2;
        
        double somaReais = calculadora.soma(3.5, 7.2);
        System.out.println(somaReais);
        vetorReais[2] = somaReais;
        
        
        double somaVetor = calculadora.soma(vetorReais);
        System.out.println(somaVetor);
    }
    
}
