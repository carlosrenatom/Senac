package aula03;

import java.util.Scanner;

public class notas {

	public static void main(String[] args) {
		Scanner nota1 = new Scanner(System.in);
		System.out.print("Digite a primeira nota: ");
		float n1 = nota1.nextFloat();
		
		Scanner nota2 = new Scanner(System.in);
		System.out.print("Digite a segunda nota: ");
		float n2 = nota1.nextFloat();
		
		Scanner nota3 = new Scanner(System.in);
		System.out.print("Digite a terceira nota: ");
		float n3 = nota1.nextFloat();
		
		Scanner nota4 = new Scanner(System.in);
		System.out.print("Digite a quarta nota: ");
		float n4 = nota1.nextFloat();
		
		float media = (n1 + n2 + n3+ n4) / 4f;
		
		System.out.printf("A media foi %.2f", media);
		
		
		nota1.close();
		nota2.close();
		nota3.close();
		nota4.close();

	}

}
