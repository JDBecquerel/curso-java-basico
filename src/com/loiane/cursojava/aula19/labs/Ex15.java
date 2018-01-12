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
public class Ex15 {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        int[] A = new int[10];
        int par = 0;
        
        System.out.println("Insira os elementos do vetor A: ");
        
        for(int i = 0; i < A.length; i++){
            
            System.out.print("A[" + i + "]: ");
            A[i] = scan.nextInt();
            
            if(A[i]%2 == 0){
                par++;
            }
        }
        
        int impar = A.length - par;
        
        //A.length - 100%
        //impar      - x
        //= x.A.length == impar*100;
        //= x == (impar*100)/A.length
        int porcImpar = (impar*100)/A.length;
        int porcPar = 100 - porcImpar;
       
        System.out.println("A porcentagem dos números pares no vetor A: " + porcPar + "%");
        System.out.println("A porcentagem dos números ímpares no vetor B: " +  porcImpar + "%");
    }
    
}
