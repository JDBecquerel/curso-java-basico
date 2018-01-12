/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

/**
 *
 * @author thiago
 */
public class Ex32 {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        int[] A = new int[5];
        
        System.out.println("Insira os elementos do vetor A para calcular sua tabuada: ");
        
        for(int i = 0; i < 5; i++){
            System.out.print("A[" + i + "]: ");
            A[i] = scan.nextInt();
        }
        
        for(int i = 0; i < 5; i++){
            System.out.println("\nTabuada de " + A[i]);
            for(int j = 1; j <= 10; j++){
                System.out.println(A[i] + " X " + j + " = " + A[i]*j);
            }
            System.out.println();
        }
    }
    
}
