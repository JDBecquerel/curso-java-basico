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
public class AgendaCheiaException extends Exception {
    
    public String getMessage(){
        String s = "";
        s = "A agenda est� cheia e portanto o contato n�o pode ser inserido.";
        return s;
    }
}
