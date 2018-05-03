class Conta {
	int numero; 
	Cliente titular; 
	private double saldo; 
	private double limite; 
	
	public void saca(double valor) {
		if (valor>this.saldo + this.limite) {
			System.out.println("Saldo indispon�vel");
		}else {		
		this.saldo = this.saldo-valor;
		}
	}	
	void deposita(double valor) {
		this.saldo = this.saldo+valor; 
	}
	
	double pegaSaldo() {
		return saldo;
	}
	public void mudaLimite (double novoLimite) {
		this.limite=novoLimite;
	}
}


class Cliente {
	String nome;
	String endereco;
}
