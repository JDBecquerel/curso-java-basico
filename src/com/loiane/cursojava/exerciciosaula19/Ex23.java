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
public class Ex23 {
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
     
        int[] A = new int[10];
        boolean validar = true;
        int i = 0;
        System.out.println("Insira os elementos do vetor A");
        
        while(validar && i < 10){
            System.out.print("A[" + i + "]: ");
            A[i] = scan.nextInt();
            
            if(A[i]%2 != 0){
                validar = false;
            }
            i++;
        }
    }
}
