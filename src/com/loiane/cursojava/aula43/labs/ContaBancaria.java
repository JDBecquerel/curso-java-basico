/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loiane.cursojava.aula43.labs;

/**
 *
 * @author thiago
 */
public class ContaBancaria {
    
    private String nomeCliente;
    private String numConta;
    private double saldo;

    
    public ContaBancaria(){}
    
    public ContaBancaria(String nomeCliente, String numConta, double saldo){
        this.nomeCliente = nomeCliente;
        this.numConta = numConta;
        this.saldo = saldo;
    }
    
    
    /**
     * @return the nomeCliente
     */
    public String getNomeCliente() {
        return nomeCliente;
    }

    /**
     * @param nomeCliente the nomeCliente to set
     */
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    /**
     * @return the numConta
     */
    public String getNumConta() {
        return numConta;
    }

    /**
     * @param numConta the numConta to set
     */
    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    
    //outros métodos
    public boolean sacar(double valorSacar){
        
        if(saldo > 0 && saldo >= valorSacar){
            saldo -= valorSacar;
            return true;
        }
        
        return false;
    }
    
    public void depositar(double deposito){
        this.saldo += deposito;
    }
    
    public String toString(){
        String s;
        s = "\nConta Bancaria";
        s += "\nNome do cliente: " + nomeCliente;
        s += "\nNúmero da conta: " + numConta;
        s += "\nSaldo: R$ " + saldo;
        
        return s;
    }
    
}
