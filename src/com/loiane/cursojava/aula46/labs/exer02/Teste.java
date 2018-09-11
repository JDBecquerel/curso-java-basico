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
public class Teste {
    
    public static void main(String[] args) {
        
        Cilindro cilindro = new Cilindro();
        Cubo cubo = new Cubo();
        Piramide piramide = new Piramide();
        
        Triangulo triangulo = new Triangulo();
        Quadrado quadrado = new Quadrado();
        Circulo circulo = new Circulo();
        
        cilindro.setAltura(5);
        cilindro.setRaio(3);
        
        cubo.setAresta(3);
        
        piramide.setApotema(5);
        piramide.setArestaRelativa(3);
        piramide.setBaseTriangulo(triangulo);
        
        triangulo.setAltura(2);
        triangulo.setBase(3);
        
        quadrado.setLado(2);
        
        circulo.setRaio(2);
        
        FiguraGeometrica[] figurasGeometricas = new FiguraGeometrica[6];
        
        figurasGeometricas[0] = cilindro;
        figurasGeometricas[1] = cubo;
        figurasGeometricas[2] = piramide;
        figurasGeometricas[3] = triangulo;
        figurasGeometricas[4] = quadrado;
        figurasGeometricas[5] = circulo;
        
        for (FiguraGeometrica fig : figurasGeometricas) {
            if(fig instanceof Cilindro){
                System.out.println("Área do cilindro: " + ((Cilindro) fig).calcularArea() + " cm^2" +
                        "\nVolume do cilindro: " + ((Cilindro) fig).calcularVolume() + " cm^3");
            }
            
            if(fig instanceof Cubo){
                System.out.println("Área do cubo: " + ((Cubo) fig).calcularArea() + " cm^2"
                        + "\nVolume do Cubo: " + ((Cubo) fig).calcularVolume() + " cm^3");
            }
            
            if(fig instanceof Piramide){
                System.out.println("Área da pirâmide: " + ((Piramide) fig).calcularArea() + " cm^2" +
                        "\nVolume da pirâmide: " + ((Piramide) fig).calcularVolume() + " cm^3");
            }
            
            if(fig instanceof Triangulo){
                System.out.println("Área do triangulo: " + ((Triangulo) fig).calcularArea() + " cm^2");
            }
            
            if(fig instanceof Quadrado){
                System.out.println("Área do quadrado: " + ((Quadrado) fig).calcularArea() + " cm^2");
            }
            
            if(fig instanceof Circulo){
                System.out.println("Área do circulo: " + ((Circulo) fig).calcularArea() + " cm^2");
            }
            
            System.out.println();
        }
        
    }
            
}
