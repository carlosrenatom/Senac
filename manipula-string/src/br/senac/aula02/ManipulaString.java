package br.senac.aula02;

public class ManipulaString {
	public static void main(String[] args) {
		String tarefa = "";
		
		int horaDisponivel = 8;
		tarefa += cadastrarTarefa("001", "Estudar Java", 10, 11, horaDisponivel -= 11 - 10);
		tarefa += cadastrarTarefa("002", "Fazer compras", 11, 12, horaDisponivel -= 12 - 11);
		tarefa += cadastrarTarefa("003", "Limpar a casa", 12, 13, horaDisponivel -= 13 - 12);
		exibirTarefas(tarefa);
		
		
		
	}

	private static void exibirTarefas(String tarefa) {
		System.out.println("Código - Tarefa - Inicio - Fim - Horas restantes\n");
		System.out.printf(tarefa);
		
	}

	private static String cadastrarTarefa(String codigo, String descricao, int inicio, int fim, int horaDisponivel) {
		
		return String.format("%s - %s - %d - %d -" + " o restante de horas são " + "%dhrs\n\n", codigo, descricao, inicio, fim, horaDisponivel);
		
	}
		
}