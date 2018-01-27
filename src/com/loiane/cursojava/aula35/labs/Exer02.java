/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loiane.cursojava.aula35.labs;

import java.util.Scanner;

/**
 *
 * @author thiago
 */
public class Exer02 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int num = -1;
        
        do{
            System.out.println("Entre com N inteiro e positivo para fazer o somatório de 1 a N");
            System.out.print("->");
            num = scan.nextInt();
            
            if(num > 0){
                System.out.println(Somatorio.somatorio(num,0));
            }
        }while(num < 0);
        
        
        System.out.println(Somatorio.somatorio2(num));
        
    }
    
}
