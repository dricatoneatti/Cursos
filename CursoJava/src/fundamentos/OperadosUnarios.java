package fundamentos;

public class OperadosUnarios {
	public static void main(String[] args) {
		//O sinal opera no operando
		int num1 = 1;
		int num2 = 2;
		
		//Incremento e decremento
		//incremento pos fixado: depois do nome da variavel
		num1++;
		System.out.println(num1);
		//decremendo pre fixado: antes do nome da variavel
		--num1;
		System.out.println(num1);
		
		/*O incremento é pre fixado, portanto a incrementação
		 *  sera feita antes da comparação. E só depois da 
		 *  comparação, será feito a decrementação do num2:
		 */
		
		System.out.println(++num1 == num2--); //->PESSIMAPRATICA
		/*Portanto, somente depois que passar a linha,
		 * o num 2 sera 1:
		 */
		System.out.println(num1);
		System.out.println(num2);
		
		//Complemento Bunario
		System.out.println(Integer.toBinaryString(50)); //Valor 50 convertido no formato binario
		System.out.println(Integer.toBinaryString(~50));// (~ : inverte os numeros
		
		//Negação logica
		System.out.println(!false);
		System.out.println(!true);
		
		
		
	}

}
