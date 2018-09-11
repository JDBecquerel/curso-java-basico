/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loiane.cursojava.aula38;

/**
 *
 * @author thiago
 */
public class Professor extends Pessoa {
    
    private double salario;
    private String nomeCurso;
    
    
    public Professor(){
        
    }
    
    public Professor(String nome, String endereco, String telefone, double salario, String curso){
        super(nome, endereco, telefone);
        this.salario = salario;
        this.nomeCurso = curso;
    }
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }
    
    public double calcularSalarioLiquido(){
        return 0;
    }
}
