package aula03;

import java.util.Scanner;

public class CmtoMetros {

	public static void main(String[] args) {
		
		Scanner n1 = new Scanner(System.in);
		System.out.print("METROS: ");
		float m = n1.nextFloat(); 
		
		float cvrt = m * 100;
		
		System.out.printf(m + "m é %.1f cm", cvrt);
		
		
		
		n1.close();

	}

}
