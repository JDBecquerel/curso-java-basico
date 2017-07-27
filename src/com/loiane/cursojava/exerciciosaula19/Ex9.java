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
public class Ex9 {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        int[] A = new int[10];
        int[] B = new int[10];
        double[] C = new double[10];
        
        
        System.out.println("Insira os valores do vetor A: ");
        
        for(int i = 0; i < 10; i++){
            System.out.print("A[" + i + "]: ");
            A[i] = scan.nextInt();
        }
        
        System.out.println("\nInsira os valores do vetor B: ");
        
        
        for(int i = 0; i < 10; i++){
            System.out.print("B[" + i +"]: ");
            B[i] = scan.nextInt();
        }
        
        System.out.print("\n");
        
        for(int i = 0; i < 10; i++){
            
            C[i] = A[i]/(double)B[i];
            
            System.out.println("C[" + i + "]: " + C[i]);
        }
        
    }
    
}
