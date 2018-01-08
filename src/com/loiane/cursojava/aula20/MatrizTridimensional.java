/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loiane.cursojava.aula20;

import java.util.Scanner;

/**
 *
 * @author thiago
 */
public class MatrizTridimensional {
    
    public static void main(String[] args){
        
        int[][][] matrizTridimensional = new int[3][3][3];
        
        for(int i = 0; i < matrizTridimensional.length; i++){
            for(int j = 0; j < matrizTridimensional[i].length; j++){
                for(int k = 0; k < matrizTridimensional[i][j].length; k++){
                    System.out.println("\ni = " + i + "\nj = " + j + "\nk = " + k);
                    matrizTridimensional[i][j][k] = i + j + k;
                }
            }
        }
        
        int soma = 0;
        int somaPares = 0;
        int somaImpares = 0;
        
        for(int i = 0; i < matrizTridimensional.length; i++){
            for(int j = 0; j < matrizTridimensional[i].length; j++){
                for(int k = 0; k < matrizTridimensional[i][j].length; k++){
                    soma += matrizTridimensional[i][j][k];
                    
                    if(matrizTridimensional[i][j][k]%2 == 0){
                        somaPares += matrizTridimensional[i][j][k];
                    }
                    
                    else{
                        somaImpares += matrizTridimensional[i][j][k];
                    }
                }
            }
        }
        
        System.out.println("\nA soma total: " + soma
        + "\nA soma dos pares:" + somaPares + "\nA soma dos ímpares: " + somaImpares);
        
        
    }
    
}
