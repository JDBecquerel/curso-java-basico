/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loiane.cursojava.aula27.labs;

import java.util.Scanner;

/**
 *
 * @author thiago
 */
public class JogoDaVelha {
    
    char jogo[][];
    int rodada;
    
    
    Scanner scan = new Scanner(System.in);
    
    void inicializarMatriz(char jogo[][]){
        
        int i = 0;
        int j = 0;
        
        for(i = 0; i < jogo.length; i++){
            for(j = 0; j < jogo[i].length; j++){
                jogo[i][j] = ' ';
            }
        }
    }
    
    void imprimirJogoVelha(){
        
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
    
    
    
    
    boolean validarJogada(int linha, int coluna, char sinal) {

        if (jogo[linha][coluna] == 'O' || jogo[linha][coluna] == 'X') {
            return false;
            
        } else {
            jogo[linha][coluna] = sinal;
            rodada++;
            return true;
        }
    }
    
    boolean verificarVencedor(char sinal){
        
        if((jogo[2][0] == sinal && jogo[1][1] == sinal && jogo[0][2] == sinal) //diagonal inversa
            || (jogo[0][0] == sinal && jogo[1][1] == sinal && jogo[2][2] == sinal) //diagonal
            || (jogo[0][0] == sinal && jogo[1][0] == sinal && jogo[2][0] == sinal) //coluna 1
            || (jogo[0][1] == sinal && jogo[1][1] == sinal && jogo[2][1] == sinal) //coluna 2
            || (jogo[0][2] == sinal && jogo[1][2] == sinal && jogo[2][2] == sinal) //coluna 3
            || (jogo[0][0] == sinal && jogo[0][1] == sinal && jogo[0][2] == sinal) //linha 1
            || (jogo[1][0] == sinal && jogo[1][1] == sinal && jogo[1][2] == sinal) //linha 2
            || (jogo[2][0] == sinal && jogo[2][1] == sinal && jogo[2][2] == sinal)){ //linha 3
            
         return true;    

        }
        return false;   
    }
    
    boolean vezJogador1(){
        if(rodada % 2 == 1){
                return true;
            }
         return false;
     
    }
}


