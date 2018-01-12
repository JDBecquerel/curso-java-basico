/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loiane.cursojava.aula24.labs;



/**
 *
 * @author thiago
 */
public class Exercicio06 {
    
    public static void main(String[] args){
        
        ContatoCelular contato01 = new ContatoCelular();
        
        contato01.nome = "Pedro Henrique Lima";
        contato01.email = "ph@gmail.com";
        
        contato01.telefones = new String[2];
        
        contato01.telefones[0] = "99495-0909";
        contato01.telefones[1] = "98564-5502";
        
        
        System.out.println("CONTATO");
        System.out.println("Nome: " + contato01.nome);
        System.out.println("Email: " + contato01.email);
        System.out.println("Telefone 01: " + contato01.telefones[0]);
        System.out.println("Telefone 02: " + contato01.telefones[1]);
        
        
        
    }
    
}
