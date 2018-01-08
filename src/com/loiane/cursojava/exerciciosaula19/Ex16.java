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
public class Ex16 {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        int[] A = new int [10];
        int i = 0;
        int soma = 0, soma2 = 0, qtd = 0, qtd2 = 0;
        
        
        System.out.println("Insira os elementos no vetor A");
        
        for(i = 0; i < A.length; i++){
            System.out.print("A[" + i + "]: ");
            A[i] = scan.nextInt();
        }
        
        for(i = 0; i < A.length; i++){
                
                if(A[i] != 15){
                    
                    if(A[i] < 15){
                        soma += A[i];
                    }
                    
                    else{
                        soma2 += A[i];
                        qtd2++;
                    }          }         
            else{
                qtd++;
            }
        }
        
        System.out.println("\nSoma dos elementos menores que 15: " + soma + "\nQuantidade de elementos iguais a 15: " + qtd + 
                "\nMédia dos elementos maiores que 15: " + soma2/qtd2);
        
        
   
        
        
    }

}