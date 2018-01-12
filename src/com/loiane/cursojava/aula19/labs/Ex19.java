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
public class Ex19 {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        float[] nota1 = new float[10];
        float[] nota2 = new float[10];
        float[] result = new float[10];
        
        System.out.println("Inserir as notas bimestrais de cada aluno ");
        
        for(int i = 0; i < 10; i++){
         
            System.out.println((i+1) + "º aluno(a)" );
            System.out.print("n1: ");
            nota1[i] = scan.nextInt();
            
            System.out.print("n2: ");
            nota2[i] = scan.nextInt();
            
            result[i] = (nota1[i] + nota2[i])/2;
            
            if(result[i] >= 7){
                System.out.println("Aprovado\n.");
            }
            else{
                System.out.println("Reprovado\n.");
            }
        }
        
        
    }
    
}
