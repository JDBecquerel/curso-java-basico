/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loiane.cursojava.aula36.labs;

import java.util.Scanner;

/**
 *
 * @author thiago
 */
public class Exer02 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        Curso curso = new Curso();
        
        String entrada;
        System.out.println("Entre com o nome do curso: ");
        System.out.print("->");
        entrada = scan.nextLine();
        curso.setNome(entrada);
        
        
        entrada = " ";
        
        while (!entrada.equalsIgnoreCase("matutino") && !entrada.equalsIgnoreCase("noturno")
                && !entrada.equalsIgnoreCase("vespertino")) {
            
            System.out.println();
            System.out.println("\nEntre com o horário do curso:");
            System.out.print("->");
            entrada = scan.nextLine();
            curso.setHorario(entrada);
        }
        
        //exemplo de outra maneira de pensar aplicado na classe professor
        System.out.println("Entre com o nome do professor");
        System.out.print("->");
        String nomeProf = scan.nextLine();
        
        System.out.println("Entre com o email do professor");
        System.out.print("->");
        String emailProf = scan.nextLine();
        
        System.out.println("Entre com o departamento do professor");
        System.out.print("->");
        String departamentoProf = scan.nextLine();
        
        Professor professor = new Professor();
        professor.setNome(nomeProf);
        professor.setEmail(emailProf);
        professor.setDepartamento(departamentoProf);
        
        curso.setProfessor(professor);
        
        Aluno[] alunos = new Aluno[5];
        
        for(int i = 0; i < alunos.length; i++ ){
            alunos[i] = new Aluno();
            System.out.println();
            
            scan.nextLine();
            
            System.out.println("Entre com o nome do aluno " + (i+1));
            System.out.print("->");
            entrada = scan.nextLine();
            alunos[i].setNome(entrada);
            
            System.out.println("Entre com a matrícula do aluno ");
            System.out.print("->");
            entrada = scan.nextLine();
            alunos[i].setMatricula(entrada);
            
            double notas[] = new double[4];
            
            for (int j = 0; j < (alunos.length - 1); j++) {
                System.out.println("Entre com a nota " + (j + 1));
                System.out.print("->");
                notas[j] = scan.nextDouble();
            }
            
            alunos[i].setNotas(notas);
            
        }
        
        curso.setAlunos(alunos);

        System.out.println(curso.obterInfo());
    }
    
}
