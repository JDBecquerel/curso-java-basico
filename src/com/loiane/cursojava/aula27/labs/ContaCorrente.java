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
public class ContaCorrente {
    
    Scanner scan = new Scanner(System.in);
    
    String num;
    String agencia;
    double saldo;
    boolean especial;
    double limite;
    double limiteEspecial;
    double valorEspecialUsado;
    
    void sacar(double saque){
        
        String resposta;
        
        if(saque <= saldo){
            saldo = saldo - saque;
        }
        else{
            if(especial){
                
                double limite = limiteEspecial + saldo;
                
                System.out.println("\nNão há saldo suficiente para realizar o saque");
                System.out.print("Limite de " + limite + " do cheque especial" +
                        "\nUsar cheque especial? (sim - não): ");
                resposta = scan.next();
            
                if(resposta.equalsIgnoreCase("sim")){
                    if(limite >= saque){
                    saldo -= saque;
                    System.out.println("Operação realizada com sucesso.");
                }
                else{
                    System.out.println("Limite insuficiente para retirar " + saque + " de saque.");
                }
            }
            else{
                System.out.println("Sem limite especial. Saindo da operação...");
            }
        }
    }
        
    
        
       
    }
    
    void depositar(int valorDeposito){
        saldo = saldo + valorDeposito;  
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
    
    boolean verificarUsoChequeEspecial(){
        return saldo < 0;
    }
    
    //jeito da loiane -> mais simples (gostei)
    boolean realizarSaque(double quantiaASacar){
   
        //tem saldo na conta
        if(saldo >= quantiaASacar){
           saldo -= quantiaASacar;
           return true;
        } else{ //não tem saldo na conta
            if(especial){
                //verificar se o limite especial tem saldo
                double limite = limiteEspecial + saldo;
                if(limite >= quantiaASacar){
                    saldo -= quantiaASacar;
                    return true;
                } else{
                    return false;
                }
                    
            } else{
                return false; //não é especial e não tem saldo suficiente
            }
        }
    }
    
    void exibirLimite(){
        System.out.println("\nLimite do cheque especial: " + limite);
    }
    
}
