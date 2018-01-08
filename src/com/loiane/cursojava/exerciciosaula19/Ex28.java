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
public class Ex28 {
    
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        
        int[] A = new int[10];
        int[] B = new int[A.length];
        System.out.println("Insira os valores do vetor A: ");
        
        for(int i = 0; i < A.length; i++){
            System.out.print("A[" + i + "]: ");
            A[i] = in.nextInt();
        }
        int j = 0;
        
        System.out.println("\n");
        
        for(int i = 9; i > -1; i--){
            B[i] = A[j];
            j++;
        }
        
        for(int i = 0; i < 10; i++){
            System.out.println("B[" + i + "]: " + B[i]);
        }
        
    }
    
}
