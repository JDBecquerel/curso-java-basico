/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loiane.cursojava.aula27.labs;

import java.util.Scanner;

/**
 *
 * @author thiago
 */
public class Exercicio02 {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        ContaCorrente conta = new ContaCorrente();
        
        conta.num = "99103435-5";
        conta.agencia = "5543-1";
        conta.saldo = -10;
        conta.especial = true;
        conta.limiteEspecial = 500;
        conta.valorEspecialUsado = 0;
        
        boolean saqueEfetuado = conta.realizarSaque(10);
        if(saqueEfetuado){
            System.out.println("Saque realizado com sucesso.");
            conta.consultarSaldo();
        } else{
            System.out.println("Saldo insuficiente. Não foi possível realizar o saque.");
        }
        
        saqueEfetuado = conta.realizarSaque(500);
        if(saqueEfetuado){
            System.out.println("Saque realizado com sucesso.");
            conta.consultarSaldo();
        } else{
            System.out.println("Saldo insuficiente. Não foi possível realizar o saque.");
        }
        
        System.out.println("Depósito de 500 reais");
        conta.depositar(500);
        conta.consultarSaldo();
        
        if(conta.verificarUsoChequeEspecial()){
            System.out.println("Está usando cheque especial");
        } else{
            System.out.println("Não está usando cheque especial");
        }
        
        conta.realizarSaque(600);
        if(conta.verificarUsoChequeEspecial()){
            System.out.println("Está usando cheque especial");
        } else{
            System.out.println("Não está usando cheque especial");
        }
        
    }
    
}
