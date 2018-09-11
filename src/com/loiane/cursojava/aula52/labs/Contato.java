/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loiane.cursojava.aula52.labs;

/**
 *
 * @author thiago
 */
public class Contato {
    
    private String nome;
    private String telefone;
    private int identificador;
    private int contador;

    public Contato() {
        contador++;
    }
    
    
    
    public Contato(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
        contador++;
        this.identificador = contador;
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }
    
    
    
    
}
