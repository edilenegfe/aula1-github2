import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// EXERCÍCIO 1
//		int x = sc.nextInt();
//
//		for (int i = 1; i <= x; i++) {
//			if (Math.floorMod(i, 2) == 1) {
//				System.out.println(i);
//			}
//		}

		// EXERCÍCIO 2
//		int N = sc.nextInt();
//		int in = 0;
//		int out = 0;
//
//		for (int i = 0; i < N; i++) {
//			int x = sc.nextInt();
//			if (x >= 10 && x <= 20) {
//				in = in + 1;
//			} else {
//				out = out + 1;
//			}
//		}
//		System.out.println(in + " in");
//		System.out.println(N - in + " out");

		// EXERCÍCIO 3
//		int n = sc.nextInt();
//		double p = sc.nextFloat();
//		double s = sc.nextFloat();
//		double t = sc.nextFloat();
//		
//		for(int i=0; i<=n; i++) {
//			double media = (p*2+s*3+t*5)/(2+3+5);
//			System.out.printf("%.1f%n", media);
//			
//			p = sc.nextFloat();
//			s = sc.nextFloat();
//			t = sc.nextFloat();
//		}

		// EXERCÍCIO 4
//		int n = sc.nextInt();
//
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//
//		for (int i = 0; i < n; i++) {
//
//			if (b == 0) {
//				System.out.println("Divisão impossível");
//
//			} else {
//				double div = (double) a / b;
//				System.out.printf("%.1f%n", div);
//
//			}
//			a = sc.nextInt();
//			b = sc.nextInt();
//		}

		// EXERCÍCIO 5
//		int n = sc.nextInt();
//
//		int fat = 1;
//
//		for (int i = 1; i <= n; i++) {
//			fat = fat * i;
//		}
//		System.out.println(fat);

		// EXERCÍCIO 6
//		int n = sc.nextInt();
//
//		for (int i = 1; i <= n; i++) {
//			if (n % i == 0) {
//				System.out.println(i);
//			}
//
//		}
		
		//EXERCÍCIO 7
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			
			int q = (int) Math.pow(i, 2);
			int c = (int) Math.pow(i, 3);
			
			System.out.print(i + " ");
			System.out.print(q + " ");
			System.out.println(c);
		}

		sc.close();
	}

}
