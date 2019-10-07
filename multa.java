package multa;
import java.util.Scanner;

public class multa {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int velocidade_max;
		String placa;
		int velocidade_carro;
		int multa;
		
		System.out.println("SISTEMA QUE CALCULA O VALOR DA MULTA DE ACORDO COM A VELOCIDADE\nInforme a velocidade máxima permitida: ");
		velocidade_max = entrada.nextInt();
		
		System.out.println("\nPlaca do carro: ");
		placa = entrada.next();
		
		System.out.println("\nVelocidade do carro: ");
		velocidade_carro = entrada.nextInt();
		
		if (velocidade_carro > velocidade_max) {
			multa = (velocidade_carro - velocidade_max) * 5;
			if (multa > 190)
				System.out.println("\n\nO veículo placa " + placa + " estava acima da velocidade e o valor da multa é de R$190,00!");
			else
				System.out.println("\n\nO veículo placa " + placa + " estava acima da velocidade e o valor da multa é de R$" + multa + ",00!");
		}
		else
			System.out.println("\n\nO veículo placa " + placa + " estava numa velocidade permitida pela via! Não há multa.");
	}
}
