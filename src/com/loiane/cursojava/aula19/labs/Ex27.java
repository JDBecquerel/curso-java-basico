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
public class Ex27 {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        int[] A = new int[10];
        char[] B = new char[10];
        
        System.out.println("Insira os valores do vetor A");
        
        for(int i = 0; i < 10; i++){
            System.out.print("A[" + i + "]: ");
            A[i] = scan.nextInt();
            
            if(A[i] < 7){
                B[i] = 'a';
            }
            else if(A[i] == 7){
                B[i] = 'b';
            }
            else if(A[i] > 7 && A[i] < 10){
                B[i] = 'c';
            }
            else if(A[i] == 10){
                B[i] = 'd';
            }
            else{
                B[i] = 'e';
            }
        }
        
        System.out.println("\n");
        
        for(int i = 0; i < 10; i++){
            System.out.println("B[" + i + "]: " + B[i]);
        }
        
    }
    
}
