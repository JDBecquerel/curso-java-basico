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
public class Contato {
    
    private static int contador = 0;
    
    private String nome;
    private String telefone;
    private String email;
    private int identificador;

    
    public Contato() {
        contador++;
        this.identificador = contador;
    }
    
    public Contato(int id) {
        this.identificador = id;
    }
    
    
    public String getEmail(){
        return email;
    }
    
    public void setEmail(String email){
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }
    
    
     public boolean isTelefone(String numeroTelefone) {
        return numeroTelefone.matches(".((10)|([1-9][1-9]).)\\s9?[6-9][0-9]{3}-[0-9]{4}") ||
                numeroTelefone.matches(".((10)|([1-9][1-9]).)\\s[2-5][0-9]{3}-[0-9]{4}");
    }
    
     public boolean isNome(String nome) {
        return nome.matches("\"\\[A-Z\\]\\[a-z\\]{1,}\"");

    }
     
     public boolean isEmail(String email) {
         return email.matches("^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$");
     }
    
    public String toString(){
        String s;
        
        s = "Id: " + identificador;
        s += "\nNome: " + nome;
        s +=  "\nTelefone: " + telefone;
        s += "\nEmail: " + email;
        
        return s;
    }
    
}
