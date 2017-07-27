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
        int soma = 0;
        int qtd = 0, qtd2 = 0;
        double media = 0;
        
        System.out.println("Insira os elementos no vetor A");
        
        for(int i = 0; i < 10; i++){
            System.out.print("A[" + i + "]: ");
            A[i] = scan.nextInt();
            
            if(A[i] < 15){
                soma += A[i];
            }
            else if(A[i] == 15){
                qtd++;
            }
            else{
                media += A[i];
                qtd2++;
            }
        }
        
        media = media/qtd2;
        
        System.out.println("Soma de número < 15: " + soma + "\nQuantidade de elementos iguais a 15: " + qtd +
                "\nMédia de números > 15: " + media);
        
        
    }

}