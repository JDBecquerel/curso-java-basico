/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loiane.cursojava.exerciciosaula27;

/**
 *
 * @author thiago
 */
public class Exercicio02 {
    
    public static void main(String[] args){
        
        ContaCorrente conta = new ContaCorrente();
        
        conta.num = "99103435-5";
        conta.agencia = "5543-1";
        conta.saldo = -10;
        conta.especial = true;
        conta.limiteEspecial = 500;
        conta.valorEspecialUsado = 0;
        double quantiaASacar = 200;
        
        
        conta.consultarSaldo();
        conta.verificarChequeEspecial();
        conta.sacar(200);        
        conta.consultarSaldo();
        conta.depositar(1000);
        conta.consultarSaldo();
        conta.sacar(2000);
        conta.consultarSaldo();
        conta.verificarChequeEspecial();
        conta.sacar(500);
        conta.consultarSaldo();
        conta.verificarChequeEspecial();
        conta.exibirLimite();
    }
    
}
