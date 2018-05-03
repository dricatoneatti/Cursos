package classe;

public class ProdutoTeste {

	public static void main(String[] args) {
		// Criar instancia de produto
		
	Produto produto1 = new Produto();
	produto1.nome = "notebook";
	produto1.preco = 3.500;
	
	Produto produto2 = new Produto("Caneta", 3.20);
	
	Produto.desconto = 0.15;
	System.out.println(produto1.precoComDesconto());
	System.out.println(produto2.precoComDesconto());
	}

}
