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
public class Ex25 {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        int[] A = new int[10];
        int[] B = new int[10];
        
        System.out.println("Insira os elementos do vetor A");
        
        for(int i = 0; i < 10; i++){
            System.out.print("A[" + i + "]: ");
            A[i] = scan.nextInt();
            
            if(A[i]%2 == 0){
                B[i] = 1;
            }
            else{
                B[i] = 0;
            }
        }
        
        System.out.println("\n");
        
        for(int i = 0; i < 10; i++){
            System.out.println("B[" + i + "]: " + B[i]);
        }
        

    }
}
