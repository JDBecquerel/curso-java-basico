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
        int[] B = new int[10];
        
        System.out.println("Insira os valores do vetor A: ");
        
        for(int i = 0; i < 10; i++){
                System.out.print("A[" + i + "]: " + A[i]);
                A[i] = scan.nextInt();
        }
        
        System.out.println("Os valores do vetor B: ");
        
        for(int i = 0; i < 10; i++){
            B[i] = A[i]*i;
            System.out.println("B["+ i + "]: " + B[i]);
            
        }
        
        
        
    }
    
}
