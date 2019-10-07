package vetorcaracteres;
import java.util.Scanner;

public class VetorCaracteres {
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		System.out.println("SISTEMA QUE GUARDA AS LETRAS DA PALAVRA EM UM VETOR E INVERTE\nInforme a palavra:");
		String palavra = entrada.next();
		char[] vetor_palavra = palavra.toCharArray();
		
		System.out.println("\nInverso da palavra: ");
		for (int i = vetor_palavra.length-1; i >= 0; i--) {
			System.out.print(vetor_palavra[i]);
		}
	}
}
