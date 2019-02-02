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
    
    
    public Agenda(){
        contatos = new Contato[3];
    } 
    
    public void adicionarContato(Contato contato) throws AgendaCheiaException {
        
        boolean cheia = true;
        for(int i = 0; i < contatos.length; i++){
            if(contatos[i] == null){
                contatos[i] = contato;
                cheia = false;
                break;
            }
        }
        
        if(cheia){
            throw new AgendaCheiaException();
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
    
    public int consultarContatoDados(String entrada) throws ContatoNaoExisteException{
        int i = 0;
        
        for(i = 0; i < contatos.length; i++){
            if(contatos[i] != null){
                if((this.contatos[i].getNome()).equalsIgnoreCase(entrada) || (this.contatos[i].getTelefone()).equals(entrada)
                    || this.contatos[i].getIdentificador() == (Integer.parseInt(entrada))){
                    return i; 
                }
            }
        }
        throw new ContatoNaoExisteException(entrada);

    }
    
    public int consultarContatoNome(String nome) throws ContatoNaoExisteException{
        int i = 0;
        
        for(i = 0; i < contatos.length; i++){
            if(contatos[i] != null){
                if((this.contatos[i].getNome()).equalsIgnoreCase(nome)){
                    return i; 
                }
            }
        }
        throw new ContatoNaoExisteException(nome);

    }
    
    
    public boolean consultarContatoEntidade(Contato contato, int tamanhoVetor){
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
    
    public String toString(){
        String s = "";
        
        for(Contato c : contatos){ 
            if(c != null){
                s += c.toString() + "\n\n";
            }
        }
        return s;
    }
    
    
}
