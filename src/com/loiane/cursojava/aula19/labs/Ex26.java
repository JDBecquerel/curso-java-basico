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
public class Ex26 {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        int[] A = new int[10];
        int[] B = new int[10];
        int[] C = new int[10];
        
        System.out.println("Inserir os elementos do vetor A");
        
        for(int i = 0; i < 10; i ++){
            System.out.print("A[" + i + "]: ");
            A[i] = scan.nextInt();
        }
        
        System.out.println("\n"); 
        
        for(int i = 0; i < 10; i ++){
            System.out.print("B[" + i + "]: ");
            B[i] = scan.nextInt();
        }
        
        System.out.println("\n");
        
        for(int i = 0; i < 10; i ++){
            
            if(A[i] > B[i]){
                C[i] = 1;
            }
            else if(A[i] == B[i]){
                C[i] = 0;
            }
            else{
                C[i] = -1;
            }
            
            System.out.println("C[" + i + "]: " + C[i]);
        }
        
        
    }
    
}
