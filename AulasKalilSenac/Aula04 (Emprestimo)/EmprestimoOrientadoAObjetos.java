package emprestimo;

public class EmprestimoOrientadoAObjetos {
	private double valorEmprestimo;
	private int meses;
	private double taxaJurosMensal;

	public EmprestimoOrientadoAObjetos(double valorEmprestimo, int meses, double taxaJurosMensal) {
	        this.valorEmprestimo = valorEmprestimo;
	        this.meses = meses;
	        this.taxaJurosMensal = taxaJurosMensal;
	    }

	public double calcularValorParcela() {
		double vf = valorEmprestimo * Math.pow((1 + taxaJurosMensal), meses);
		return vf / meses;
	}

	public static void main(String[] args) {
		double valorEmprestimo = gerarValorEmprestimo();
		int meses = gerarQuantidadeMeses();
		double taxaJurosMensal = 0.02;

		EmprestimoOrientadoAObjetos emprestimo = new EmprestimoOrientadoAObjetos(valorEmprestimo, meses, taxaJurosMensal);
		double valorParcela = emprestimo.calcularValorParcela();

		System.out.printf("Valor do empréstimo: R$ %.2f\n", valorEmprestimo);
		System.out.println("Quantidade de meses: " + meses);
		System.out.printf("Valor da parcela: R$ %.2f", valorParcela);
	}

	public static double gerarValorEmprestimo() {
		return 1000 + Math.random() * 100000;
	}

	public static int gerarQuantidadeMeses() {
		return (int) (1 + Math.random() * 60);
	}
}