/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loiane.cursojava.exerciciosaula20;

/**
 *
 * @author thiago
 */

import java.util.Scanner;

public class Ex3 {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        int[][] A = new int[3][3];
        int qtdPar = 0, qtdImpar = 0;
        
        System.out.println("Insira os elementos na matriz A[3][3]: \n");
        
        
        //captura de valores da matriz [3][3]
        for(int i = 0; i < A.length; i++){
            for(int j = 0; j < A[i].length; j++){
                
                System.out.print(" A[" + i + "][" + j + "]: ");
                A[i][j] = scan.nextInt();
                
                if(A[i][j]%2 == 0){
                    qtdPar++;
                }
                
                else{
                    qtdImpar++;
                }
                
            }
        }
        
        System.out.println();
        
        //imprimindo matriz
        for(int i = 0; i < A.length; i++){
            for(int j = 0; j < A[i].length; j++){
                
                System.out.print(A[i][j] + "\t");
            }
            System.out.println();
        }
        
        System.out.println("\nQuantidas de pares: " + qtdPar + "\nQuantidade "
                + "ímpares: " + qtdImpar);
    
    }
}   
