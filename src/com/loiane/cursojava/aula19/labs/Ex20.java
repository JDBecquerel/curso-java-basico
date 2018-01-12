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
public class Ex20 {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        float[] A = new float[20];
        float cot;
        
        System.out.print("Insira a cotação do dólar (U$) em relação ao real (R$): ");
        cot = scan.nextFloat();
        
        //21
        for(int i = 0; i < 20; i++){
            
            A[i] = (i+1)*cot;
            
            System.out.println(cot + "*" + (i+1) + " = " + A[i]);
        }
        
        
    }
    
}
