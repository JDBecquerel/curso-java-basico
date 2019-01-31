/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loiane.cursojava.aula52.labs;

/**
 *
 * @author thiago
 */
public class Agenda {
    
    private Contato[] contatos;
    

    public Contato[] getContatos() {
        return contatos;
    }

    public void setContatos(Contato[] contatos) {
        this.contatos = contatos;
    }
    
    public void adicionarContato(Contato contato, int tam){
        
        try{
            if(contato.getIdentificador() < tam && contato.getIdentificador() >= 0){
                contatos[contato.getIdentificador()] = contato;
            }
            throw new NumeroInvalidoException();
        }
        catch(NumeroInvalidoException e){
            System.out.println(e.toString());
        }
        
    }
    
    public Contato consultarContato(Contato contato){
        int i = 0;
        
        for(i = 0; i < contatos.length; i++){
            if(this.contatos[i].equals(contato)){
                return contatos[i]; 
            }
        }
        return null;
    }
    
    public Contato consultarContato(String entrada){
        int i = 0;
        
        for(i = 0; i < contatos.length; i++){
            if((this.contatos[i].getNome()).equals(entrada) || (this.contatos[i].getTelefone()).equals(entrada)
                    || (this.contatos[i].getTelefone()).equals(entrada) || this.contatos[i].getIdentificador() == (Integer.parseInt(entrada))){
                return contatos[i]; 
            }
        }
        return null;
    }
    
    
    public boolean consultarContato(Contato contato, int tamanhoVetor){
        int i = 0;
        
        for(i = 0; i < tamanhoVetor; i++){
            if(contato != null){
                if(contatos[i].equals(contato)){
                    return true;
                }
            }
        }
        return false;
    }
    
    
    
}
