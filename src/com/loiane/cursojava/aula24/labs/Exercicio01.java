/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loiane.cursojava.aula24.labs;

/**
 *
 * @author thiago
 */
public class Exercicio01 {
    
    public static void main(String[] args){
        
        Lampada lampada01 = new Lampada();
        
        lampada01.modelo = "5W100WE27";
        lampada01.garantiaMeses = 3;
        lampada01.potencia = 100;
        lampada01.tensao = "Bivolt";
        lampada01.cor = "Branca";
        
        lampada01.tipos = new String[1];
        
        lampada01.tipos[0] = "Led";
        
        
        System.out.println("Lampada tipo " + lampada01.tipos[0]);
        System.out.println("Modelo: " + lampada01.modelo);
        System.out.println("Garantia: " + lampada01.garantiaMeses + " meses");
        System.out.println("Potência: " + lampada01.potencia + " W");
        System.out.println("Tensão: " + lampada01.tensao);
        System.out.println("Cor: " + lampada01.cor);
    }
    
}
