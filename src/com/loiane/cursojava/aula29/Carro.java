/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loiane.cursojava.aula29;

/**
 *
 * @author thiago
 */
public class Carro {
    
    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;
    
    Carro(){ } // construtor simples e vazio;
    //construtores também servem para inicializar certos atributos da classe
    //se precisar, podemos declarar construtores com parâmetro.
    //ao invés de instanciar a classe e ir setando atributo por atributo
    //já pode passar todos os atributos no construtor da classe
    
    Carro(String marca_, String modelo_, int numPassageiros_, double capCombustivel_, double consumoCombustivel_){
        marca = marca_;
        modelo = modelo_;
        numPassageiros = numPassageiros_;
        capCombustivel = capCombustivel_;
        consumoCombustivel = consumoCombustivel_;
    }
    
    
    
    void exibirAutonomia(){
        System.out.println("A autonomia do carro é: " + capCombustivel*consumoCombustivel + " km");
    }
    
    double obterAutonomia(){
        return capCombustivel*consumoCombustivel;
    }
    
    double calcularCombustivel(double km){
        
        double qtdCombustivel = km/consumoCombustivel;
    
        return qtdCombustivel;
    }
    
}
