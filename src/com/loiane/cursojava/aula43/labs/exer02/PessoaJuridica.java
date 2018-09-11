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
public class PessoaJuridica extends Contribuinte {
    
    private String cnpj;
    
    public PessoaJuridica(){}
    
    public PessoaJuridica(String nome){
        super(nome);
    }
    
    
    /**
     * @return the cnpj
     */
    public String getCnpj() {
        return cnpj;
    }

    /**
     * @param cnpj the cnpj to set
     */
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
    public double calcularImposto(){
        return this.getRendaBruta()*0.1;
    }
    
    public String toString(){
        String s = "\nPessoa Jurídica";
        
        s += super.toString();
        s += "\nCNPJ: " + cnpj;
        s += "\nImposto a ser pago: R$ " + calcularImposto();
        
        return s;
    }

    
}
