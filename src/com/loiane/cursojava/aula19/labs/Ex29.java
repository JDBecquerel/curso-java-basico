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
public class Ex29 {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        int[] A = new int[10];
        int[] B = new int[A.length];
        int[] C = new int[A.length*2];
        
        System.out.println("Insira os elementos do vetor A: ");
        
        for(int i = 0; i < 10; i++){
            System.out.print("A[" + i + "]: ");
            A[i] = scan.nextInt();
        }
        
        System.out.println("\nInsira os elementos do vetor B: ");
        
        for(int i = 0; i < 10; i++){
            System.out.print("B[" + i + "]: ");
            B[i] = scan.nextInt();
        }
        
        System.out.println("\nCombinação do vetor A e B -> vetor C: ");
        
        int j = 0;
        for(int i = 0; i < 20; i++){
            if(i < 10){
                C[i] = A[i];
            }
            else{
                C[i] = B[j];
                j++;
            }
            System.out.println("C[" + i + "]: " + C[i]);
        }
        
        
    }
    
}
