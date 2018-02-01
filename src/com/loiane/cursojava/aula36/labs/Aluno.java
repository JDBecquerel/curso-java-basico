/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loiane.cursojava.aula36.labs;

/**
 *
 * @author thiago
 */
public class Aluno {
    
    private String nome;
    private String matricula;
    private double[] notas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }
    
    public double obterMedia(){
        double soma = 0;
        for(double nota : notas){
            soma += nota;
        }
        
        return soma/4;
    }
    
    public String obterInfo(){
        
        String info = "Nome do Aluno = " + nome + "; ";
        info += "Matricula = " + matricula + "; ";
        info += "Notas: ";
        
        double soma = 0;
        for(double nota : notas){
            info += nota + " ";
            soma += nota;
        }
        double media = soma/4;
        info += "\n" + "Media = " + media + " - ";
        if(media >= 7){
            info += "Aprovado!";
        } else{
            info += "Reprovado!";
        }
        return info;
    }
}
