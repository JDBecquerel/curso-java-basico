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
public class ContaEspecial extends ContaBancaria {
    
    private double limite;
    
    public ContaEspecial(){}
    
    public ContaEspecial(double limite){
        this.limite = limite;
    }
    
    public ContaEspecial(String nomeCliente, String numConta, double saldo, double limite){
        super(nomeCliente, numConta, saldo);
        this.limite = limite;
        
    }
    /**
     * @return the limite
     */
    public double getLimite() {
        return limite;
    }
    
    public void setLimite(double limite){
        this.limite = limite;
    }
    
    
    public boolean sacar(double valorSacar){
        
        double saldoComLimite = this.getSaldo() + limite;
        
        if(saldoComLimite > 0 && saldoComLimite >= valorSacar){
            super.setSaldo(super.getSaldo() - valorSacar);
            return true;
        }
        
        return false;
        
    }
    
    public String toString(){
        String s;
        s = "\nConta Especial";
        s += "\nLimite: " + limite; 
        s += super.toString();

        return s;
    }
}
