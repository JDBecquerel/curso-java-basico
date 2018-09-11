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
public class TesteCarro {
    
    public static void main(String[] args){
        
        //exercicios 26 e 27 foram resolvidos usando a classe Carro e TesteCarro
        Carro van = new Carro();
        van.marca = "Fiat";
        van.modelo = "Ducato";
        van.numPassageiros = 10;
        van.capCombustivel = 100;
        van.consumoCombustivel = 0.2;
        
        System.out.println("Marca: " + van.marca);
        System.out.println("Modelo: " + van.modelo);
        
        //método 25- método sem retorno
        van.exibirAutonomia();
        System.out.println("\nOutro método com retorno para calcular a Autonomia: " + van.obterAutonomia() + " km");
        
        //Aula 26 - método com retorno
        double qtdCombustivel = van.calcularCombustivel(10);
        double qtdCombustivel2 = van.calcularCombustivel(15);
        
        //Aula 27 - método com parâmetro
        System.out.println("qtdCombustivel = " + qtdCombustivel);
        System.out.println("qtdCombustivel2 = " + qtdCombustivel2);
        
        
    }
    
}
