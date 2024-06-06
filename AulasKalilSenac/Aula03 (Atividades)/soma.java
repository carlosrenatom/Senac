package aula03;

import java.util.Scanner;

public class soma {

	public static void main(String[] args) {
		Scanner n1 = new Scanner(System.in);
		System.out.print("Digite o primeiro numero: ");
		int num1 = n1.nextInt();
		
		Scanner n2 = new Scanner(System.in);
		System.out.print("Digite o segundo numero: ");
		int num2 = n2.nextInt();
		
		int soma = num1 + num2; 
		
		
		System.out.print(num1 + "+" + num2 + "=" + soma);
		
		n1.close();
		n2.close();

	}

}
