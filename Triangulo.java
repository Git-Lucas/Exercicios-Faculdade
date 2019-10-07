package triangulo;
import java.util.Scanner;

public class Triangulo {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		float lados[] = new float[3];
		
        System.out.println("SISTEMA QUE VALIDA E INFORMA O TIPO DO TRI�NGULO");
        
        while (true) {
        	int ocorrencias = 0;
        	System.out.println("Informe os lados do tri�ngulo: ");
        	for (int i = 0; i < 3; i++)
            	lados[i] = entrada.nextFloat();
        	
        	if (lados[0] > lados[1] + lados[2] || lados[1] > lados[0] + lados[2] || lados[2] > lados[0] + lados[1]){
            	System.out.println("\nTri�ngulo inv�lido!\n");
        		ocorrencias++;
            }
            
            for (int i = 0; i < 3; i++){
            	if (lados[i] == 0) {
            		System.out.println("\nTri�ngulo inv�lido!\n");
            		ocorrencias++;
            	}
            }
            
            if (ocorrencias == 0)
            	break;
        }
        
        if (lados[0] == lados[1] && lados[1] == lados[2])
        	System.out.println("\nO tri�ngulo � equil�tero.");
        else if (lados[0] == lados[1] || lados[0] == lados[2] || lados[1] == lados[2])
        	System.out.println("\nO tri�ngulo � is�sceles.");
        else
        	System.out.println("\nO tri�ngulo � escaleno.");
    }
}
