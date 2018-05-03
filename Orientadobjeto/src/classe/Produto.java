package classe;

public class Produto {
	String nome;
	double preco;
	static double desconto; //STATIC: tornando a variavel de instancia para a variavel de classe
	
	Produto(){
		
	}
	
	Produto(String nome, double preco){
		this.nome = nome;
		this.preco = preco;
		
	}

	//Criar um metodo 
	double precoComDesconto() {
		return preco - preco*desconto;
	}
}
