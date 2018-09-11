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
    
    public String toString(){
        String s = "";
        s = "O contato não existe";
        
        return s;
    }
}
