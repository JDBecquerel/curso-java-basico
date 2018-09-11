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
public class Aluno {
    
    private String nome;
    private String matricula;
    private double[] notas;

    
    Aluno(){
        notas = new double[4];
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
     * @return the matricula
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    /**
     * @return the notas
     */
    public double[] getNotas() {
        return notas;
    }

    /**
     * @param notas the notas to set
     */
    public void setNotas(double[] notas) {
        this.notas = notas;
    }
    
    
    public double calcularMedia(){
        double media = 0;
        double soma = 0;
        
        for(int i = 0; i < notas.length; i++){
            soma += notas[i];
        }
        
        media = soma/4;
        
        return media;
    }
    
    public boolean verificarAprovado(){
        
        if(calcularMedia() >= 7){
            return true;
        }
        return false;
        
    }
    
    public String obterInfo(){
        String info = "\n";
        
        info += "Nome do aluno: " + nome + "; Matrícula: " + matricula;
        info += "; Notas: ";
        
        for(double nota: notas){
            info += " " + nota;
        }
        info += "; Media: " + calcularMedia() + " - ";
        
        if(verificarAprovado()){
            info += "Aprovado";
        } else{
            info += "Reprovado";
        }
        
        return info;
    }
    
}
