package vetores;
import java.util.Scanner;
import java.util.Random;

public class Vetores {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Random random = new Random();
		int aux = 0;
		int tamanho;
		
		System.out.println("SISTEMA QUE CRIA UM VETOR 'C' COM ELEMENTOS DOS VETORES 'A' E 'B'\nInforme o tamanho dos vetores A e B: ");
		tamanho = entrada.nextInt();
		int vetor_a[] = new int[tamanho];
		System.out.println("\nVETOR A:");
		for (int i = 0; i < tamanho; i++) {
			vetor_a[i] = random.nextInt(10);
			System.out.print(vetor_a[i] + " ");
		}
		
		int vetor_b[] = new int[tamanho];
		System.out.println("\n\nVETOR B:");
		for (int i = 0; i < tamanho; i++) {
			vetor_b[i] = random.nextInt(10);
			System.out.print(vetor_b[i] + " ");
		}
		
		int tamanho_c = tamanho * 2;
		int vetor_c[] = new int[tamanho_c];
		System.out.println("\n\nVETOR C:");
		for (int i = 0; i < tamanho_c; i++) {
			if (i==0 || i%2 == 0) {
				vetor_c[i] = vetor_a[aux];
				System.out.print(vetor_c[i] + " ");
			}
			
			else {
				vetor_c[i] = vetor_b[aux];
				System.out.print(vetor_c[i] + " ");
				aux++;
			}
		}
	}
}