package application;

public class Program {

	public static void main(String[] args) {

		int INDICE = 12;
		int SOMA = 0;
		int K;
		
		for(K = 1; K < INDICE;) {
			K++;
			SOMA += K;
		}
		
		System.out.println("Ao final do processamento, o valor da variável SOMA será " + SOMA);

	}

}
