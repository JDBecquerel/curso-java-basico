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
public class Ex5 {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        int[] A = new int[10];
        int[] B = new int[A.length];
        
        System.out.println("Insira os valores do vetor A: ");
        
        for(int i = 0; i < A.length; i++){
                System.out.print("A[" + i + "]: " + A[i]);
                A[i] = scan.nextInt();
        }
        
        System.out.println("Os valores do vetor B: ");
        
        System.out.print("Vetor B: ");
        for(int i = 0; i < B.length; i++){
            B[i] = A[i]*i;
            System.out.print(B[i] + " ");
            
        }
        
        
        
    }
    
}
