package classe;

public class ClaculadoraTeste {

	public static void main(String[] args) {
		//Criar um objeto de calculadora
		Calculadora calc = new Calculadora ();
		
		//Usar os m�todos criados: SOMAR
		System.out.println(calc.somar(17.1, 2.4));
		
		//ACRESCENTAR: cmo n�o retorna nada, n�o � preciso inseri-lo no Syso
		calc.acrescentar(10);
		
		//OBTER RESULTADO:
		System.out.println(calc.obterResultado());
		
		calc.limpar();
		System.out.println(calc.obterResultado());

	}
}
