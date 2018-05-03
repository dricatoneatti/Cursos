package fundamentos;

public class ConversaoNumeroString {
	public static void main(String[] args) {
		Integer num1 = 10000;
		System.out.println(num1.toString().length());
		
		//tipo primitivo - é possível converter usando um wrapper e usando o to string 
		int num2 = 100000;
		System.out.println(Integer.toString(num2).length());
		
		//concatenação com uma string vazia - menos formal 
		System.out.println(("" + num2).length());
	}

}
