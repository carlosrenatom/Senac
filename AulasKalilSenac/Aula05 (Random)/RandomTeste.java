package br.senac.randomoutros;

import java.util.Random;

public class RandomTeste {

	public static void main(String[] args) {
		
		// METODO RANDOM IMPORT
		
		
		Random r = new Random();
		int numero = r.nextInt(10)+1;
		boolean sN = r.nextBoolean();
		
		// METODO MATH.RANDOM
		
		double num = Math.random()*10;
		int n1 = 10;
		int n2 = 20;
		int numMaior = Math.max(n1, n2);
		int numMenor = Math.min(n1, n2);
		int numAbsoluto = Math.abs(n1);
		
		
		
		System.out.println("O numero fornecido foi: " + numero);
		System.out.printf("O numero fornecido foi: %.2f \n", num);
		System.out.println(sN);
		System.out.println("O maior numero é " + numMaior + " e o menor numero é " + numMenor );
		System.out.println(numAbsoluto);
	}	

}
