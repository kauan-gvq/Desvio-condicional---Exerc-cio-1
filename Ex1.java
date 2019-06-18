package Exs.java;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Digite um número :");
		int x = in.nextInt();
		if(x < 15) {
		System.out.print("É menor que 15");
		}
		else if(x > 100) {
		System.out.print("É maior que 100");
		}
		else {
		System.out.print("O número está entre 15 e 100");
		}

	}
}