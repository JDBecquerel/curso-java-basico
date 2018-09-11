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
public class Agenda {
    
    private Contato[] contatos;
    

    public Contato[] getContatos() {
        return contatos;
    }

    public void setContatos(Contato[] contatos) {
        this.contatos = contatos;
    }
    
    public void adicionarContato(Contato contato, int i){
        contatos[i] = contato;
    }
    
    public boolean consultarContato(String nome, int i){
        if(this.contatos[i].getNome() == nome ){
           return true; 
        }
        return false;
    }
    
    public boolean consultarContato(int identificador, int i){
        if(this.contatos[i].getIdentificador() == identificador ){
           return true; 
        }
        return false;
    }
    
    public boolean consultarContato(String nome, int identificador, int i){
        if(this.contatos[i].getNome() == nome && this.contatos[i].getIdentificador() == identificador ){
           return true; 
        }
        return false;
    }
    
    
}
