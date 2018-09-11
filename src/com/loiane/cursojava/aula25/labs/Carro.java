/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loiane.cursojava.aula25.labs;

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
    
    //Aula 25 - método sem retorno
    void exibirAutonomia(){
        System.out.println("A autonomia do carro é: " + capCombustivel*consumoCombustivel + " km");
    }
    
    //Aula 26 - método com retorno
    double obterAutonomia(){
        return capCombustivel*consumoCombustivel;
    }
    
    //Aula 27 - método com parâmetro
    double calcularCombustivel(double km){
        
        double qtdCombustivel = km/consumoCombustivel;
    
        return qtdCombustivel;
    }
}
