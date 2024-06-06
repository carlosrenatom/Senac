package emprestimo;

import java.util.Random;

public class EmprestimoEstruturado {

	public static void main(String[] args) {
	
	double ve = valorEmprestimo();
	int t = numeroParcelas();
	double tx = 0.02; 
	
	double vf = calcularParcela(ve, tx, t);
	
	System.out.printf("Valor do empréstimo: R$ %.2f\n", ve);
	System.out.println("Quantidade de meses: " + t);
	System.out.printf("Valor da parcela: R$ %.2f", vf);
	
	
	
		
	}

	

	public static double valorEmprestimo() {
		
		return (int) 1000 + Math.random() * 100000;
	}

	public static int numeroParcelas() {
		Random r = new Random();
		int meses = r.nextInt(60)+1; 
		return meses;
		
		
	}
	public static double calcularParcela(double ve, double tx, int t) {
		double vf = ve * Math.pow((1+tx), t);
		return vf / t;
	}

}
