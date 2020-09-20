import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// EXERCÍCIO 1
		// int a;
		// a = sc.nextInt();

		// while (a != 2002) {
		// System.out.println("Senha Inválida");
		// a = sc.nextInt();
		// }
		// System.out.println("Acesso Permitido");

		// EXERCÍCIO 2
//		int x, y;
//		x = sc.nextInt();
//		y = sc.nextInt();
//
//		while ((x != 0) || (y != 0)) {
//			if (x > 0) {
//				if (y > 0) {
//					System.out.println("primeiro");
//				}
//
//				if (y < 0) {
//					System.out.println("quarto");
//				}
//			} else {
//				if (x < 0) {
//					if (y < 0) {
//						System.out.println("terceiro");
//					}
//					if (y > 0) {
//						System.out.println("segundo");
//					}
//				}
//			}
//
//			x = sc.nextInt();
//			y = sc.nextInt();
//		}

		// EXERCÍCIO 3

		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		int cod = sc.nextInt();

		while (cod != 4) {
		if (cod == 1) {
				alcool = alcool + 1;
			} else if (cod == 2) {
				gasolina = gasolina + 1;
			} else if (cod == 3) {
				diesel = diesel + 1;
			}
			cod = sc.nextInt();
		}
		System.out.println("MUITO OBRIGADO");
		System.out.println("Álcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);

		sc.close();

	}
}
