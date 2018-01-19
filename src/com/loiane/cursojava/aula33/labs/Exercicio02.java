/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loiane.cursojava.aula33.labs;

import java.util.Scanner;

/**
 *
 * @author thiago
 */
public class Exercicio02 {
    
    public static void main(String[] args){
        
        
        
        Scanner scan = new Scanner(System.in);
        ContaCorrente conta = new ContaCorrente("99103435-5", "5543-1", -10, true, 500, 0);
        
        boolean saqueEfetuado = conta.realizarSaque(10);
        
        if(saqueEfetuado){
            System.out.println("Saque efetuado com sucesso");
            System.out.println("Saldo: " + conta.consultarSaldo());
            conta.verificarUsoChequeEspecial();
        }
        else{
            System.out.println("Não foi possível realizar saque, saldo insuficiente.");
        }
        
        
        
        saqueEfetuado = conta.realizarSaque(500);        
        System.out.println("Tentativa de saque de 500 reais");
        
        if(saqueEfetuado){
            System.out.println("Saque efetuado com sucesso");
            System.out.println("Saldo: " + conta.consultarSaldo());
            conta.verificarUsoChequeEspecial();
        }
        else{
            System.out.println("Não foi possível realizar saque, saldo insuficiente.");
        }
        
        System.out.println("Depósito de 500 reais.");
        conta.depositar(500, conta.getNum(), conta.getAgencia());
        System.out.println("Saldo: " + conta.consultarSaldo());
        
        if(conta.verificarUsoChequeEspecial()){
            System.out.println("Está usando cheque especial");
        } else{
            System.out.println("Não está usando cheque especial");
        }
        
        conta.realizarSaque(600);
        System.out.println("Saldo: " + conta.consultarSaldo());
        
        if(conta.verificarUsoChequeEspecial()){
            System.out.println("Está usando cheque especial");
        } else{
            System.out.println("Não está usando cheque especial");
        }
        
    }
    
    
}
