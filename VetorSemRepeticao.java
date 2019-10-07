package vetorsemrepeticao;
import java.util.Scanner;
import java.util.Random;

public class VetorSemRepeticao {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int v[] = new int[20];
		int num;
		int aux = 0;
		
		System.out.println("SISTEMA QUE RETIRA O VALOR DESEJADO DO VETOR E RECRIA\nVetor: (preencha o vetor sem repetir valores)");
		for (int i = 0; i < v.length; i++) {
			System.out.println("Informe valor para v[" + i + "]: ");
			v[i] = entrada.nextInt();
		}
		
		System.out.println("\nInforme um número qualquer para ser retirado do vetor criado: ");
		num = entrada.nextInt();
		for (int i = 0; i < v.length; i++) {
			if (v[i] == num)
				aux = i;
		}
		
		System.out.println("\nVetor novo: ");
		int v_novo[] = new int[19];
		for (int i = 0, g = 0; i <= v_novo.length; i++, g++) {
			if (i != aux) {
				v_novo[g] = v[i];
				System.out.print(v_novo[g] + " ");
			}
			else 
				g--;
		}
		
	}
}
