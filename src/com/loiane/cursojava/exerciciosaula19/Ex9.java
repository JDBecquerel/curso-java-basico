/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loiane.cursojava.exerciciosaula19;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author thiago
 */
public class Ex9 {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###,###.###");
        
        int[] A = new int[10];
        int[] B = new int[A.length];
        double[] C = new double[A.length];
        
        
        System.out.println("Insira os valores do vetor A: ");
        
        for(int i = 0; i < A.length; i++){
            System.out.print("A[" + i + "]: ");
            A[i] = scan.nextInt();
        }
        
        System.out.println("\nInsira os valores do vetor B: ");
        
        
        for(int i = 0; i < B.length; i++){
            System.out.print("B[" + i +"]: ");
            B[i] = scan.nextInt();
        }
        
        System.out.print("\n");
        
        for(int i = 0; i < C.length; i++){
            
            C[i] = A[i]/(double)B[i];
            
            System.out.println("C[" + i + "]: " + df.format(C[i]));
        }
        
    }
    
}
