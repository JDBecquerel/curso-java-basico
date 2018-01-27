/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loiane.cursojava.aula34.labs;

/**
 *
 * @author thiago
 */
public class ConversaoDeUnidadesDeTempo {
    
    //1 minuto = 60 segundos
    //1 hora = 60 minutos
    //1 dia = 24 horas
    //1 semana = 7 dias
    //1 mês = 30 dias
    //1 ano = 365.25 dias
    
    public static double minSegundos(int min){
        return min*60;
    }
    
    public static double horaMinutos(int hora){
        return hora*60;
    }
    
    public static double diaHoras(int dias){
        return dias*24;
    }
    
    public static double semanaDias(int semana){
        return semana*7;
    }
    
    public static int mesDias(int meses){
        return meses*30;
    }
    
    public static double anoDias(int anos){
        return anos*365.25;
    }
}
