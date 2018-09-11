/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loiane.cursojava.aula43.labs.exer02;

/**
 *
 * @author thiago
 */
public class PessoaFisica extends Contribuinte {

    private String cpf;
    
    public PessoaFisica() {
    }

    public PessoaFisica(String nome) {
        super(nome);
    }

    
    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public double calcularImposto(){
        
        double renda = this.getRendaBruta();
        
        if(renda >= 0 && renda <=1400){
            return 0;
        } else if(renda >= 1400.01 && renda <= 2100){
            return (renda*0.1) - 100;
        } else if(renda >= 2100.01 && renda <= 2800){
            return (renda*0.15) - 270;
        } else if(renda >= 2800.01 && renda <= 3600){
            return (renda*0.25) - 500;
        } 
        
        return (renda*0.3) - 700;
    }
    
    public String toString(){
        String s = "\nPessoa Física";
        
        s += super.toString();
        s += "\nCPF: " + cpf;
        s += "\nImposto a ser pago: R$ " + calcularImposto();
        
        return s;
    }

    
}
