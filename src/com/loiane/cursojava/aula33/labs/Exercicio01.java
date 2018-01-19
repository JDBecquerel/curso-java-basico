 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loiane.cursojava.aula33.labs;

/**
 *
 * @author thiago
 */
public class Exercicio01 {
    
    public static void main(String[] args){
        
        Lampada lampada = new Lampada();
        boolean aceso = false;
        
        if(!lampada.isAceso()){
            //lampada.setAceso(true);
            lampada.acenderLampada();
        }
        
        lampada.mostrarEstado();
        
        lampada.apagarLampada();
        lampada.mostrarEstado();
        /*
        System.out.println("\nModelo: " + lampada.getModelo());
        System.out.println("Tensão: " + lampada.getTensao());
        System.out.println("Potência: " + lampada.getPotencia());
        System.out.println("Cor: " + lampada.getCor());
        System.out.println("Tipo de luz: " + lampada.getTipoLuz());
        System.out.println("garantia de: " + lampada.getGarantiaMeses() + " meses.");*/
        
        lampada.mudarEstado(aceso);
        lampada.mostrarEstado();
        
        
        lampada.mudarEstado(aceso);
        lampada.mostrarEstado();
        
        lampada.mudarEstado(aceso);
        lampada.mostrarEstado();
        
    }
    
}
