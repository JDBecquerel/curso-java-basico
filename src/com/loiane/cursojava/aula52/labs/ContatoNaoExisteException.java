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
    private int id;
    
    
    public ContatoNaoExisteException(String nomeContato){
        this.nomeContato = nomeContato;
    }
    
    public ContatoNaoExisteException(int id){
        this.id = id;
    }
    public String getMessage(){
        String s = "";
        s = "\nO contato com o id " + id + " não existe na agenda\n";
        
        return s;
    }
}
