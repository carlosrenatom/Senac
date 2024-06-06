package aula03;

import java.util.Scanner;

public class salario {

	public static void main(String[] args) {
		
		Scanner n1 = new Scanner(System.in);
		System.out.println("SALARIO POR HORA: ");
		float porhora = n1.nextFloat(); 
		
		
		Scanner n2 = new Scanner(System.in);
		System.out.println("HORA TRABALHADA: ");
		float trbhora = n2.nextFloat();
		
		
		n1.close();
		n2.close();
	}

}
