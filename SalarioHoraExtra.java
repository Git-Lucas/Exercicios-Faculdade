package salariohoraextra;
import java.util.Scanner;

public class SalarioHoraExtra {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int horas;
		double salario_hora;
		double salario_total;
		
		System.out.println("SISTEMA QUE CALCULA O SAL�RIO COM HORAS EXTRAS\nInforme o total de horas trabalhadas no m�s: ");
		horas = entrada.nextInt();
		System.out.println("\nInforme o seu sal�rio/hora: ");
		salario_hora = entrada.nextDouble();
		
		if (horas > 160) {
			salario_total = (160 * salario_hora) + ((horas - 160) * (salario_hora * 1.5));
			System.out.println("\nSal�rio final: R$" + salario_total);
		}
		else {
			salario_total = horas * salario_hora;
			System.out.println("\nSal�rio final: R$" + salario_total);
		}
	}
}


























