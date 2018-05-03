import java.util.Scanner;

public class For {
	// O laço é formado por um contador, expressão e incremento
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double somaDasNotas = 0;
		double notas = 0;

		for (int i = 0; i < 3; i++) {
			notas = scanner.nextDouble();
			somaDasNotas += notas;
			
			
			
		}
		scanner.close();
		System.out.println("A média é: " + somaDasNotas / 3);

	}
}

