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
public class Ex30 {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        int[] A = new int[20];
        int[] B = new int[20];
        int[] C = new int[20];
        int contp = 0, conti = 0;
        
        System.out.println("Insira os elementos do vetor A: ");
        
        for(int i = 0; i < 20; i++){
            System.out.print("A[" + i + "]: ");
            A[i] = scan.nextInt();
            
            if(A[i]%2 == 0){
                B[contp] = A[i];
                contp++;
            }else{
             C[conti] = A[i];
             conti++;
            }
        }
        
        System.out.println("\n");
        
        for(int i = 0; i < contp; i++){
            System.out.println("B[" + i + "]: " + B[i]);
        }
        
        System.out.println("\n");
        
        for(int i = 0; i < conti; i++){
            System.out.println("C[" + i + "]: " + C[i]);
        }
    }
    
}
