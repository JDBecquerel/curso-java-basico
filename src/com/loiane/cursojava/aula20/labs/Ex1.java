/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loiane.cursojava.aula20.labs;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author thiago
 */
public class Ex1 {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        Random generico = new Random();
        
        int[][] matriz = new int[4][4];
        
        int maior = 0, posI = 0, posJ = 0;
        
         for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                
                matriz[i][j] = generico.nextInt(100);
                if(maior < matriz[i][j]){
                    maior = matriz[i][j];
                    posI = i;
                    posJ = j;
                }
            }
        }
        
        
        
       System.out.println("Imprimindo a matriz A: \n");
         
       for(int i = 0; i < matriz.length; i++){
           
            for(int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j] + "\t");
                
            }
            
            System.out.println();
        }
       
       System.out.println("\nMaior na matriz [4][4]: " + maior + "\nPosição do "
               + "maior: " + "Linha = " + posI + " e Coluna = " + posJ);
   }
}
