package utilities;

import java.util.Scanner;

public class Read {

	@SuppressWarnings("resource")
	public static String readName() {
		System.out.println("Introduce nombre de palabra: ");
		return new Scanner(System.in).nextLine();
	}

	@SuppressWarnings("resource")
	public static String readDefinition() {
		System.out.println("Introduce definicion de palabra: ");
		return new Scanner(System.in).nextLine();
	}

	@SuppressWarnings("resource")
	public static String languaje() {
		System.out.println("Introduce idioma a traducir: ");
		return new Scanner(System.in).nextLine();
	}

	@SuppressWarnings("resource")
	public static String text(String text) {
		System.out.println(text);
		return new Scanner(System.in).nextLine();
	}
}
