/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loiane.cursojava.exerciciosaula27;

import java.util.Scanner;

/**
 *
 * @author thiago
 */
public class Exercicio04 {
    
    public static void main(String[] args){
        
        JogoDaVelha jogo = new JogoDaVelha();
        Scanner scan = new Scanner(System.in);
        
        jogo.jogo = new String[3][3];
        jogo.ganhou = false;
        jogo.jogou = false;
        jogo.rodada = 1;
        
        int linha, coluna;

        
        jogo.inicializarMatriz(jogo.jogo);
        jogo.imprimirJogoVelha(jogo.jogo);
        
        while(jogo.rodada < 10){
            
            System.out.println("Rodada " + jogo.rodada);
            
            if(jogo.jogou == false){
                System.out.println("É a vez do jogador 1\n");
                jogo.jogou = true;
            }
            else{
                System.out.println("É a vez do jogador 2\n");
                jogo.jogou = false;
            }
            
            do{
                System.out.print("Linha: ");
                linha = scan.nextInt();
                linha = linha - 1;
            
                
                System.out.print("Coluna: ");
                coluna = scan.nextInt();
                coluna = coluna - 1;
                
                if(jogo.jogo[linha][coluna].equalsIgnoreCase("O") || 
                   jogo.jogo[linha][coluna].equalsIgnoreCase("X")){
                    System.out.println("Jogada inválida! Tente uma posição diferente. tabuleiro (3x3)\n");
                    
                }
                    
            }while(jogo.jogo[linha][coluna].equalsIgnoreCase("O") || 
                        jogo.jogo[linha][coluna].equalsIgnoreCase("X") ||
                    linha > jogo.jogo.length || coluna > jogo.jogo.length);
            
            jogo.validarJogada(linha, coluna);
            jogo.verificarVencedor();
            if(jogo.ganhou)
                break;
            
            jogo.rodada++;
        }
        
        
    }
    
}
