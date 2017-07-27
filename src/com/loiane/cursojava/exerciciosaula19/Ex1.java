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
public class Ex1 {
    
    public static void main(String[] args){
       
        Scanner scan = new Scanner(System.in);
        
        int[] vetorA = new int[5];
        
        for(int i = 0; i < 5; i++){
            System.out.print("Digite o número a ser inserido na posição " + i + ":");
            vetorA[i] = scan.nextInt();
        }
        
        int[] vetorB = new int[5];
        
        for(int i = 0; i < 5; i++){
            vetorB[i] = vetorA[i];
        }
        
        for(int i = 0; i < 5; i++){
            System.out.println("O elemento na posição " + i + " do vetorB é: " + vetorB[i]);
        }
        
        
    }
    
}
