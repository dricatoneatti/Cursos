package fundamentos;

public class OperadoresAtribui��o {
	public static void main(String[] args) {
		int a = 7;
		int b =3;
		//->Passar o valor de a na variavel b:
		//->b= a; 
		//Acrescentar na variavel B, o valor de A:
		b+=a;  // como se fosse: b = b +a
		b*=4; //Atribui��o multiplica��o - b = b*4
		b/=2; //Atribui��o Divisiva -  b = b/2
		b-=2; // b = b-2
		b%=2; //LEMBRAR: modulo = resto da divis�o
		
		
		System.out.println(b);
	}

}
