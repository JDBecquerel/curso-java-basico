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
public class Ex35 {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        int[] A = new int[10];
        
        System.out.println("Insira os elementos do vetor A");
        
        for(int i = 0; i < A.length; i++){
            System.out.print("A[" + i + "]: ");
            A[i] = scan.nextInt();
        }
        
        for(int i = 0; i < A.length; i++){
            System.out.print("Analisando o numero" + A[i] + ": \n");
            
            for(int j = 1; j < A[i]; j++){
                if(A[i] % j == 0){
                    System.out.println(j + " é divisor");
                }
            }
            
            System.out.println();
            
        }
            
    }
    
}
