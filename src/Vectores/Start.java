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
		frase[0] = 'H';
		frase[1] = 'O';
		frase[2] = 'L';
		frase[3] = 'A';
		frase[4] = ' ';
		frase[5] = 'h';
		frase[6] = 'o';
		frase[7] = 'l';
		frase[8] = 'a';
		frase[9] = '!';

		for (int i = 0; i < frase.length; i++) {
			// System.out.println("pos "+i+" = "+frase[i]);
			System.out.print(frase[i]);
		}
		System.out.println(" ");

		// Se imprime al reves
		for (int i = frase.length - 1; i >= 0; i--) {
			System.out.print(frase[i]);

		}
		System.out.println(" ");
		// Pasar por todas las letra que hay en frase.(Java avanzado)
		for (char letra : frase) {
			System.out.println("Bucle avanzado - " + letra);
		}

	}

}
