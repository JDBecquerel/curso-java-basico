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
public class Exercicio03 {
    
    public static void main(String[] args){
        
        LivroDeLivraria agencia = new LivroDeLivraria();
        
        agencia.titulo = "Agência de investigações holísticas";
        agencia.autor = "Douglas Adams";
        agencia.editora = "Arqueiro";
        agencia.tamanho = "Pequeno";
        agencia.numPaginas = 240;
        agencia.preco = 20;
        agencia.vendido = true;
        
        LivroDeLivraria GOT = new LivroDeLivraria();
        
        GOT.titulo = "A dança dos dragões";
        GOT.autor = "George R. R. Martin";
        GOT.editora = "LeYa";
        GOT.tamanho = "Grande";
        GOT.numPaginas = 1377;
        GOT.preco = 60;
        GOT.vendido = true;
        
        
        
        System.out.println("Título: " + agencia.titulo);
        System.out.println("Autor: " + agencia.autor);
        System.out.println("Editora: " + agencia.editora);
        System.out.println("Tamanho: " + agencia.tamanho);
        System.out.println("Páginas: " + agencia.numPaginas);
        System.out.println("Preço: " + agencia.preco + " reais");
        System.out.println("Vendido: " + agencia.vendido);
        
        System.out.println();
        
        System.out.println("Título: " + GOT.titulo);
        System.out.println("Autor: " + GOT.autor);
        System.out.println("Editora: " + GOT.editora);
        System.out.println("Tamanho: " + GOT.tamanho);
        System.out.println("Páginas: " + GOT.numPaginas);
        System.out.println("Preço: " + GOT.preco + " reais");
        System.out.println("Vendido: " + GOT.vendido);
    }
    
}
