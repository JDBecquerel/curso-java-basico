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
public class Aluno {
    
    private String nome;
    private int matricula;
    private String curso;
    private String[][] disciplinasNotas;
    private String[] nomeDisciplinas;
    private double[][] notas;
    
    Scanner scan = new Scanner(System.in);
    
    Aluno(String nome, int matricula, String curso){
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
        disciplinasNotas = new String[3][4];
    }
    
    Aluno(){
        disciplinasNotas = new String[3][4];
    }

    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public int getMatricula(){
        return matricula;
    }
    
    public void setMatricula(int matricula){
        this.matricula = matricula;
    }
    
    public String getCurso(){
        return curso;
    }
    
    public void setCurso(String curso){
        this.curso = curso;
    }

    public String[][] getDisciplinasNotas() {
        return disciplinasNotas;
    }

    public void setDisciplinasNotas(String[][] disciplinasNotas) {
        this.disciplinasNotas = disciplinasNotas;
    }

    public String[] getNomeDisciplinas() {
        return nomeDisciplinas;
    }

    public void setNomeDisciplinas(String[] nomeDisciplinas) {
        this.nomeDisciplinas = nomeDisciplinas;
    }

    public double[][] getNotas() {
        return notas;
    }

    public void setNotas(double[][] notas) {
        this.notas = notas;
    }
    
    private double somaNotas(int indice){
        double soma = 0;
        for(int i = 1; i < (this.getDisciplinasNotas().length+1); i++){
            soma += Double.parseDouble(this.getDisciplinasNotas()[indice][i]);
        }
        
        return soma;
    }
    
    private double calcularMedia(int indice){
        double media = 0;
        media = somaNotas(indice)/3;
         
        return media;     
    }
    
    private boolean verificarAprovado(int indice){
        if(calcularMedia(indice)>= 7){
            return true;
        }
        return false;
    }
    
    public boolean avaliarAluno(int indice){
        return verificarAprovado(indice);
    }
    
    public void inserirDados(){
        
        
    }
    
    public void exibirInfo(){
        int j = 0;
        //double soma = 0;
        //double media = 0;
        
        System.out.println("Nome: " + this.getNome());
        System.out.println("Matrícula: " + this.getMatricula());
        System.out.println("Nome do curso: " + this.getCurso());
        
        for(int i = 0; i < this.getDisciplinasNotas().length; i++){
            System.out.println("As notas da disciplina de " + this.getDisciplinasNotas()[i][j] + " são: ");
            
            for(j = 1; j < this.getDisciplinasNotas()[i].length; j++){
                System.out.print(this.getDisciplinasNotas()[i][j] + " ");

            }
            System.out.println();
            j = 0;
        }
    }
    
    public void setNomeDisciplinaPos(int pos, String nomeDisciplina){
        this.nomeDisciplinas[pos] = nomeDisciplina;
    }
    
    public void setNomeDisciplinasNotas(int posI, int posJ, String nomeDisciplina){
        this.disciplinasNotas[posI][posJ] = nomeDisciplina;
    }
    
}
