/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loiane.cursojava.aula21;

import java.util.Random;

/**
 *
 * @author thiago
 */
public class ForEach {
    
    public static void main(String[] args){
        
        int[] notas = new int[10];
        
        Random random = new Random();
        
        for(int i = 0; i < notas.length; i++){
            
            notas[i] = random.nextInt(10);
        }
        
        for(int i = 0; i < notas.length; i++){
            
            int nota = notas[i];
            System.out.println(nota);
        }
        
        System.out.println("Usando o loop for each");
        
        for(int nota : notas){
            System.out.println(nota);
        }
        
        // exemplo 02
        
        double[][] notasAlunos  = new double[3][4];
        
        
        for(int i = 0; i < notasAlunos.length; i++){
            for(int j = 0; j < notasAlunos[i].length; j++){
                notasAlunos[i][j] = random.nextDouble();
            }
        }
        
        System.out.println("Exemplo com arrays multidimensionais");
        
        for(double[] notasAluno : notasAlunos){
            for(double nota : notasAluno){
                System.out.println(nota + " ");
            }
            System.out.println();
        }
        
    }
    
}
