package classe;

public class Calculadora {
	
	double resultado; 

	//Criando um m�todo com entrada e sa�da
	double somar(double a, double b) {
	resultado = a+b;
	return resultado;
	}
	
	//Criando um m�todo apenas com entrada
	void acrescentar (double a) {
		resultado += a;
	}
	
	//Criando um m�todo apenas com sa�da
	double obterResultado() {
		return resultado;
	}
	
	//Criando um m�todo sem entrada e sem sa�da
	void limpar() {
		resultado = 0; 
	}
	
}
