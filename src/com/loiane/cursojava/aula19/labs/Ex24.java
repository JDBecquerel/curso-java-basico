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
public class Ex24 {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        int[] A = new int[10];
        boolean palindromo = true;
        
        System.out.println("Insira os elementos para verificar se o vetor é um palíndromo: ");
        
        for(int i = 0; i < 10; i++){
            
            System.out.print("A[" + i + "]: ");
            A[i] = scan.nextInt();
            
        }
        
        for(int i = 0; i < 5; i++ ){
            if(A[i] != A[A.length -1 - i]){
                palindromo = false;
            }
        }
        
        if(palindromo == true){
            
            System.out.println("\nÉ um palíndromo.");
        }
        else{
            System.out.println("\nNão é um palíndromo.");
        }
    }
    
}
