/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loiane.cursojava.aula43;

import java.util.Arrays;
import java.util.Objects;


/**
 *
 * @author thiago
 */
public class Aluno{
    
    
    private String curso;
    private double[] notas;
    
    public Aluno(){
        super();
    }
    
    public Aluno(String nome, String endereco, String telefone, String curso){
        //super(nome, endereco, telefone);
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
        //s += super.getEndereco();
        
        return s;
    }

    //@Override
    public void imprimirEtiquetaEndereco() {
        System.out.println("Imprimindo endereço do aluno: ");
        System.out.println(this.obterEtiquetaEndereco());
    }
    
    //exemplo 01 de mexer no método toString da classe Object
    /*public String toString(){
        String s = curso + "\n";
        for(double nota: notas){
            s += nota + " ";
        }
        return s;
    }*/
    
    //caso seja n atributos, faz a mesma coisa do de cima
    //mas não tinha o método Array.toString(notas), logo imprimiu a referência
    //do vetor e não os valores nele
    @Override
    public String toString() {
        return "Aluno{" + "curso=" + curso + ", notas=" + notas + '}';
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        
        final Aluno other = (Aluno) obj;
        //apagou o que estava aqui e vai verificar somente o nome
        if(curso.equalsIgnoreCase(other.getCurso())){
            return true;
        }
        //as notas não importam nesse caso, queremos verificar o nome
        return false;
    }
    
    
}
