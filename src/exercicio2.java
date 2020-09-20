import java.util.Locale;
import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double x, j;

		x = sc.nextDouble();

		if (x <= 2000.00) {
			j = 0.00;
		} else if (x <= 3000.00) {
			j = (x - 2000) * 0.08;
		} else if (x <= 4500.00) {
			j = (x - 3000) * 0.18 + 1000.00 * 0.08;
		} else {
			j = (x - 4500.00) * 0.28 + 1500.00 * 0.18 + 1000.00 * 0.08;
		}
		if (j == 0.0) {
			System.out.println("Isento");
		} else {
			System.out.printf("R$ %.2f", j);
		}

		sc.close();
	}
}
