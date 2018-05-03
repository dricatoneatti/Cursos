package classe;

public class Data {
	int dia; 
	int mes;
	int ano;
	
	//Criando um construtor padr�o: N�o recebe nenhum parametro na cria��o do objeto
	Data(){}
	
	//Criando um construtor
	Data(int d, int m, int a){
		dia = d;
		mes = m;
		ano= a;
		
	}

	//Criar um m�todo para formatar a string data como um comportamento para ser inserido uma �nica so vez:
	
	String formatar() {
		return String.format("%d/%d/%d", dia, mes, ano);
	}
}
