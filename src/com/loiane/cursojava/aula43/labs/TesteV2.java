/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loiane.cursojava.aula43.labs;

import java.util.Scanner;

/**
 *
 * @author thiago
 */
public class TesteV2 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("### Teste ContaBancaria ###\n");
        
        ContaBancaria contaSimples = new ContaBancaria();
        
        contaSimples.setNomeCliente("Cliente de conta Simples");
        contaSimples.setNumConta("9210");
        
        contaSimples.depositar(100);
        
        realizarSaque(contaSimples, 50);
        realizarSaque(contaSimples, 70);
        
        System.out.println(contaSimples);
        
        System.out.println("\n### Teste ContaPoupança ###\n");
        
        ContaPoupanca contaPoupanca = new ContaPoupanca();
        
        contaPoupanca.setNomeCliente("Cliente de conta Poupança");
        contaPoupanca.setNumConta("9210");
        contaPoupanca.setDiaRendimento(29);
        
        contaPoupanca.depositar(100);
        
        realizarSaque(contaPoupanca, 50);
        realizarSaque(contaPoupanca, 70);
        
        System.out.println();
        
        if(contaPoupanca.calcularNovoSaldo(0.005)){
            System.out.println("Rendimento aplicado, novo saldo é de R$ " + contaPoupanca.getSaldo());
        } else{
            System.out.println("Hoje não é dia de rendimento, saldo é de R$ " + contaPoupanca.getSaldo());
        }
        
        System.out.println(contaPoupanca);
        
        
        System.out.println("\n### Teste ContaEspecial ###\n");
        
        ContaEspecial contaEspecial = new ContaEspecial();
        
        contaEspecial.setNomeCliente("Cliente de conta Especial");
        contaEspecial.setNumConta("9900");
        contaEspecial.setLimite(50);
        
        contaEspecial.depositar(100);
        
        realizarSaque(contaEspecial, 50);
        realizarSaque(contaEspecial, 70);
        realizarSaque(contaEspecial, 80);
        
        System.out.println(contaEspecial);
    }
    
    private static void realizarSaque(ContaBancaria conta, double valor){
        if(conta.sacar(valor)){
            System.out.println("Saque efetuado com sucesso, novo saldo: R$ " + 
                    conta.getSaldo());
        } else{
            System.out.println("Saldo insuficiente, para Saque de R$ " + valor + "; saldo de: R$ " + conta.getSaldo());
        }
    }
    
}
