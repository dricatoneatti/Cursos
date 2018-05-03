package classe;

public class Calculadora {
	
	double resultado; 

	//Criando um método com entrada e saída
	double somar(double a, double b) {
	resultado = a+b;
	return resultado;
	}
	
	//Criando um método apenas com entrada
	void acrescentar (double a) {
		resultado += a;
	}
	
	//Criando um método apenas com saída
	double obterResultado() {
		return resultado;
	}
	
	//Criando um método sem entrada e sem saída
	void limpar() {
		resultado = 0; 
	}
	
}
