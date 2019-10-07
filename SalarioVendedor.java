package salariovendedor;
import java.util.Scanner;

public class SalarioVendedor {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int carros_vendidos;
		double valor_vendas;
		double salario_fixo;
		double salario_final;
		
		System.out.println("SISTEMA QUE CALCULA O SALÁRIO DO VENDEDOR COM COMISSÃO EM VENDAS\nInforme quantos carros foram vendidos: ");
		carros_vendidos = entrada.nextInt();
		System.out.println("\nInforme o valor total de suas vendas: ");
		valor_vendas = entrada.nextDouble();
		System.out.println("\nInforme o seu salário fixo: ");
		salario_fixo = entrada.nextDouble();
		
		salario_final = salario_fixo + (valor_vendas * 0.05);
		
		System.out.println("\n\nO funcionário vendeu " + carros_vendidos + " carros e o seu salário final é R$" + salario_final);
	}
}
