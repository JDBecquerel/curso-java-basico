/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loiane.cursojava.aula33.labs;

/**
 *
 * @author thiago
 */
public class JogoDaVelha {
    
    private char jogo[][];
    private int rodada;
    
    
    //construtores
    
    public JogoDaVelha(int rodada) {
        this.rodada = rodada;
        jogo = new char[3][3];
    }
    
    JogoDaVelha(){ 
        jogo = new char[3][3];
        rodada = 1;
    }
    
    //getters and setters
    
    public char[][] getJogo(){
        return this.jogo;
    }
    
    public void setJogo(char[][] jogo){
        this.jogo = jogo;
    }
    
    public int getRodada(){
        return this.rodada;
    }
    
    public void setRodada(int rodada){
        this.rodada = rodada;
    }
    
    // métodos
    
     void inicializarMatriz(char jogo[][]){
        
        int i = 0;
        int j = 0;
        
        for(i = 0; i < jogo.length; i++){
            for(j = 0; j < jogo[i].length; j++){
                jogo[i][j] = ' ';
            }
        }
    }
    
    public void imprimirJogoVelha(){
        
        int i = 0;
        int j = 0;
        
        System.out.println();
        for(i = 0; i < getJogo().length; i++){
            for(j = 0; j < getJogo().length; j++){
                System.out.print(getJogo()[i][j] + "|");
            }
            System.out.println();
        }
        
    }
    
    
    private boolean posNaoVazia(int linha, int coluna){
        return (getJogo()[linha][coluna] == 'O' || getJogo()[linha][coluna] == 'X');
    }
    
    private void posVazia(int linha, int coluna, char sinal){
        jogo[linha][coluna] = sinal;
        rodada++;
    }
    
    public boolean validarJogada(int linha, int coluna, char sinal) {

        if (posNaoVazia(linha, coluna)) {
            return false;
            
        } else {
            posVazia(linha, coluna, sinal);
            return true;
        }
    }
    
    public boolean verificarVencedor(char sinal){
        
        if((getJogo()[2][0] == sinal && getJogo()[1][1] == sinal && getJogo()[0][2] == sinal) //diagonal inversa
            || (getJogo()[0][0] == sinal && getJogo()[1][1] == sinal && getJogo()[2][2] == sinal) //diagonal
            || (getJogo()[0][0] == sinal && getJogo()[1][0] == sinal && getJogo()[2][0] == sinal) //coluna 1
            || (getJogo()[0][1] == sinal && getJogo()[1][1] == sinal && getJogo()[2][1] == sinal) //coluna 2
            || (getJogo()[0][2] == sinal && getJogo()[1][2] == sinal && getJogo()[2][2] == sinal) //coluna 3
            || (getJogo()[0][0] == sinal && getJogo()[0][1] == sinal && getJogo()[0][2] == sinal) //linha 1
            || (getJogo()[1][0] == sinal && getJogo()[1][1] == sinal && getJogo()[1][2] == sinal) //linha 2
            || (getJogo()[2][0] == sinal && getJogo()[2][1] == sinal && jogo[2][2] == sinal)){ //linha 3
            
         return true;    

        }
        return false;   
    }
    
    private boolean restoUm(){
        return getRodada() % 2 == 1;
    }
    public boolean vezJogador1(){
        if(restoUm()){
                return true;
            }
         return false;
     
    }
}
