package classe;

public class DataTeste {
	public static void main(String[] args) {
		//instancia de Data
		Data nascimento = new Data(06,03,1999);
		nascimento.dia = 06;
		nascimento.mes = 03;
		nascimento.ano = 1999;
		
		Data casamento = new Data(8,10,2026);
		
	System.out.println(casamento.formatar());
	System.out.println(nascimento.formatar());
		
	}
}


