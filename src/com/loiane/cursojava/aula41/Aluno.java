/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loiane.cursojava.aula41;

import com.loiane.cursojava.aula40.*;

/**
 *
 * @author thiago
 */
public class Aluno extends Pessoa {
    
    
    private String curso;
    private double[] notas;
    
    public Aluno(){
        super();
    }
    
    public Aluno(String nome, String endereco, String telefone, String curso){
        super(nome, endereco, telefone);
        this.curso = curso;
    }
    
    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }
    
    public double calcularMedia(){
        return 0;
    }
    
    public boolean verificarAprovado(){
        return true;
    }
    
    public String obterEtiquetaEndereco(){
        
        String s = "Endereco do aluno: ";
        s += super.getEndereco();
        
        return s;
    }

    @Override
    public void imprimirEtiquetaEndereco() {
        System.out.println("Imprimindo endereço do aluno: ");
        System.out.println(this.obterEtiquetaEndereco());
    }
    
}
