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
public class Exercicio05 {
    
    public static void main(String[] args){
       
        ContaCorrente conta01 = new ContaCorrente();
        
        conta01.Num = "987654321";
        conta01.agencia = "5718-0";
        conta01.saldo = 500;
        conta01.especial = true;
        conta01.limite = 3000;
        
        System.out.println("O saldo da conta " + conta01.Num + " é R$ " + conta01.saldo);
        System.out.println("Agencia: " + conta01.agencia);
        System.out.println("Especial: " + conta01.especial);
        System.out.println("Limite de cheque especial: R$ " + conta01.limite);
        
    }
    
}
