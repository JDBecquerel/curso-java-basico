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
    
    public String marca; //public acesso a qualquer classe no projeto
    String modelo; //default acesso as classes dentro do pacote
    int numPassageiros;
    double capCombustivel;
    private double consumoCombustivel; //private somente a própria classe tem acesso
    
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
