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
public class Teste {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        ContaPoupanca contaPoup = new ContaPoupanca();
        ContaEspecial contaEsp = new ContaEspecial();
        
        String entrada = "";
        
        contaPoup.setSaldo(2000);
        
        contaEsp.setSaldo(1000);
        contaEsp.setLimite(500);
        
        System.out.println("Saldo conta poupança - R$ " + contaPoup.getSaldo());
        System.out.println("Saldo conta especial - R$ " + contaEsp.getSaldo());
        System.out.println();
        
        contaPoup.sacar(3000);
        contaPoup.sacar(500);
        System.out.println();
        contaEsp.sacar(700);
        contaEsp.sacar(500);
        
        System.out.println("Saldo conta poupança - R$ " + contaPoup.getSaldo());
        System.out.println("Saldo conta especial - R$ " + contaEsp.getSaldo());
        System.out.println();
        
        
        contaEsp.depositar(1000);
        contaPoup.depositar(700);
        
        System.out.println("Saldo conta poupança - R$ " + contaPoup.getSaldo());
        System.out.println("Saldo conta especial - R$ " + contaEsp.getSaldo());
        
        contaPoup.calcularNovoSaldo(0.05);
        
        
        System.out.println("Saldo ao rendimento de 1%: R$ " + contaPoup.getSaldo());
        
        System.out.println("\nEntre com os dados da conta poupança: ");
        System.out.print("Nome do cliente: ");
        entrada = scan.nextLine();
        contaPoup.setNomeCliente(entrada);
        
        System.out.print("O número da conta: ");
        entrada = scan.nextLine();
        contaPoup.setNumConta(entrada);
        
        System.out.println("\nEntre com os dados da conta especial: ");
        System.out.print("Nome do cliente: ");
        entrada = scan.nextLine();
        contaEsp.setNomeCliente(entrada);
        
        System.out.print("O número da conta: ");
        entrada = scan.nextLine();
        contaEsp.setNumConta(entrada);
        
        System.out.println(contaPoup);
        System.out.println("\n");
        System.out.println(contaEsp);
        
    }
    
}
