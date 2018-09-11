/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loiane.cursojava.aula27.labs;

/**
 *
 * @author thiago
 */
public class Exercicio01 {
    
    public static void main(String[] args){
        
        Lampada lampada = new Lampada();
        
        
        
        lampada.acenderLampada();
        lampada.verificarLampada();
        
        lampada.apagarLampada();
        lampada.verificarLampada();
        
        lampada.mudarEstado();
        lampada.verificarLampada();
        
        lampada.mudarEstado();
        lampada.verificarLampada();
    }
    
}
