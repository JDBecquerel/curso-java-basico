/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loiane.cursojava.exerciciosaula27;

import java.util.Scanner;

/**
 *
 * @author thiago
 */
public class ContaCorrente {
    
    Scanner scan = new Scanner(System.in);
    
    String num;
    String agencia;
    double saldo;
    boolean especial;
    double limite;
    
    void sacar(int saque){
        
        String resposta;
        
        if(saque <= saldo && saldo >= 20 && limite > 200){
            
            saldo = saldo - saque;
            
        }
        
        else if(saque > saldo  && limite > 200){
            
            System.out.println("\nNão há saldo suficiente para realizar o saque");
            System.out.print("Limite de " + limite + " do cheque especial" +
                    "\nUsar cheque especial? (sim - não): ");
            resposta = scan.next();
            
            if(resposta.equalsIgnoreCase("sim")){
                saldo = saldo - saque;
                if(saldo >0){
                    limite = limite - saldo;
                }
                else{
                    limite = limite + saldo;
                }
            }
            else{
                System.out.println("Saindo da operação...");
            }
        }
        
        else{
            System.out.println("Não há saldo suficiente para realizar o saque\n");
        }
        
    }
    
    void depositar(int valorDeposito){
        
        String numConta = "";
        String agencia2 = "";
        System.out.println("\nDepósito");
        
        
        while(!numConta.equals(num) || !agencia2.equals(agencia)){
            
            System.out.println("Digite os seguintes dados para depósito: ");
            System.out.print("Número da conta: ");
            numConta = scan.next();
            System.out.print("Agencia: ");
            agencia2 = scan.next();
            saldo = saldo + valorDeposito;
        }
        
        System.out.println("Você realizou o depósito de R$ " + valorDeposito + " na conta "
                + "de Nº " + num + " e agencia " + agencia + "\n");
        
    }
    
    void consultarSaldo(){
            
        System.out.println("O saldo é R$ " + saldo);
    }
    
    void verificarChequeEspecial(){
        
        if(saldo < 0){
            System.out.println("O cliente está usando cheque especial");
        }
        else{
            System.out.println("O cliente não está usando cheque especial");
        }
    }
    
    void exibirLimite(){
        System.out.println("\nLimite do cheque especial: " + limite);
    }
    
}
