/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loiane.cursojava.aula48;

/**
 *
 * @author thiago
 */
public class MultiplosCatchJava7 {
     
    public static void main(String[] args) {
        
        int[] numeros = {4, 8, 16, 32, 64, 128};
        int[] denominadores = {2, 0, 4, 8, 0};
        
        for(int i = 0; i < numeros.length; i++){
            
            try{
                System.out.println(numeros[i] + "/" + denominadores[i] + " = " + (numeros[i]/denominadores[i]));
            } 
            catch(ArithmeticException | ArrayIndexOutOfBoundsException e1){
                System.out.println("Ocorreu um erro");
            } 
        }
    }
}
