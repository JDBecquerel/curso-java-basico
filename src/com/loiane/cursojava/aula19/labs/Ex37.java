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
public class Ex37 {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        int[] A = new int[15];
        int[] B = new int[15];
        
        System.out.println("Insira os elementos do vetor A: ");
        
        for(int i = 0; i < A.length; i++){
            System.out.print("A[" + i + "]: ");
            A[i] = scan.nextInt();
        }
        
        
        
        System.out.println("\n");
        
        for(int i = 0; i < A.length; i++){
            B[i] = 1;
            for(int j = A[i]; j >= 1; j--){
                B[i] *= j;
            }
        }
        
       for(int i = 0; i < 15; i++){
            System.out.println("B[" + (i+1) + "]: " + B[i]);
       }
    }
    
}
