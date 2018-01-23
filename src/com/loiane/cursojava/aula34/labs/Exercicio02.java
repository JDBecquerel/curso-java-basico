/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loiane.cursojava.aula34.labs;

import java.util.Scanner;

/**
 *
 * @author thiago
 */
public class Exercicio02 {
    
    static void declararVariaveis(String tipoNumero){
        if(tipoNumero == "int"){
            int num1, num2;
        } else {
            double num1 = 0, num2 = 0;
        }
    }
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String tipoNumero = " ";
        char op = ' ';
        
        while(!(tipoNumero.equalsIgnoreCase("int")) && !(tipoNumero.equalsIgnoreCase("double"))){
            System.out.println("Insira o tipo de número que deseja(int ou double):");
            tipoNumero = scan.next();
        }
        
        if(tipoNumero.equalsIgnoreCase("int")){
            int num1 = 0, num2 = 0;
            
            System.out.println("\nInsira o valor do primeiro numero: ");
            num1 = scan.nextInt();
            System.out.println("Insira o valor do segundo numero: ");
            num2 = scan.nextInt();
            
            System.out.println("Operações com números inteiros");
            System.out.println(num1 + " + " + num2 + " = " + Calculadora.somar(num1, num2));
            System.out.println(num1 + " - " + num2 + " = " + Calculadora.subtrair(num1, num2));
            System.out.println(num1 + " * " + num2 + " = " + Calculadora.multiplicar(num1, num2));
            System.out.println(num1 + " / " + num2 + " = " + Calculadora.dividir(num1, num2));
            
        } else {
            double num1 = 0, num2 = 0;
            
            System.out.println("\nInsira o valor do primeiro numero: ");
            num1 = scan.nextDouble();
            System.out.println("Insira o valor do segundo numero: ");
            num2 = scan.nextDouble();
            
            System.out.println("Operações com números reais");
            System.out.println(num1 + " + " + num2 + " = " + Calculadora.somar(num1, num2));
            System.out.println(num1 + " - " + num2 + " = " + Calculadora.subtrair(num1, num2));
            System.out.println(num1 + " * " + num2 + " = " + Calculadora.multiplicar(num1, num2));
            System.out.println(num1 + " / " + num2 + " = " + Calculadora.dividir(num1, num2));
            System.out.println(num1 + " ^ " + num2 + " = " + Calculadora.elevarAPotencia(num1, num2));
            
        }
        
        
        
    }
    
}
