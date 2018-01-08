/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loiane.cursojava.aula20;

import com.loiane.cursojava.aula19.*;
import java.util.Scanner;

/**
 *
 * @author thiago
 */
public class Matrizes {
    
    public static void main(String[] args){
        
        double[][] notasAlunos = new double[4][4];
        
        notasAlunos[0][0] = 10;
        notasAlunos[0][1] = 7;
        notasAlunos[0][2] = 8;
        notasAlunos[0][3] = 9.5;
        
        notasAlunos[1][0] = 9;
        notasAlunos[1][1] = 8;
        notasAlunos[1][2] = 7;
        notasAlunos[1][3] = 9;
        
        notasAlunos[2][0] = 8;
        notasAlunos[2][1] = 9;
        notasAlunos[2][2] = 10;
        notasAlunos[2][3] = 7;
        
        notasAlunos[3][0] = 9;
        notasAlunos[3][1] = 8;
        notasAlunos[3][2] = 7;
        notasAlunos[3][3] = 9;
        
        for(int i = 0; i < notasAlunos.length; i++){
            
            //System.out.println("\n" + (i+1) + "º aluno(a): ");
            for(int j = 0; j < notasAlunos[i].length; j++){
                //System.out.println("A[" + i + "][" + j + "]: " + notasAlunos[i][j]);
                System.out.print(notasAlunos[i][j] + "\t");
            }
            System.out.println();
        }
        
        notasAlunos[1][3] = 0;
        
        System.out.println();
        
        for(int i = 0; i < notasAlunos.length; i++){
            
            //System.out.println("\n" + (i+1) + "º aluno(a): ");
            for(int j = 0; j < notasAlunos[i].length; j++){
                System.out.print(notasAlunos[i][j] + "\t");
            }
            System.out.println();
        }
        
        System.out.println("\nCalculando a média de cada aluno: ");
        
        double soma = 0;
        
        for(int i = 0; i < notasAlunos.length; i++){
            soma = 0;
            //System.out.println("\n" + (i+1) + "º aluno(a): ");
            for(int j = 0; j < notasAlunos[i].length; j++){
                soma += notasAlunos[i][j];
            }
            System.out.println("Média do aluno "+ (i+1) + " é = " + soma/4 );
        }
        
        double[] notasAluno1 = {7, 8, 9, 10};
        
        double[][] notasAlunos2 = {{7, 8, 9, 10}, {8, 6, 7, 10}};
        
        
        System.out.println("\nOutput da matriz notasAlunos2: ");
        for(int i = 0; i < notasAlunos2.length; i++){

            for(int j = 0; j < notasAlunos2[i].length; j++){
                System.out.print(notasAlunos2[i][j] + "\t");
            }
            System.out.println();
        }
    }
    
}
