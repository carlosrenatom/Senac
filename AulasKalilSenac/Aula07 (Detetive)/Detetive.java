import java.util.Scanner;

public class Detetive {

	public static void main(String[] args) {
		System.out.println("<<<<<<<<<DETETIVE>>>>>>>>>");
		System.out.println("Solucionando Crimes");

		Scanner jogo = new Scanner(System.in);
		System.out.println();
		System.out.println("Quer jogar : [ 1 ]\n" + "Sair do jogo : [ 2 ]");
		int sim = jogo.nextInt();
		int pontos = 0;


		if (sim == 1 || sim == 2) {
			System.out.println("INICIANDO...");
			System.out.println("RESPOSTAS SERÃO\n" + "[ 1 ] PARA SIM\n" + "[ 2 ] PARA NÃO");

			Scanner input = new Scanner(System.in);
			System.out.printf("Ele telefonou para a vitima ?");
			while (true) {
				int p1 = input.nextInt();
				if (p1 != 1 && p1 != 2) {
					System.out.println("Reposta errada, digite apenas 1 ou 2\n");
					System.out.printf("Ele telefonou para a vitima ?");
				} else if (p1 == 1) {
					pontos++;
					break;
				}else {
					break;
				}

			}
			System.out.printf("Ele esteve no local do crime ?");
			while (true) {
				int p1 = input.nextInt();
				if (p1 != 1 && p1 != 2) {
					System.out.println("Reposta errada, digite apenas 1 ou 2\n");
					System.out.printf("Ele esteve no local do crime ?");
				} else if (p1 == 1) {
					pontos++;
					break;
				}else {
					break;
				}

			}
			System.out.printf("Ele mora perto da vítima ? ");
			while (true) {
				int p1 = input.nextInt();
				if (p1 != 1 && p1 != 2) {
					System.out.println("Reposta errada, digite apenas 1 ou 2\n");
					System.out.printf("Ele mora perto da vítima ? ");
				} else if (p1 == 1) {
					pontos++;
					break;
				} else {
					break;
				}

			}
			System.out.printf("Ele devia para a vítima? ");
			while (true) {
				int p1 = input.nextInt();
				if (p1 != 1 && p1 != 2) {
					System.out.println("Reposta errada, digite apenas 1 ou 2\n");
					System.out.printf("Ele devia para a vítima? ");
				} else if (p1 == 1) {
					pontos++;
					break;
				}else{
					break;
				}

			}
			System.out.printf("Ele já trabalhou com a vítima? ");
			while (true) {
				int p1 = input.nextInt();
				if (p1 != 1 && p1 != 2) {
					System.out.println("Reposta errada, digite apenas 1 ou 2\n");
					System.out.printf("Ele já trabalhou com a vítima? ");
				} else if (p1 == 1) {
					pontos++;
					break;
				}else {
					break;
				}

			}
			if (pontos == 2) {
				System.out.println("Ele é um suspeito do crime!\n"
						+ "Olho nele!");
			}
			else if (pontos == 3 || pontos == 4) {
				System.out.println("Ele é um cumplice!\n"
						+ "Cadeia nele!");
			}
			else if (pontos == 5) {
				System.out.println("Ele é o assassino!\n"
						+ "VAI PRA CADEIA VAGABUNDO");
			}
			else {
				System.out.println("Ele é inocente!");
				
			}
			jogo.close();
			input.close();
			

		}
		

	}
}