/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loiane.cursojava.aula52;

/**
 *
 * @author thiago
 */
public class UsandoMinhaException {
     
    public static void main(String[] args){
        
        int[] numeros = {4, 8, 5, 16, 32, 21, 64, 128};
        int[] denominadores = {2, 0, 4, 8, 0, 2, 3};
        
        for(int i = 0; i < numeros.length; i++){
            
            try{
                if(numeros[i] % 2 != 0){
                    //lançar a exception aqui
                    throw new DivisaoNaoExata(numeros[i], denominadores[i]);
                }
                System.out.println(numeros[i] + "/" + denominadores[i] + " = " + (numeros[i]/denominadores[i]));
            } 
            catch(ArithmeticException | ArrayIndexOutOfBoundsException | DivisaoNaoExata e1){
                System.out.println("Aconteceu um erro");
                e1.printStackTrace();
            }   
        }
    }
}
