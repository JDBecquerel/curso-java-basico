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
public class Cilindro extends Figura3D {
    
    private double raio;
    private double altura;
    
    public Cilindro(){}

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    
    
    private double areaBase(){
        double areaB;
        areaB = Math.PI*Math.pow(raio,2);
        
        return areaB;
    }
    
    private double areaLateral(){
        double areaL;
        areaL = 2*Math.PI*raio*altura;
        
        return areaL;
    }
    
    @Override
    public double calcularArea() {
        double areaTotal = 0;
        areaTotal = (2*areaBase()) + areaLateral();
        
        return areaTotal;
    }

    @Override
    public double calcularVolume() {
        double volume = Math.PI*Math.pow(raio,2)*altura;
        return volume;
    }
}
