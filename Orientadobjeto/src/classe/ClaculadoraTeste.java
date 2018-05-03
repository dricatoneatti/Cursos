package classe;

public class ClaculadoraTeste {

	public static void main(String[] args) {
		//Criar um objeto de calculadora
		Calculadora calc = new Calculadora ();
		
		//Usar os métodos criados: SOMAR
		System.out.println(calc.somar(17.1, 2.4));
		
		//ACRESCENTAR: cmo não retorna nada, não é preciso inseri-lo no Syso
		calc.acrescentar(10);
		
		//OBTER RESULTADO:
		System.out.println(calc.obterResultado());
		
		calc.limpar();
		System.out.println(calc.obterResultado());

	}
}
