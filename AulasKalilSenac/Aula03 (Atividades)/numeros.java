package aula03;

import java.util.Scanner;

public class numeros {

	public static void main(String[] args) {
		
		Scanner num1 = new Scanner(System.in);
		System.out.print("Digite um numero: ");
		int n1 = num1.nextInt();
		
		System.out.print("o numero escolhido foi " + n1);
		num1.close();

	}

}
