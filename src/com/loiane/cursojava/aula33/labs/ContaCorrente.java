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
public class ContaCorrente {
    
    Scanner scan = new Scanner(System.in);
    
    private String num;
    private String agencia;
    private double saldo;
    private boolean especial;
    private double limiteEspecial;
    private double limite;
    private double valorEspecialUsado;

    public ContaCorrente() {}

    public ContaCorrente(String num, String agencia, double saldo, boolean especial, double limiteEspecial, double valorEspecialUsado) {
        this.num = num;
        this.agencia = agencia;
        this.saldo = saldo;
        this.especial = especial;
        this.limite = limite;
        this.limiteEspecial = limiteEspecial;
        this.valorEspecialUsado = valorEspecialUsado;
    }

   
    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isEspecial() {
        return especial;
    }

    public void setEspecial(boolean especial) {
        this.especial = especial;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double getLimiteEspecial() {
        return limiteEspecial;
    }

    public void setLimiteEspecial(double limiteEspecial) {
        this.limiteEspecial = limiteEspecial;
    }

    public double getValorEspecialUsado() {
        return valorEspecialUsado;
    }

    public void setValorEspecialUsado(double valorEspecialUsado) {
        this.valorEspecialUsado = valorEspecialUsado;
    }
    /*
    private boolean saldoSuficiente(double quantiaASacar){
        
       if(getSaldo() >= quantiaASacar){
           saldo -= quantiaASacar;
           return true;
       }
       
       return false;
    }
    
    private boolean contaEspecial(double quantiaASacar){
        
        if(especial && limite >= quantiaASacar){
            
            limite = this.getLimiteEspecial() - this.getSaldo();
            saldo -= quantiaASacar;
            return true;
            
        }
        return false;
    }
    
    public boolean realizarSaque(double quantiaASacar){

        if(saldoSuficiente(quantiaASacar)){
            return saldoSuficiente(quantiaASacar);
        } else{ //não tem saldo na conta
            return contaEspecial(quantiaASacar);
        }
    }*/
    
    public boolean realizarSaque(double quantiaASacar){
   
        //tem saldo na conta
        if(saldo >= quantiaASacar){
           saldo -= quantiaASacar;
           return true;
        } else{ //não tem saldo na conta
            if(especial){
                //verificar se o limite especial tem saldo
                double limite = limiteEspecial - saldo;
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
    
    private boolean verificarContaEAgencia(String numConta, String agencia){
        return !numConta.equals(this.getNum()) || !agencia.equals(this.getAgencia());
    }
    
    private void mensagemDeposito(double valorDeposito){
        
        System.out.println("Você realizou o depósito de R$ " + valorDeposito + " na conta "
                + "de Nº " + this.getNum() + " e agencia " + this.getAgencia() + "\n");
    }
    
    public void depositar(int valorDeposito, String numConta, String agencia){
        
        numConta = "";
        agencia = "";
        System.out.println("\nDepósito");
        
        
        while(verificarContaEAgencia(numConta, agencia)){
            
            System.out.println("Digite os seguintes dados para depósito: ");
            System.out.print("Número da conta: ");
            numConta = scan.next();
            System.out.print("Agencia: ");
            agencia = scan.next();
            
            if(verificarContaEAgencia(numConta, agencia)){
                System.out.println("Dados inseridos inválidos ou incorretos, digite"
                        + "novamente");
            }
            
            if(!verificarContaEAgencia(numConta, agencia)){
                saldo += valorDeposito;
            }
        }
        
        mensagemDeposito(valorDeposito);
    }
    
    public double consultarSaldo(){
      return this.getSaldo();
    }
    
    
    private boolean usoChequeEspecial(){
        return this.saldo < 0;
    }
    public boolean verificarUsoChequeEspecial(){
        return usoChequeEspecial();
    }
    
    public void exibirLimite(){
        System.out.println("\nLimite do cheque especial: " + this.getLimiteEspecial());
    }
    
    
    
}
