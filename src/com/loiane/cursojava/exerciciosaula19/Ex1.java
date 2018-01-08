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
        int[] vetorB = new int[vetorA.length];
        
        for(int i = 0; i < vetorA.length; i++){
            System.out.print("Digite o número a ser inserido na posição " + i + ":");
            vetorA[i] = scan.nextInt();
        }
        
        
        
        for(int i = 0; i < vetorA.length; i++){
            vetorB[i] = vetorA[i];
        }
        
        for(int i = 0; i < vetorA.length; i++){
            System.out.println("O elemento na posição " + i + " do vetorB é: " + vetorB[i]);
        }
        
        
    }
    
}
