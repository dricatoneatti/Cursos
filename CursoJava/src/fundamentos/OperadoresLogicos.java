package fundamentos;

public class OperadoresLogicos {
	
	public static void main(String[] args) {
		boolean executouTrabalho1 = true;
		boolean executouTrabalho2 = false;
		
		boolean comprouSorvete = executouTrabalho1 || executouTrabalho2;
		boolean comprouTV50 = executouTrabalho1 && executouTrabalho2;
		boolean comprouTV30 = executouTrabalho1 ^ executouTrabalho2;
		
		
		System.out.println("Sorvete= " + comprouSorvete);
		System.out.println("TV50= " + comprouTV50);
		System.out.println("TV30= "+comprouTV30);
		
		//operador unário intruso 
		System.out.println("Fome = " + !comprouSorvete);
	}

}
