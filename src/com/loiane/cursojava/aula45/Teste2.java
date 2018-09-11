/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loiane.cursojava.aula45;

/**
 *
 * @author thiago
 */
public class Teste2 {
    public static void main(String[] args) {
        
        Object obj1 = obterString();
        String s1 = (String) obj1;
        //funciona o método pq ele retorna uma String
        
        Object obj2 = "Minha String";
        String s2 = (String) obj2;
        
        //funciona pq o objeto está referenciando uma String diretamente
        
        Object obj3 = new Object();
        String s3 = (String) obj3;
        
        //falha em tempo de execução, fala que objeto não pode ser convertido em
        //String. De forma alguma o objeto faz referência a uma String.
        
        Object obj4 = obterInteiro();
        String s4 = (String) obj4;
        
        //não funciona em tempo de execução devido o objeto estar referenciando
        //a um inteiro e não uma String
        
        //downcasting somente funciona se tiver referenciando um tipo em particular
        //como visto nos exemplos (ex 1 e 2)
    }
    
    public static String obterString(){
        return "Minha String";
    }
    
    public static int obterInteiro(){
        return 1;
    }
}
