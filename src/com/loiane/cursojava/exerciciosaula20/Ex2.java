/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loiane.cursojava.exerciciosaula20;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author thiago
 */
public class Ex2 {
    
    public static void main(String[] args ){
        
        Scanner scan = new Scanner(System.in);
        Random gerador = new Random();
        
        int[][] A = new int[10][10];
        int i = 0, j = 0;
        int maior = 0, menor = 10;
        
        
        //gerando os valores aleatorios da matriz [10][10]
         for(i = 0; i < A.length; i++){
            for(j = 0; j < A[i].length; j++){
                A[i][j] = gerador.nextInt(10);
            }
        }
         
         //imprimindo a matriz
         
       System.out.println("Imprimindo a matriz: \n");
         
       for(i = 0; i < A.length; i++){
           
            for(j = 0; j < A[i].length; j++){
                System.out.print(A[i][j] + "\t");
            }
            System.out.println();
        }
       
       System.out.println();
         
         
         //maior e menor valor da linha 5
         i = 5;
         for(j = 0; j < A[i].length; j++){
             if(maior < A[i][j]){
                 maior = A[i][j];
             }
             else if(menor > A[i][j]){
                 menor = A[i][j];
             }
         }
         
         System.out.println("Linha 5: maior valor: " + maior + " e o menor valor: " + menor);
         
         
         //maior e menor valor da coluna 7
         
         maior = 0;
         menor = 10;
         j = 7;
         for(i = 0; i < A.length; i++){
             if(maior < A[i][j]){
                 maior = A[i][j];
             }
             else if(menor > A[i][j]){
                 menor = A[i][j];
             }
         }
         
         System.out.println("Coluna 7: maior valor: " + maior + " e o menor valor: " + menor);
        
        
    }
    
}
