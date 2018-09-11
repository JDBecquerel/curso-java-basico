    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loiane.cursojava.aula27.labs;

import java.util.Scanner;

/**
 *
 * @author thiago
 */

public class Exercicio03 {
    
    public static void main(String[] args){
     
        Scanner scan = new Scanner(System.in);
        Aluno aluno = new Aluno();
       
        aluno.disciplinasNotas = new String[3][4];
        
        
        double soma = 0;
        
        System.out.println("Inserindo as notas do aluno");
        
        System.out.print("\nDigite o nome do aluno: ");
        aluno.nome = scan.nextLine();
        
        System.out.print("Entre com o curso: ");
        aluno.curso = scan.nextLine();
        
        System.out.print("Digite a matrícula: ");
        aluno.matricula = scan.nextInt();

        System.out.println("Digite o nome de cada disciplina a seguir,");
        System.out.println();
        
        for(int i = 0; i < aluno.disciplinasNotas.length; i++){
            System.out.print("Disciplina[" + i + "]: ");
            aluno.disciplinasNotas[i][0] = scan.next();
            System.out.println("Obtendo notas da disciplina " + aluno.disciplinasNotas[i][0]);
            
            for(int j = 1; j < aluno.disciplinasNotas[i].length; j++){
                System.out.print("Nota[" + j + "]: ");
                aluno.disciplinasNotas[i][j] = scan.next();
            }
            System.out.println();
        }
        
        aluno.exibirInfo();
        
        for(int i = 0; i < aluno.disciplinasNotas.length; i++){
            if(aluno.avaliarAluno(i)){
                System.out.println("Disciplina " + aluno.disciplinasNotas[i][0] + " - foi aprovado");
            }
            else{
                System.out.println("Disciplina " + aluno.disciplinasNotas[i][0] + " - foi reprovado");
            }
        }
        //aluno.calcularMedia();
        
    }
    
}
