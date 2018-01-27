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
public class ConversaoDeUnidadesDeArea {
    
    
    
        //1 metro quadrado - 10.76 pés quadrados
        //1 pé quadrado - 929 centímetros quadrados
        //1 milha quadrada - 640 acres
        //1 acre - 43.560 pés quadrados
    
    public static double metroQuadradoPe(double num){
        return num*10.76;
    }
    
    public static double peQuadradoCm(double num){
        return num*929;
    }
    
    public static double milhaQuadradaAcres(double num){
        return num*640;
    }
    
    public static double acrePesQuadrados(double num){
        return num*43560;
    }
    
}
