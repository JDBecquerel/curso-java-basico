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
public class Ex36 {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        double[] A = new double[11];
        
        for(int i = 0; i < 11; i++){
            A[i] = Math.pow(2,i);
        }
        
        System.out.print("Vetor A = ");
        
        for(int i = 0; i < A.length; i++){
            System.out.print(" " + A[i]);
        }
        
        
    }
    
}
