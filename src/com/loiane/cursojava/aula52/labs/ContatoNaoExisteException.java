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
public class ContatoNaoExisteException extends Exception {
    
    private String nomeContato;
    
    public ContatoNaoExisteException(String nomeContato){
        this.nomeContato = nomeContato;
    }
    
    public String getMessage(){
        String s = "";
        s = "O contato " + nomeContato + " não existe na agenda\n";
        
        return s;
    }
}
