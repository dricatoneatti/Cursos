package classe;

public class funcionarioTeste {
	public static void main(String[] args) {
		funcionario dados = new funcionario("Adriana", 100.000, "analista"); //objeto - instancia
		
		
		funcionario relacao = new funcionario("Adriano", 200.500, "Gerente");
		relacao.nome = "Adriano";
		relacao.salario = 200.500;
		relacao.funcao = "Gerente";
		
		
		System.out.println();	
		

	}
}
		
	
	

