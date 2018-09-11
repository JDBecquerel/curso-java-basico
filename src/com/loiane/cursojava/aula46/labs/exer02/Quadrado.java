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
public class Quadrado extends Figura2D {
    
    private double lado;

    
    public Quadrado(){}
    
    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    
    

    @Override
    public double calcularArea() {
        return lado*lado;
    }
}
