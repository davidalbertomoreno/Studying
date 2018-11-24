package Experimentos;
import java.util.Scanner;
public class Conversor_Monedas {
	private static Scanner sc;
	public static void main(String[] args) {
		
		float Cantidad;
		float Total = 0;
		System.out.println("Ingrese divisa: \n\n1. USD\n2. EUR\n");
		sc = new Scanner(System.in);
		String Divisa = sc.nextLine();
		System.out.println("\nIngrese cantidad en "+Divisa+" para su conversión en pesos chilenos:\n");
		Cantidad = sc.nextFloat();
		if(Divisa.equalsIgnoreCase("USD")){
			Total = Cantidad*675;
		System.out.println("\nSu conversión a CLP resultante es: $"+Total+" pesos chilenos.");
		}else if(Divisa.equalsIgnoreCase("EUR")){
			Total = Cantidad*765;
			System.out.println("\nSu conversión a CLP resultante es: $"+Total+" pesos chilenos.");
		}
	}
}
