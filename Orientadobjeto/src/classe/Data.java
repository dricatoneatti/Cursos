package classe;

public class Data {
	int dia; 
	int mes;
	int ano;
	
	//Criando um construtor padrão: Não recebe nenhum parametro na criação do objeto
	Data(){}
	
	//Criando um construtor
	Data(int d, int m, int a){
		dia = d;
		mes = m;
		ano= a;
		
	}

	//Criar um método para formatar a string data como um comportamento para ser inserido uma única so vez:
	
	String formatar() {
		return String.format("%d/%d/%d", dia, mes, ano);
	}
}
