/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loiane.cursojava.aula43.labs.exer03;

import java.util.Scanner;

/**
 *
 * @author thiago
 */
public class Teste {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        Animal camelo = new Animal();
        Mamifero ursoCanada = new Mamifero();
        Peixe tubarao = new Peixe();
        
        camelo.setNome("Camelo");
        camelo.setComprimento(150);
        camelo.setCor("Amarelo");
        camelo.setAmbiente("Terra");
        camelo.setVelocidade(2);
        
        ursoCanada.setNome("Urso-do-canadá");
        ursoCanada.setComprimento(180);
        ursoCanada.setCor("Vermelho");
        ursoCanada.setVelocidade(0.5);
        ursoCanada.setAlimento("Mel");
        
        tubarao.setNome("Tubarão");
        tubarao.setComprimento(300);
        tubarao.setVelocidade(1.5);
        
        Animal[] animais = new Animal[3];
        animais[0] = camelo;
        animais[1] = tubarao;
        animais[2] = ursoCanada;
        
        System.out.println("--------------------");
        for(Animal animal: animais){
            System.out.println(animal);
            System.out.println("--------------------");
        }
        
        /*
        System.out.print("Zoo: ");
        System.out.print(camelo);
        System.out.print(tubarao);
        System.out.print(ursoCanada);
        */
    }
    
}
