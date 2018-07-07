package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class switchCase1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um dia da semana");
		int diaSemana = scan.nextInt();
		
		if (diaSemana == 1) {			
			System.out.println("Domingo");
			
		} else if (diaSemana == 2) {			
			System.out.println("Segunda-Feira");
			
		} else if (diaSemana == 3) {			
			System.out.println("Terca-Feira");
			
		} else if (diaSemana == 4) {			
			System.out.println("Quarta-Feira");
			
		} else if (diaSemana == 5) {			
			System.out.println("Quinta-Feira.");
			
		} else if (diaSemana == 6) {			
			System.out.println("sexta-Feira");
			
		} else if (diaSemana == 7) {			
			System.out.println("sábado");
			
		} else {
			System.out.println("Não é um dia válido");
		}
		
		
		switch (diaSemana) {
		case 1: System.out.println("Domingo");
		break;
		case 2: System.out.println("Segunda");
		break;
		case 3: System.out.println("Terça");
		break;
		case 4: System.out.println("Quarta");
		break;
		case 5: System.out.println("Quinta");
		break;
		case 6: System.out.println("Sexta");
		break;
		case 7: System.out.println("Sábado");
		break;		
		default: System.out.println("Não é um número válido");
	
		
		
		}

	}

}
