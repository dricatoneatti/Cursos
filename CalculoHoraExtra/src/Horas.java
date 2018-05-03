
public class Horas {
	public static void main(String[] args) {

		double horasTrabalhadas =40.0;
		double valorHora = 17.88;
		double horasExtras = 0;
		double retorno=0;
		

		
		if (horasTrabalhadas > 40) {
			horasExtras = horasTrabalhadas - 40;
			retorno = valorExtraTotal(horasExtras, valorHora);
			System.out.println(retorno);
			
		}

		else {

			System.out.println("O funcionário não possui Horas Extras nesse mês");
		}
	}

	protected static double valorExtraTotal(double horasExtras, double valorHora) {
		double calculoHoraExtra = horasExtras * valorHora;
		return calculoHoraExtra;

	}
}
