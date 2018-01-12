package com.loiane.cursojava.aula14.labs;

import java.util.Scanner;

public class lista2Ex20 {

	public static void main(String[] args) {
		
		int cont = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Telefonou para a v�tima? (sim - não)");
		String resp = scan.next();
		
		//intern � mais r�pido mas para arquivos xml, para banco de dados e outras coisas � uma desvantagem por perder dados
		// e se n�o estiver no pool perde o quesito velocidade
		//usando intern() pq nesse caso fica melhor, mais r�pido e enxuto. Podia usar o resp.equals("sim")
		
		if(resp.intern() == "sim"){
			cont++;
		}
		System.out.println("cont: "+ cont);
		/*
		switch(resp){
		
		case "Sim":
		case "sim": cont++; break;
		case "n�o":
		case "nao":
		case "N�o":
		case "Nao": cont = cont; break;
		default: System.out.println("Digite sim ou n�o.");
		
		}
		*/
		
		
		System.out.println("Esteve no local do crime? (sim - n�o)");
		resp = scan.next();
		
		if(resp.intern() == "sim"){
			cont++;
		}
		
		
		/*
		switch(resp){
		
		case "Sim":
		case "sim": cont++; break;
		case "n�o":
		case "nao":
		case "N�o":
		case "Nao": cont = cont; break;
		default: System.out.println("Digite sim ou n�o.");
		
		}
		*/
	
		
		System.out.println("Mora perto da v�tima? (sim - n�o)");
		resp = scan.next();
		
		if(resp.intern() == "sim"){
			cont++;
		}
		
		
		/*
		switch(resp){
		
		case "Sim":
		case "sim": cont++; break;
		case "n�o":
		case "nao":
		case "N�o":
		case "Nao": cont = cont; break;
		default: System.out.println("Digite sim ou n�o.");
		
		}
		*/

		
		System.out.println("Devia para a v�tima? (sim - n�o)");
		resp = scan.next();
		
		if(resp.intern() == "sim"){
			cont++;
		}
		
		
		/*
		switch(resp){
		
		case "Sim":
		case "sim": cont++; break;
		case "n�o":
		case "nao":
		case "N�o":
		case "Nao": cont = cont; break;
		default: System.out.println("Digite sim ou n�o.");
		
		}
		*/
		

		
		System.out.println("J� trabalhou com a  v�tima? (sim - n�o)");
		resp = scan.next();
		
		if(resp.intern() == "sim"){
			cont++;
		}
		
		
		/*
		switch(resp){
		
		case "Sim":
		case "sim": cont++; break;
		case "n�o":
		case "nao":
		case "N�o":
		case "Nao": cont = cont; break;
		default: System.out.println("Digite sim ou n�o.");
		
		}
		*/
		
		
		switch(cont){
		
		
		case 2: System.out.println("Suspeito.");  break;
		case 3: 
		case 4: System.out.println("C�mplice.");  break;
		case 5: System.out.println("Assasino.");  break;
		
		default: System.out.println("Inocente.");
		}
		

	}

}
