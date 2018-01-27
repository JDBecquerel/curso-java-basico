/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loiane.cursojava.aula34.labs;

/**
 *
 * @author thiago
 */
public class ConversaoDeUnidadesDeVolume {
    
    
    //1 litro = 1000 centímetros cúbicos
    //1 metro cúbico = 1000 litros
    //1 metro cúbico = 35.32 pés cúbicos
    //1 galão americano = 231 polegadas cúbicas
    //1 galão americano = 3.785 litros
    
    public static double litroCmCub(double num){
        return num*1000;
    }
    
    public static double mCubicoLitros(double num){
        return num*1000;
    }
    
    public static double mCubicoPesCubico(double num){
        return num*35.32;
    }
    
    public static double galAmericanoPolCubicas(double num){
        return num*231;
    }
    
    public static double galAmericanoLitros(double num){
        return num*3.785;
    }
    
}
