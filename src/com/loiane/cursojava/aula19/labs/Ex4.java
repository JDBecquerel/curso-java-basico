/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loiane.cursojava.aula19.labs;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author thiago
 */
public class Ex4 {
    
    public static void main(String[] args){
       
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###,###.###");
        
        
        double [] vetorA = new double[15];
        
        for(int i = 0; i < vetorA.length; i++){
            System.out.print("Digite o número a ser inserido na posição " + i + ":");
            vetorA[i] = scan.nextInt();
        }
        
        double[] vetorB = new double[vetorA.length];
        
        for(int i = 0; i < vetorA.length; i++){
            vetorB[i] = Math.sqrt(vetorA[i]);
        }
        
        System.out.print("VetorB: ");
        
        for(int i = 0; i < vetorA.length; i++){
            System.out.print(df.format(vetorB[i]) + " ");
        }
        
        
    }
    
}
