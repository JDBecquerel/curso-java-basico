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
public class Ex11 {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        
        int[] A = new int[10];
        int cont = 0;
        
        System.out.println("Insira os elementos do vetor A: ");
        
        for(int i = 0; i < 10; i++){
            
            System.out.print("A[" + i + "]: ");
            A[i] = scan.nextInt();
            
            if(A[i]%2 == 0){
                cont++;
            }
        }
        
        System.out.println("O vetor A tem " + cont + " elementos pares");
        
        
        
        
    }
    
}
