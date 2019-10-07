package temperaturacelsius;
import java.util.Scanner;

public class TemperaturaCelsius {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int menu;
		float temperatura;
		System.out.println("SISTEMA DE CONVERSÃO DE TEMPERATURA (°C / °F)\nInforme:\n(1) °C -> °F\n(2) °F -> °C");
		menu = entrada.nextInt();
		
		switch(menu) {
			case 1:
				System.out.println("\nInforme a temperatura em Celsius: ");
				temperatura = entrada.nextFloat();
				temperatura = (temperatura * 9/5) + 32;
				
				System.out.println("\nTemperatura em Fahrenheit: " + temperatura + "°F");
				break;
			case 2:
				System.out.println("\nInforme a temperatura em Fahrenheit: ");
				temperatura = entrada.nextFloat();
				temperatura = (temperatura - 32) * 5/9;
				
				System.out.println("\nTemperatura em Celsius: " + temperatura + "°C");
				break;
			default:
				System.out.println("\nInforme um valor válido para o menu: (1) ou (2)");
		}
		
	}
}
