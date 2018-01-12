/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loiane.cursojava.aula20.labs;

import java.util.Scanner;
/**
 *
 * @author thiago
 */
public class Ex6 {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        String jogo [][] = new String[3][3];
        boolean ganhou = false;
        boolean jogou = false;
        int rodada = 1, i, j;
        int linha = 0, coluna = 0;
        int cont = 0, cont2 = 0;
        
        //inicializando as variaveis da matriz 3x3
        
        for(i = 0; i < jogo.length; i++){
            for(j = 0; j < jogo.length; j++){
                jogo[i][j] = " ";
            }
        }
        
        //imprimindo a matriz vazia
        
        for(i = 0; i < jogo.length; i++){
            for(j = 0; j < jogo.length; j++){
                System.out.print(jogo[i][j] + "|");
            }
            System.out.println();
        }
        
        
        //inserindo linha e coluna
        
        while(!ganhou){
            System.out.println("Rodada " + rodada);
            
            if(jogou == false){
                System.out.println("É a vez do jogador 1");
                jogou = true;
            }
            else{
                System.out.println("É a vez do jogador 2");
                jogou = false;
            }
            
            do{
                System.out.print("Linha: ");
                linha = scan.nextInt();
                linha = linha - 1;
            
                System.out.print("Coluna: ");
                coluna = scan.nextInt();
                coluna = coluna - 1;
                
                if(jogo[linha][coluna].equalsIgnoreCase("O") || 
                        jogo[linha][coluna].equalsIgnoreCase("X")){
                    System.out.println("Jogada inválida! Tente uma posição diferente.\n");
                    
                }
                    
            }while(jogo[linha][coluna].equalsIgnoreCase("O") || 
                        jogo[linha][coluna].equalsIgnoreCase("X"));
            
            
            
            //preenchendo o jogo da velha
            
            if(jogou == false){
                jogo[linha][coluna] = "X";
            }
            else{
                jogo[linha][coluna] = "O";
            }
            
            //imprime o jogo da velha
            System.out.println();
            for(i = 0; i < jogo.length; i++){
                for(j = 0; j < jogo.length; j++){
                    System.out.print(jogo[i][j] + "|");
                }
                System.out.println();
            }
            System.out.println();
            
            //verificando se alguém ganhou o jogo a cada rodada 
            
            
            if((jogo[0][2] == "O" && jogo[1][1] == "O" && jogo[2][0] == "O")
                    || (jogo[0][0] == "O" && jogo[1][1] == "O" && jogo[2][2] == "O")){
                
                ganhou = true;
                System.out.println("O jogador 1 ganhou");
            }
            
            else if((jogo[0][2] == "X" && jogo[1][1] == "X" && jogo[2][0] == "X")
                    || (jogo[0][0] == "X" && jogo[1][1] == "X" && jogo[2][2] == "X")){
                ganhou = true;
                System.out.println("O jogador 2 ganhou");
            }
            
            
            
            
            
            
            
            for(i = 0; i < jogo.length; i++){
                for(j = 0; j < jogo.length; j++){
                    
                    if(jogo[i][j].equalsIgnoreCase("O")){
                        cont++;
                    }
                    else if(jogo[i][j].equalsIgnoreCase("X")){
                        cont--;
                    }
                    
                    if(jogo[j][i].equalsIgnoreCase("O")){
                        cont2++;
                    }
                    else if(jogo[j][i].equalsIgnoreCase("X")){
                        cont2--;
                    }
                    
                    if((cont == 3 || cont2 == 3) ){
                        ganhou = true;
                        System.out.println("O jogador 1 ganhou.");
                        
                    }
                    else if(cont == -3 || cont2 == -3){
                        ganhou = true;
                        System.out.println("O jogador 2 ganhou.");
                        
                    }
                    
                    if(ganhou)
                        break;

                }
                cont = 0;
                cont2 = 0;
            }
            
            if(ganhou)
                break;
                
            rodada++;
            
            
        }
        
        
    }
    
}
