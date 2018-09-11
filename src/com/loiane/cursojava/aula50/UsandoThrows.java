/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loiane.cursojava.aula50;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author thiago
 */
public class UsandoThrows {
    
    public static void main(String[] args) {
        
        System.out.print("Entre com um número decimal: ");
        try {
            double num = leNumero();
            System.out.println("Você digitou " + num);
        } 
        catch (Exception ex) {
            System.out.println("Entrada inválida");
            ex.printStackTrace();
        }
    }
    
    public static double leNumero() throws Exception{
        Scanner scan = new Scanner(System.in);
        double num = scan.nextDouble();
        return num;
    }
}
