/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loiane.cursojava.aula46.labs.exer02;

/**
 *
 * @author thiago
 */
public class Cubo extends Figura3D {
    
    private double aresta;


    public Cubo(){}
    
    public double getAresta() {
        return aresta;
    }

    public void setAresta(double aresta) {
        this.aresta = aresta;
    }
    
    
    private double areaLateral(){
        return 4*(Math.pow(aresta, 2));
    }
    
    private double areaBase(){
        return 2*(Math.pow(aresta, 2));
    }

    @Override
    public double calcularArea() {
        double areaTotal;
        areaTotal = areaLateral() + areaBase();
        
        return areaTotal;
    }

    @Override
    public double calcularVolume() {
        double volume = Math.pow(aresta,3);
        return volume;
    }
}
