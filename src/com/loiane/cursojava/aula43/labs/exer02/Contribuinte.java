/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loiane.cursojava.aula43.labs.exer02;

/**
 *
 * @author thiago
 */
public abstract class Contribuinte {
        
    private String nome;
    private double rendaBruta;
    
    public Contribuinte(){}

    public Contribuinte(String nome, double imposto) {
        this.nome = nome;
    }
    
    
    public Contribuinte(String nome) {
        this.nome = nome;
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

    public double getRendaBruta(){
        return rendaBruta;
    }
    
    public void setRendaBruta(double rendaBruta){
        this.rendaBruta = rendaBruta;
    }
    public abstract double calcularImposto();
    
    public String toString(){
        String s = "\nNome: " + nome;
        s += "\nRenda bruta: " + rendaBruta;
        
        return s;
    }
    
        
    
}
