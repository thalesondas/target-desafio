package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Escreva uma palavra ou frase: ");
		String string = sc.nextLine();
		
		int count = 0;
		for(char c : string.toCharArray()) {
			if(c == 'a' || c == 'A') {
				count++;
			}
		}
		System.out.printf("\nA frase/palavra '%s' tem %d vez(es) a letra 'a'", string, count);
		
		sc.close();
	}

}
