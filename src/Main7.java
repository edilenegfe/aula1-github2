import java.util.Scanner;

public class Main7 {

	public static void main(String[] args) {

		/*
		 * String original = "abcd EFGH ABC abc DEFG ";
		 * 
		 * String s1 = original.toLowerCase(); String s2 = original.toUpperCase();
		 * String s3 = original.trim(); String s4 = original.substring(2); String s5 =
		 * original.substring(2, 9); String s6 = original.replace('a', 'x'); String s7 =
		 * original.replace("abc", "xy");
		 * 
		 * int i = original.indexOf("bc"); int j = original.lastIndexOf("bc");
		 * 
		 * 
		 * System.out.println("Original: -" + original + "-");
		 * System.out.println("toLowerCase: -" + s1 + "-");
		 * System.out.println("toUpperCase: -" + s2 + "-"); System.out.println("trim: -"
		 * + s3 + "-"); System.out.println("substring(2): -" + s4 + "-");
		 * System.out.println("substring(2, 9): -" + s5 + "-");
		 * System.out.println("replace('a', 'x'): -" + s6 + "-");
		 * System.out.println("replace('abc', 'xy'): -" + s7 + "-");
		 * System.out.println("indexOf('bc'): -" + i + "-");
		 * System.out.println("lastIndexOf('bc'): -" + j + "-");
		 * 
		 * 
		 * 
		 * String s = "potato apple lemon orange";
		 * 
		 * String[] vect = s.split(" ");
		 * 
		 * System.out.println(vect[0]); System.out.println(vect[1]);
		 * System.out.println(vect[2]);//comentário em uma linha /* /* comentário em
		 * várias linhas
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter three numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		/*
		 * if (a > b && a > c) { System.out.println("Higher: " + a); } else if (b > c) {
		 * System.out.println("Higher: " + b); } else { System.out.println("Higher: " +
		 * c);
		 * 
		 * }
		 */
		int higher = max(a, b, c);

		showResult(higher);

		sc.close();
	}

//criar função max
	public static int max(int x, int y, int z) {
		int aux;
		if (x > y && x > z) {
			aux = x;
		} else if (y > z) {
			aux = y;
		} else {
			aux = z;
		}
		return aux;
	}

	public static void showResult(int value) {
		System.out.println("Higher: " + value);
	}
}
