import java.util.Locale;
import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		float A = sc.nextFloat();
		float B = sc.nextFloat();
		float C = sc.nextFloat();
		float pi = (float) 3.14159;
		
		float triangulo = A * C / 2;
		float circ = (float) (pi * (Math.pow(C, 2)));
		float trap = (A + B) / 2 * C;
		float quadr = B * B;
		float retang = A * B;


		System.out.printf("TRIÂNGULO: %.3f%nCÍRCULO: %.3f%nTRAPÉZIO: %.3f%nQUADRADO: %.3f%nRETÂNGULO: %.3f", triangulo, circ, trap, quadr, retang);

		sc.close();
	}

}
