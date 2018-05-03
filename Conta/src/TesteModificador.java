
class TesteModificador {
	public static void main(String[] args) {
		Conta joao = new Conta();
		joao.numero = 123;
		joao.mudaLimite (50);
		
		joao.deposita(500.0);
		joao.saca(600);
		

	System.out.println(joao.pegaSaldo());
	}

}
  	