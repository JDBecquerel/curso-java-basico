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
public class JogoDaVelha {
    
    String jogo[][];
    int rodada;
    boolean ganhou;
    boolean jogou;
    
    Scanner scan = new Scanner(System.in);
    
    void inicializarMatriz(String jogo[][]){
        
        int i = 0;
        int j = 0;
        
        for(i = 0; i < jogo.length; i++){
            for(j = 0; j < jogo[i].length; j++){
                jogo[i][j] = " ";
            }
        }
    }
    
    void imprimirJogoVelha(String jogo[][]){
        
        int i = 0;
        int j = 0;
        
        System.out.println();
        for(i = 0; i < jogo.length; i++){
            for(j = 0; j < jogo.length; j++){
                System.out.print(jogo[i][j] + "|");
            }
            System.out.println();
        }
        
    }
    
    
    
    void validarJogada(int linha, int coluna){
        
        int i = 0;
        int j = 0;
        
        if(jogou == false){
            jogo[linha][coluna] = "X";
        }
        else{
            jogo[linha][coluna] = "O";
        }
            
        imprimirJogoVelha(jogo);
        System.out.println();
    
    }
    
    void verificarVencedor(){
        
        int i = 0, j = 0;
                
        
        
        if((jogo[2][0] == "O" && jogo[1][1] == "O" && jogo[0][2] == "O") //diagonal inversa
            || (jogo[0][0] == "O" && jogo[1][1] == "O" && jogo[2][2] == "O") //diagonal
            || (jogo[0][0] == "O" && jogo[1][0] == "O" && jogo[2][0] == "O") //coluna 1
            || (jogo[0][1] == "O" && jogo[1][1] == "O" && jogo[2][1] == "O") //coluna 2
            || (jogo[0][2] == "O" && jogo[1][2] == "O" && jogo[2][2] == "O") //coluna 3
            || (jogo[0][0] == "O" && jogo[0][1] == "O" && jogo[0][2] == "O") //linha 1
            || (jogo[1][0] == "O" && jogo[1][1] == "O" && jogo[1][2] == "O") //linha 2
            || (jogo[2][0] == "O" && jogo[2][1] == "O" && jogo[2][2] == "O")){ //linha 3
            
                
            ganhou = true;
            System.out.println("O jogador 1 ganhou");
        }
            
        else if((jogo[2][0] == "X" && jogo[1][1] == "X" && jogo[0][2] == "X") //diagonal inversa
            || (jogo[0][0] == "X" && jogo[1][1] == "X" && jogo[2][2] == "X") //diagonal
            || (jogo[0][0] == "X" && jogo[1][0] == "X" && jogo[2][0] == "X") //coluna 1
            || (jogo[0][1] == "X" && jogo[1][1] == "X" && jogo[2][1] == "X") //coluna 2
            || (jogo[0][2] == "X" && jogo[1][2] == "X" && jogo[2][2] == "X") //coluna 3
            || (jogo[0][0] == "X" && jogo[0][1] == "X" && jogo[0][2] == "X") //linha 1
            || (jogo[1][0] == "X" && jogo[1][1] == "X" && jogo[1][2] == "X") //linha 2
            || (jogo[2][0] == "X" && jogo[2][1] == "X" && jogo[2][2] == "X")){ //linha 3
            
            ganhou = true;
            System.out.println("O jogador 2 ganhou");
        }
        
        else if(rodada == 9 && ganhou == false){
            System.out.println("Não há ganhador, deu velha!");
        }   
    }
}


