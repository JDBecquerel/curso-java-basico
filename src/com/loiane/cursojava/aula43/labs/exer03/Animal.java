/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loiane.cursojava.aula43.labs.exer03;

/**
 *
 * @author thiago
 */
public class Animal {
    
    private String nome;
    private double comprimento;
    private int patas;
    private String cor;
    private String ambiente;
    private double velocidade;
    
    public Animal(){
        this.patas = 4;
    }

    public Animal(String ambiente) {
        this.ambiente = ambiente;
    }
    
    public Animal(int patas){
        this.patas = patas;
    }

    public Animal(int patas, String ambiente) {
        this.patas = patas;
        this.ambiente = ambiente;
    }
    
    

    public Animal(String nome, double comprimento, int patas, String cor, String ambiente, double velocidade) {
        this.nome = nome;
        this.comprimento = comprimento;
        this.patas = patas;
        this.cor = cor;
        this.ambiente = ambiente;
        this.velocidade = velocidade;
    }

    public Animal(int patas, String cor, String ambiente) {
        this.patas = patas;
        this.cor = cor;
        this.ambiente = ambiente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }
    
    public String toString(){
        String s = "Animal: " + nome;
        
        s += "\nComprimento: " + comprimento + " cm";
        s += "\nPatas: " + patas;
        s += "\nCor: " + cor;
        s += "\nAmbiente: " + ambiente;
        s += "\nVelocidade: " + velocidade + " m/s";
        
        return s;
    }
}
