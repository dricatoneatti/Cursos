package fundamentos;

public class Variaveis {
	public static void main(String[] args) {
		double raio = 4.5;
		final double PI = 3.1416;
		double area = PI * raio *raio;
		
		System.out.println("A �rea � " + area + " m2");
		System.out.printf("A �rea � %f m2.\n", area);
		System.out.printf("A �rea � %.2f m2.", area);
	}

}
 