package fundamentos;

public class OperadorTernario {
	public static void main(String[] args) {
		/*Operador (?) :
		 * Composto por três partes:
		 * 1 - Antes do ?, onde possui a condição
		 * 2 - Antes dos :, onde possui a primeira opção (verdadeiro)
		 * 3 - Depois dos :, onde possui a segunda opçao (falsa)
		 */
		
		double nota = 7.1;
		String resultado = nota >= 7 ? "Aprovado" : "Recuperação";
		
		System.out.println(resultado);
	}
}
