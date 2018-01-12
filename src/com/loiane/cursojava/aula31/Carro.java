/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loiane.cursojava.aula31;

/**
 *
 * @author thiago
 */
public class Carro {
    
    public String marca; //public acesso em qualquer lugar do projeto
    String modelo; //default acesso somente dentro do pacote
    int numPassageiros;
    double capCombustivel;
    private double consumoCombustivel; //private acesso somente dentro da própria classe
    
    public void exibirAutonomia(){
        System.out.println("A autonomia do carro é: " + capCombustivel*consumoCombustivel + " km");
    }
    
    public double obterAutonomia(){
        return this.capCombustivel*this.consumoCombustivel;
    }
    
    private double dividirKmPorConsumoCombustivel(double km){
        
        return km/this.consumoCombustivel;
    }
    
    public double calcularCombustivel(double km){
    
        return this.dividirKmPorConsumoCombustivel(km);
    }
}
