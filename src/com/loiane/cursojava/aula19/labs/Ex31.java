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
public class Ex31 {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        int[] A = new int[20];
        int[] B = new int[A.length];
        int j = 0, k = 10;
        
        System.out.println("Insira os elementos do vetor A: ");
        
        for(int i = 0; i < 20; i++){
            System.out.print("A[" + i + "]: ");
            A[i] = scan.nextInt();
            
            if(A[i]%2 == 0){
                
                B[j] = A[i];
                j++;
                
            }else{
                
             B[k] = A[i];
             k++;
             
            }
        }
        
        System.out.println("\n");
        
        for(int i = 0; i < 20; i++){
            System.out.println("B[" + i + "]: " + B[i]);
        }
        
        
    }
    
}
