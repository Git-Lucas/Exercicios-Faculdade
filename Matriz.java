package matriz;
import java.util.Random;

public class Matriz {
	public static void main(String[] args) {
		int mat[][] = new int [3][4];
        Random random = new Random();
        
        System.out.println("SISTEMA QUE SUBSTITUI OS VALORES NEGATIVOS DE UMA MATRIZ POR 0\nMATRIZ CRIADA: ");
        for (int i = 0; i < 3; i++) {
        	System.out.println("");
        	for (int j = 0; j < 4; j++) {
        		mat[i][j] = -50 + random.nextInt(100);
        		System.out.print(mat[i][j] + " ");
        	}
        }
        
        System.out.println("\n\n\nMATRIZ COM OS VALORES NEGATIVOS SUBSTITUÍDOS POR 0: ");
        for (int i = 0; i < 3; i++) {
        	System.out.println("");
        	for (int j = 0; j < 4; j++) {
        		if (mat[i][j] < 0) {
        			mat[i][j] = 0;
        			System.out.print(mat[i][j] + " ");
        		}
        		else
        			System.out.print(mat[i][j] + " ");
        	}
        }
    }
}
