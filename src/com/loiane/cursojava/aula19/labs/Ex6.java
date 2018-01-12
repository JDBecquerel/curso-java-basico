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
public class Ex6 {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        int[] A = new int[10];
        int[] B = new int[A.length];
        
        System.out.println("Insira os valores do vetor A: ");
        for(int i = 0; i < A.length; i++){
            System.out.print("Valor na posição " + i + ": ");
            A[i] = scan.nextInt();
        }
        
        System.out.println("Insira os valores do vetor B: ");
        
        for(int i = 0; i < B.length; i++){
            System.out.print("Valor na posição " + i + ": ");
            B[i] = scan.nextInt();
        }
        
        
        int[] C = new int[B.length];
        
        System.out.println();
        for(int i = 0; i < A.length; i++){
            C[i] = A[i] + B[i];
            System.out.println("Valor na posição " + i + ": " + C[i]);
        }
        
        
        
    }
    
}
