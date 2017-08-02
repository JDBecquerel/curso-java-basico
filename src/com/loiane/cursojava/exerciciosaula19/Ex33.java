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
public class Ex33 {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        int[] A = new int[10];
        int cont = 0;
        
        System.out.println("Insira os elementos do vetor A para verificar se é primo: ");
        
        for(int i = 0; i < 10; i++){
            System.out.print("A[" + i + "]: ");
            A[i] = scan.nextInt();
        }
        
        System.out.println("\nVerificação do vetor A:");
        
        for(int i = 0; i < 10; i++){
            
            for(int j = 1; j <= A[i]; j++){ 
		if(A[i]%j == 0 && A[i]%1 == 0){
                    cont++;
		}
            }
            
            System.out.print("A[" + i + "]: " + A[i]);
            
            if(cont <= 2){
                System.out.println(" é um número primo.");
            }
            else{
                System.out.println(" não é um número primo.");
            }
            
            cont = 0;
        }
    }
    
}
