package com.loiane.cursojava.aula12;

import java.util.Scanner;

public class LeituraDeDadosDoTeclado {

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		System.out.println("Digite seu nome completo");
		String nomeCompleto = scan.nextLine();
		System.out.println(nomeCompleto);
		
		System.out.println("Digite o seu primeiro nome");
		String primeiroNome = scan.next();
		System.out.println(primeiroNome);	
		
		
		
		
	}

}
