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
public class Ex22 {
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        int[] A = new int[10];
        int cont0 = 0, cont1 = 0;
        
        for(int i = 0; i < 10; i++){
            
            A[i] = (int)Math.round(Math.random()*1);
            System.out.println("A[" + i + "]: " + A[i]);
            
            if(A[i] == 0){
                cont0++;
            }
            
            else if(A[i] == 1){
                cont1++;
            }
        }
        
        System.out.println("A porcentagem de números zero no vetor é de: " 
                + (cont0*10) + "%");
        System.out.println("A porcentagem de números um no vetor é de: " 
                + (cont1*10) + "%");
    }
    
}
