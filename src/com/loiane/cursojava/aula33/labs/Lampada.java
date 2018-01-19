/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loiane.cursojava.aula33.labs;

/**
 *
 * @author thiago
 */
public class Lampada {
    
    private String modelo;
    private String tensao;
    private int potencia;
    private String cor;
    private String tipoLuz;
    private int garantiaMeses;
    private String[] tipos;
    private boolean aceso;
    
    Lampada(){ }

    public Lampada(String modelo, String tensao, int potencia, String cor, String tipoLuz, int garantiaMeses, boolean aceso) {
        this.modelo = modelo;
        this.tensao = tensao;
        this.potencia = potencia;
        this.cor = cor;
        this.tipoLuz = tipoLuz;
        this.garantiaMeses = garantiaMeses;
        this.tipos = tipos;
        this.aceso = aceso;
    }
    
    public String getModelo(){
        return this.modelo;
    }
    
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    
    public String getTensao(){
        return this.tensao;
    }
    
    public void setTensao(String modelo){
        this.setModelo(tensao);
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTipoLuz() {
        return tipoLuz;
    }

    public void setTipoLuz(String tipoLuz) {
        this.tipoLuz = tipoLuz;
    }

    public int getGarantiaMeses() {
        return garantiaMeses;
    }

    public void setGarantiaMeses(int garantiaMeses) {
        this.garantiaMeses = garantiaMeses;
    }

    public String[] getTipos() {
        return tipos;
    }

    public void setTipos(String[] tipos) {
        this.setTipos(tipos);
    }

    public boolean isAceso() {
        return aceso;
    }

    public void setAceso(boolean aceso) {
        this.aceso = aceso;
    }
    
    public void acenderLampada(){
        this.setAceso(true);
    }
    
    public void apagarLampada(){
        this.setAceso(false);
 
    }
    
    public void mudarEstado(boolean aceso){
        if(isAceso()){
            apagarLampada();
        } else{
            acenderLampada();
        }
    }
    
    public void mostrarEstado(){
        if(isAceso()){
            System.out.println("A lampada está acesa");
        } else{
            System.out.println("A lampada não está acesa");
        }
    }

    
    
    
    
}
