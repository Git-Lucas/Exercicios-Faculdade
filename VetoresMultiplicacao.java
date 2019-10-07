package vetoresmultiplicacao;
import java.util.Scanner;
import java.util.Random;

public class VetoresMultiplicacao {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Random random = new Random();
		int tamanho;
		int resultado;
			
		System.out.println("SISTEMA QUE MULTIPLICA OS ELEMENTOS DO VETOR E MOSTRA OS PRODUTOS PARES\nInforme o tamanho do vetor: ");
		tamanho = entrada.nextInt();
		int v[] = new int[tamanho];
		System.out.println("\nVetor criado:");
		for (int i = 0; i < tamanho; i++) {
			v[i] = random.nextInt(10);
			System.out.print(v[i] + " ");
		}

		System.out.println("\n\nOs produtos pares do vetor são: ");
		for (int i = 0; i < v.length; i++) {
			for (int j = i+1; j < v.length; j++) {
				resultado = v[i] * v[j];
				if (resultado % 2 == 0)
					System.out.println(v[i] + " * " + v[j] + " = " + resultado);
			}
		}
	}	
}
