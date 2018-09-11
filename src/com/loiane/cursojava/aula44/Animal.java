/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loiane.cursojava.aula44;

/**
 *
 * @author thiago
 */
public abstract class Animal {
    
    private String nome;
    
    public Animal(){}
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public abstract String emitirSom();
}
