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
public class Ex17 {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        int[] A = new int[10];
        int qtdPessoas = 0;
        
        
        System.out.println("Insira a idade de 10 pessoas");
        
        for(int i = 0; i < 10; i++){
            
            System.out.print("Idade[" + i + "]: ");
            A[i] = scan.nextInt();
            
            if(A[i] > 35){
                qtdPessoas++;
            }
        }
        
        System.out.println("A quantidade de pessoas que possuem idade superior a 35 anos é: " + qtdPessoas);
    }
    
}
