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
public class Ex18 {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        int[] A = new int[10];
        
        int menor = Integer.MAX_VALUE;
        int maior = Integer.MIN_VALUE;
        
        System.out.println("Insira as idades no vetor A");
        
        for(int i = 0; i < 10; i++){
            
            System.out.print("Idade[" + i + "]: ");
            A[i] = scan.nextInt();
            
            if(menor > A[i]){
                menor = A[i];
            }
            
            if(maior < A[i]){
                maior = A[i];
            }
        }
        
        
        System.out.println("O menor elemento é: " + menor + "\nO maior elemento é: " + maior);
    }
    
}
