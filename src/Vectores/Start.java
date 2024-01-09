package Vectores;

import java.util.Arrays;

public class Start {

	public static void main(String[] args) {

		// int temperaturas[] = new int[10];
		// temperaturas[4]= 2;
		// temperaturas [0]=20;
		// temperaturas [1]=4;
		// temperaturas [2]=23;

		// String miArray= Arrays.toString(temperaturas);
		// System.out.println(miArray);

		// System.out.println(temperaturas.length);

		char frase[] = new char[10];
		

		for (int i = 0; i < frase.length; i++) {
			// System.out.println("pos "+i+" = "+frase[i]);
			System.out.print(frase[i]);
		}
		System.out.println(" ");

		System.out.println(" ");
		// Pasar por todas las letra que hay en frase.(Java avanzado)
		for (char letra : frase) {
			System.out.println("Bucle avanzado - " + letra);
		}

	}

}
