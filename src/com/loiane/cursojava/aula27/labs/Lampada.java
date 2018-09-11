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
public class Lampada {
    
    String modelo;
    String tensao;
    int potencia;
    String cor;
    String tipoLuz;
    int garantiaMeses;
    String[] tipos;
    boolean aceso;
    
    void acenderLampada(){
        aceso = true;
    }
    
    void apagarLampada(){
        aceso = false;
 
    }
    
    
    void verificarLampada(){
        
        if(aceso){
            System.out.println("Lampada está acesa.");
        }
        else{
            System.out.println("Lampada está apagada.");
        }
    }
    
    void mudarEstado(){
        if(aceso){
            aceso = false;
        }
        else{
            aceso = true;
        }
    }
    
}
