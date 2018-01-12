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
public class Ex33 {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        int[] A = new int[10];
        boolean primo = true;
        String msg = "";
        
        System.out.println("Insira os elementos do vetor A para verificar se é primo: ");
        
        for(int i = 0; i < 10; i++){
            System.out.print("A[" + i + "]: ");
            A[i] = scan.nextInt();
        }
        
        System.out.println("\nVerificação do vetor A:");
        
        for(int i = 0; i < A.length; i++){
            
            primo = true;
            for(int j = 1; j <= A[i]; j++){ 
		if(A[i]%j == 0 && A[i]%1 == 0){
                    primo = false;
                    break;
		}
            }
            
            System.out.print("A[" + i + "]: " + A[i]);
            
            if(primo){
                msg = " primo";
                System.out.println(A[i] + msg);
            }
            else{
                msg = " não é primo";
                System.out.println(A[i] + msg);
                
            }
            
        }
    }
    
}
