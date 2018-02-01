/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loiane.cursojava.aula36.labs;

/**
 *
 * @author thiago
 */
public class Agenda {
    
    private String nome;
    private Contato[] contatos;
    
    public Agenda() {}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Contato[] getContatos() {
        return contatos;
    }

    public void setContatos(Contato[] contatos) {
        this.contatos = contatos;
    }
    
    
    //minha solução que ficou mal organizado
    public String obterInformacoesContato(Contato contato){
      
        return ("\nNome: " + contato.getNome() + "\n" +
                "Telefone: " + contato.getTelefone() + "\n" +
                "Email: " + contato.getEmail());
    }
    
    public String obterInformacoesContatos(Contato[] contatos, int i){
        
        if(i == 2){
            return ("\n\nNome: " + contatos[2].getNome() + "\n" +
                "Telefone: " + contatos[2].getTelefone() + "\n" +
                "Email: " + contatos[2].getEmail());
        }
        
        return ("\n\nNome: " + contatos[i].getNome() + "\n" +
                "Telefone: " + contatos[i].getTelefone() + "\n" +
                "Email: " + contatos[i].getEmail())
                + obterInformacoesContatos(contatos, i+1);
    }
    
    //solução da loiane
    public String obterInfo(){
        String info = "Nome = " + nome + "\n";
        
        if(contatos != null){
            for(Contato c : contatos){
                info += c.obterInfo() + "\n";
            }
        }
        
        return info;
    }
    
    
    
}
