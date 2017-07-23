package com.loiane.cursojava.exerciciosaula13;
import java.util.Scanner;

public class PesoIdealSofisticado {

	public static void main(String[] args) {
		
		double altura, peso, pesoIdeal;
		boolean sexo;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a altura: ");
		altura = scan.nextFloat();
		
		System.out.println("Seu sexo é masculino? sim (digite true) não (digite false): ");
		sexo = scan.nextBoolean();
		
	
		
		if(sexo == true){ // erro na comparação da string
			
			pesoIdeal = ((72.7)*altura) - 58;
			
		}
		
		else{
			
			pesoIdeal = (62.1*altura) - 44.7;
		}
		
		System.out.println(pesoIdeal);
		
		System.out.println("\nDigite seu peso: ");
		peso = scan.nextDouble();
		
		
		
		if(peso > pesoIdeal){
			
			System.out.println("Acima do peso!");
			
		}
		
		else if (peso < pesoIdeal){
		
			System.out.println("Abaixo do peso!");
		}
		
		else{
			
			System.out.println("No peso ideal!");
		}
		
		

	}

}
