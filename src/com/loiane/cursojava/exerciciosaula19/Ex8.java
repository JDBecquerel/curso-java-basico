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
public class Ex8 {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        
        int[] A = new int[10];
        int[] B = new int[A.length];
        int[] C = new int[A.length];
        
        System.out.println("Insira os valores do vetor A: ");
        
        for(int i = 0; i < A.length; i++){
            
            System.out.print("A[" + i + "]: ");
            A[i] = scan.nextInt();
        }
        
        System.out.println("\nInsira os valores do vetor B:");
        
        for(int i = 0; i < B.length; i++){
            
            System.out.print("B[i" + i + "]: ");
            B[i] = scan.nextInt();
        }
        
        for(int i = 0; i < C.length; i++){
            
            C[i] = A[i]*B[i];
            System.out.println("C[" + i + "]: " + C[i]);
        }
            
        
    }
    
}
