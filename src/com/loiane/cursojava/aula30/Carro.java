/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loiane.cursojava.aula30;

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
    
    public Carro(String marca, String modelo, int numPassageiros, 
            double capCombustivel, double consumoCombustivel){
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
        this.capCombustivel = capCombustivel;
        this.consumoCombustivel = consumoCombustivel;
    }
    
    
    
    public Carro(String marca, String modelo){
        this(marca, modelo, 10);
        System.out.println("Chamando construtor com 2 parametros");
    }
    
    public Carro(String marca, String modelo, int numPassageiros){
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
        System.out.println("Chamando construtor com 3 parametros");
    }
    Carro(){ }
    
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
