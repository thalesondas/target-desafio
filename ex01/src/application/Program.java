package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List<Integer> fibonacci = new ArrayList<Integer>();

		fibonacci.add(0);
		fibonacci.add(1);

		System.out.print("Informe um número para ver se existe na sequência de Fibonacci: ");
		int num = sc.nextInt();

		int prevNumber = 0;
		int currentNumber = 0;
		int lastNumber = fibonacci.get(fibonacci.size() - 1);
		while (lastNumber <= num) {
			if (lastNumber == num) {
				System.out.println("\nEsse número pertence à sequência.");
				return;
			}
			prevNumber = fibonacci.get(fibonacci.size() - 2);
			currentNumber = fibonacci.get(fibonacci.size() - 1);
			lastNumber = prevNumber + currentNumber;
			fibonacci.add(lastNumber);
		}
		System.out.println("\nEsse número NÃO pertence à sequência.");

		sc.close();
	}

}