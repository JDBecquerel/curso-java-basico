/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loiane.cursojava.exerciciosaula19;

import java.util.Scanner;

/**
 *
 * @author thiago
 */
public class Ex4 {
    
    public static void main(String[] args){
       
        Scanner scan = new Scanner(System.in);
        
        double [] vetorA = new double[15];
        
        for(int i = 0; i < 15; i++){
            System.out.print("Digite o número a ser inserido na posição " + i + ":");
            vetorA[i] = scan.nextInt();
        }
        
        double[] vetorB = new double[15];
        
        for(int i = 0; i < 15; i++){
            vetorB[i] = Math.sqrt(vetorA[i]);
        }
        
        for(int i = 0; i < 15; i++){
            System.out.println("O elemento na posição " + i + " do vetorB é: " + vetorB[i]);
        }
        
        
    }
    
}
