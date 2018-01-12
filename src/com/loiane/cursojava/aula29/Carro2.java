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
public class Carro2 {
    
    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;
    
    public Carro2(String marca, String modelo, int numPassageiros, 
            double capCombustivel, double consumoCombustivel){
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
        this.capCombustivel = capCombustivel;
        this.consumoCombustivel = consumoCombustivel;
    }
    
    public Carro2(){}
    
}
