package fundamentos;

public class OperadorTernario {
	public static void main(String[] args) {
		/*Operador (?) :
		 * Composto por tr�s partes:
		 * 1 - Antes do ?, onde possui a condi��o
		 * 2 - Antes dos :, onde possui a primeira op��o (verdadeiro)
		 * 3 - Depois dos :, onde possui a segunda op�ao (falsa)
		 */
		
		double nota = 7.1;
		String resultado = nota >= 7 ? "Aprovado" : "Recupera��o";
		
		System.out.println(resultado);
	}
}
