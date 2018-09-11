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
public class Piramide extends Figura3D {
    
    private double apotema;
    private double arestaRelativa;
    private Figura2D base;
    private double alturaTriangulo;
    private int numPoliBase;
    
    
    public Piramide(){}

    public double getApotema() {
        return apotema;
    }

    public void setApotema(double apotema) {
        this.apotema = apotema;
    }

    public double getArestaRelativa() {
        return arestaRelativa;
    }

    public int getNumPoliBase() {
        return numPoliBase;
    }

    public void setNumPoliBase(int numPoliBase) {
        this.numPoliBase = numPoliBase;
    }
     

    public void setArestaRelativa(double arestaRelativa) {
        this.arestaRelativa = arestaRelativa;
    }

    public Figura2D getBaseTriangulo() {
        return base;
    }

    public void setBaseTriangulo(Figura2D baseTriangulo) {
        this.base = baseTriangulo;
    }

    public double getAlturaTriangulo() {
        return alturaTriangulo;
    }

    public void setAlturaTriangulo(double alturaTriangulo) {
        this.alturaTriangulo = alturaTriangulo;
    }
    


    @Override
    public double calcularArea() {
        if(base != null){
            return (numPoliBase*((arestaRelativa*apotema)/2)) + base.calcularArea();
        }
        return 0;
    }

    @Override
    public double calcularVolume() {
        if(base != null){
            double volume = (base.calcularArea()*alturaTriangulo)/3;
            return volume;
        }
        return 0;
    }
}
