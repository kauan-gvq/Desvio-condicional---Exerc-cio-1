package Exs.java;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Digite um n�mero :");
		int x = in.nextInt();
		if(x < 15) {
		System.out.print("� menor que 15");
		}
		else if(x > 100) {
		System.out.print("� maior que 100");
		}
		else {
		System.out.print("O n�mero est� entre 15 e 100");
		}

	}
}