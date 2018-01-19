/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loiane.cursojava.aula33.labs;

import java.util.Scanner;

/**
 *
 * @author thiago
 */
public class Exercicio04 {
    
    public static void main(String[] args){
        
        JogoDaVelha jogo = new JogoDaVelha();
        Scanner scan = new Scanner(System.in);
        
        
        char sinal;
        boolean ganhou = false;
        boolean jogou = false;
        
        int linha, coluna;

        System.out.println("Jogador 1 = O");
        System.out.println("Jogador 1 = X");
        
        jogo.inicializarMatriz(jogo.getJogo());
        jogo.imprimirJogoVelha();
        
        while(!ganhou){
            
            System.out.println("Rodada " + jogo.getRodada());
            
            if(jogo.vezJogador1()){
                System.out.println("É a vez do jogador 1\n");
                sinal = 'X';
                jogou = true;
            }
            else{
                System.out.println("É a vez do jogador 2\n");
                sinal = 'O';
                jogou = false;

            }
            
            linha = valor("linha", scan);
            coluna = valor("coluna", scan);

            if(!jogo.validarJogada(linha, coluna, sinal)){
                System.out.println("Posição já usada, tente novamente.");
            }
            jogo.imprimirJogoVelha();

            //jogo.preencherSimbolo(valor, coluna, jogou);
            if(jogo.verificarVencedor('X')){
                ganhou = true;
                System.out.println("Parabéns, jogador 1 ganhou!");
            } else if(jogo.verificarVencedor('O')){
                ganhou = true;
                System.out.println("Parabéns, jogador 2 ganhou!");
            } else if(jogo.getRodada() > 9){
                ganhou = true;
                System.out.println("Ninguém ganhou, deu velha.");
            }
        }   
    }
    
    static int valor(String tipoValor, Scanner scan){
        
        int valor = 0;
        boolean valorValido = false;
        
        while (!valorValido) {

            System.out.print("Entre com a " + tipoValor + " (1, 2 ou 3): ");
            valor = scan.nextInt();
            valor = valor - 1;

            if (valor >= 0 && valor <= 2) {
                valorValido = true;
            } else {
                System.out.println("Entrada inválida, tente novamente.");
            }
        }
        return valor;
    }
}
