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
public class Calculadora {
    
    
    Calculadora(){ }
    
    public static int somar(int num1, int num2){
        return num1 + num2;
    }
    
    public static double somar(double num1, double num2){
        return num1 + num2;
    }
    
    public static int subtrair(int num1, int num2){
        return num1 - num2;
    }
    
    public static double subtrair(double num1, double num2){
        return num1 - num2;
    }
    
    public static int dividir(int num1, int num2){
        return num1/num2;
    }
    
    public static double dividir(double num1, double num2){
        return num1/num2;
    }
    
    
    public static double elevarAPotencia(double num1, double num2){
        return Math.pow(num1, num2);
    }
    
}
