/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loiane.cursojava.aula43.labs.exer03;

/**
 *
 * @author thiago
 */
public class Peixe extends Animal {
    
    private String caracteristicas;
    
  
    
    public Peixe(){
        super();
        this.setPatas(0);
        this.setAmbiente("Mar");
        this.setCor("Cinzenta");
        this.caracteristicas = "Barbatanas e cauda";
    }
    
    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }
    
    public String toString(){
        String s = super.toString();
        s += "\nCaracterísticas: " + caracteristicas;
        
        return s;
    }
}
