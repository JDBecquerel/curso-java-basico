/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loiane.cursojava.aula33.labs;

import java.util.Scanner;

/**
 *
 * @author thiago
 */
public class Exercicio03 {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        Aluno aluno = new Aluno();
       
        
        double soma = 0;
        
        System.out.println("Inserindo as notas do aluno");
        
        System.out.print("\nDigite o nome do aluno: ");
        aluno.setNome(scan.nextLine());
        
        System.out.print("Entre com o curso: ");
        aluno.setCurso(scan.nextLine());
        
        System.out.print("Digite a matrícula: ");
        aluno.setMatricula(scan.nextInt());

        System.out.println("Digite o nome de cada disciplina a seguir,");
        System.out.println();
        
        for(int i = 0; i < aluno.getDisciplinasNotas().length; i++){
            System.out.print("Disciplina[" + i + "]: ");
            //aluno.getDisciplinasNotas()[i][0] = scan.next();
            aluno.setNomeDisciplinasNotas(i, 0, scan.next());
            //aluno.setNomeDisciplinaPos(i, scan.next());
            System.out.println("Obtendo as notas da disciplina " + aluno.getDisciplinasNotas()[i][0]);
            
            for(int j = 1; j < aluno.getDisciplinasNotas()[i].length; j++){
                System.out.print("Entre com a nota[" + j + "]: ");
                //aluno.getDisciplinasNotas()[i][j] = scan.next();
                aluno.setNomeDisciplinasNotas(i, j, scan.next());
            }
            System.out.println();
            
        }
        
        aluno.exibirInfo();
        
        for(int i = 0; i < aluno.getDisciplinasNotas().length; i++){
            if(aluno.avaliarAluno(i)){
                System.out.println("Disciplina " + aluno.getDisciplinasNotas()[i][0] + " - foi aprovado");
            }
            else{
                System.out.println("Disciplina " + aluno.getDisciplinasNotas()[i][0] + " - foi reprovado");
            }
        }
        //aluno.calcularMedia();
    }
    
}
