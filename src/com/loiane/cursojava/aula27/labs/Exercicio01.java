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
        
        lampada.modelo = "5W100WE27";
        lampada.garantiaMeses = 3;
        lampada.potencia = 100;
        lampada.tensao = "Bivolt";
        lampada.cor = "Branca";
        
        lampada.tipos = new String[1];
        
        lampada.tipos[0] = "Led";
        
        
        lampada.exibirDados(lampada.modelo, lampada.tipos[0], lampada.tensao, lampada.potencia, lampada.cor, lampada.garantiaMeses);
        System.out.println();
        
        lampada.aceso = false;
        
        lampada.acenderLampada();
        lampada.verificarLampada();
        lampada.apagarLampada();
        lampada.verificarLampada();
    }
    
}
