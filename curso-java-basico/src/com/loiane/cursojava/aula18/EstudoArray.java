package com.loiane.cursojava.aula18;

public class EstudoArray {

	public static void main(String[] args) {
		double [] temperaturas = new double[365];
		temperaturas[0] = 33.7;
		temperaturas[1] = 14.7;
		temperaturas[2] = 20.7;
		temperaturas[3] = 14.7;
		temperaturas[4] = 40.7;
		temperaturas[5] = 14.7;
		temperaturas[6] = 458.7;
		temperaturas[7] = 47.7;
		//Array
		System.out.println("A temperatura � :" + temperaturas[1]);
		System.out.println("A temperatura � :" + temperaturas[4]);
		System.out.println("A temperatura � :" + temperaturas[5]);
		System.out.println("A temperatura � :" + temperaturas[2]);
		System.out.println("A temperatura � :" + temperaturas[4]);
		System.out.println("A temperatura � :" + temperaturas[4]);
		
		System.out.println("A temperatura � :" + temperaturas.length);
		
		for ( int i = 0; i < temperaturas.length; i++){
			System.out.println("A temperatura do dis " + (i + 1) + "� " + temperaturas[i]);
		}
		
		for (double temp : temperaturas) {
			System.out.println(temp);
		}

	}
	
}
