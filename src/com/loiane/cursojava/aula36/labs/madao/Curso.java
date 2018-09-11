/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loiane.cursojava.aula36.labs.madao;

/**
 *
 * @author thiago
 */
public class Curso {
    
    private String nome;
    private String horario;
    private Professor professor;
    private Aluno[] alunos;
    
    /**
     * @return the alunos
     */
    public Aluno[] getAlunos() {
        return alunos;
    }

    /**
     * @param alunos the alunos to set
     */
    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the horario
     */
    public String getHorario() {
        return horario;
    }

    /**
     * @param horario the horario to set
     */
    public void setHorario(String horario) {
        this.horario = horario;
    }

    /**
     * @return the professor
     */
    public Professor getProfessor() {
        return professor;
    }

    /**
     * @param professor the professor to set
     */
    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
    
    public double calcularMediaTurma(){
        double mediaTurma = 0;
        double soma = 0;
        
        for(int i = 0; i < alunos.length; i++){
            soma += alunos[i].calcularMedia();
        }
        
        mediaTurma = soma/alunos.length;
        
        return mediaTurma;
    }
    
    public String obterInfo(){
        String info = "\n";
        info += "Nome do curso: " + nome + "\nHorário: " + horario + "\n";
        
        if(professor != null){
            info += professor.obterInfo();
            info += "\n\n";
        }
        
        if(alunos != null){
            for(Aluno aluno: alunos){
                info += aluno.obterInfo();
                info += "\n";
            }
        }
        
        info += "\nMédia da turma: " + calcularMediaTurma();
        
        return info;
        
    }
    
}
