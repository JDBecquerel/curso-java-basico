/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loiane.cursojava.aula43.labs;

import java.util.Calendar;

/**
 *
 * @author thiago
 */
public class ContaPoupanca extends ContaBancaria {
    
    private int diaRendimento;
    
    //construtores
    public ContaPoupanca(){}

    public ContaPoupanca(String nomeCliente, String numConta, double saldo, int diaRendimento) {
        super(nomeCliente, numConta, saldo);
        this.diaRendimento = diaRendimento;
    }
    
    public ContaPoupanca(String nomeCliente, String numConta, double saldo) {
        super(nomeCliente, numConta, saldo);
    }
    
    public ContaPoupanca(int diaRendimento) {
        this.diaRendimento = diaRendimento;
    }
    
    //getters and setters
    /**
     * @return the diaRendimento
     */
    public int getDiaRendimento() {
        return diaRendimento;
    }
    
    public void setDiaRendimento(int diaRendimento){
        this.diaRendimento = diaRendimento;
    }

    
    
    public boolean calcularNovoSaldo(double taxaRendimento){
        
        Calendar hoje = Calendar.getInstance();
        
        if (diaRendimento == hoje.get(Calendar.DAY_OF_MONTH)){
            this.setSaldo(this.getSaldo() + (this.getSaldo() * taxaRendimento));
            return true;
        }
        return false;
    }

    public String toString(){
        String s;
        s = "\nConta Poupança";
        s += "\nDia rendimento: " + diaRendimento;
        s += super.toString();

        return s;
    }
    
    
    
}
