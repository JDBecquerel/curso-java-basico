/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loiane.cursojava.aula24.labs;

import java.util.Date;

/**
 *
 * @author thiago
 */
public class Exercicio04 {
    
    public static void main(String[] args){
        
        LivroDeBiblioteca agencia = new LivroDeBiblioteca();
        
        agencia.titulo = "Agência de investigações holísticas";
        agencia.autor = "Douglas Adams";
        agencia.editora = "Arqueiro";
        agencia.tamanho = "Pequeno";
        agencia.numPaginas = 240;
        
        agencia.emprestado = false;
        agencia.reservado = true;
        agencia.dataEntrega = new Date();
        
        LivroDeBiblioteca GOT = new LivroDeBiblioteca();
        
        GOT.titulo = "A dança dos dragões";
        GOT.autor = "George R. R. Martin";
        GOT.editora = "LeYa";
        GOT.tamanho = "Grande";
        GOT.numPaginas = 1377;
        
        GOT.emprestado = true;
        GOT.emprestadoA = "João";
        GOT.reservado = true;
        GOT.dataEntrega = new Date();
        
        
        
        System.out.println("Título: " + agencia.titulo);
        System.out.println("Autor: " + agencia.autor);
        System.out.println("Editora: " + agencia.editora);
        System.out.println("Tamanho: " + agencia.tamanho);
        System.out.println("Páginas: " + agencia.numPaginas);
        
        System.out.println("Emprestado: " + agencia.emprestado);
        System.out.println("Reservado: " + agencia.reservado);
        System.out.println("Data de entrega: " + agencia.dataEntrega);
        
        System.out.println();
        
        System.out.println("Título: " + GOT.titulo);
        System.out.println("Autor: " + GOT.autor);
        System.out.println("Editora: " + GOT.editora);
        System.out.println("Tamanho: " + GOT.tamanho);
        System.out.println("Páginas: " + GOT.numPaginas);
        System.out.println("Emprestado: " + GOT.emprestado);
        System.out.println("EmprestadoA " + GOT.emprestadoA);
        System.out.println("Reservado: " + GOT.reservado);
        System.out.println("Data de entrega: " + GOT.dataEntrega);
        
    }
    
}
