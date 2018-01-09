/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loiane.cursojava.exerciciosaula27;

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
    
    void exibirDados(String modelo, String tipo, String tensão, int potencia, String cor, int garantiaMeses){
        System.out.println("Lampada tipo " + tipo);
        System.out.println("Modelo: " + modelo);
        System.out.println("Garantia: " + garantiaMeses + " meses");
        System.out.println("Potência: " + potencia + " W");
        System.out.println("Tensão: " + tensao);
        System.out.println("Cor: " + cor);
    }
    
    void verificarLampada(){
        
        if(aceso){
            System.out.println("Lampada está acesa.");
        }
        else{
            System.out.println("Lampada está apagada.");
        }
    }
    
}
