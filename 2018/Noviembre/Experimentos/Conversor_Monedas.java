package Experimentos;
import java.util.Scanner;
public class Conversor_Monedas {
	public static void main(String[] args) {
		
		float cantidad;
		float total = 0;
		System.out.println("Ingrese tipo de moneda: \n\n1. USD\n2. EUR\n");
		Scanner scanner = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		String inputString = scanner.nextLine();
		System.out.println("\nIngrese la cantidad en "+inputString+" para convertir a CLP:\n");
		cantidad = sc.nextFloat();
		if(inputString.equalsIgnoreCase("USD")){
			total = cantidad*688;
		System.out.println("\nLa conversión resultante es $"+total+".");
		}else if(inputString.equalsIgnoreCase("EUR")){
			total = cantidad*722.12f;
			System.out.println("\nLa conversión resultante es: $"+total+".");
		}
	}
}
