package Experimentos;
import java.util.Scanner;
public class Calculadora {

	public static void main(String[] args) {
	
		float a;
		float b;
		float c=0;
		float d;
		String z;
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		Scanner sc3 = new Scanner(System.in);
		System.out.println("Bienvenido a la calculadora de operaciones básicas.\n\nIngrese la primera cifra:\n");
		a = sc1.nextFloat();
		System.out.println("\nIngrese la segunda cifra:\n");
		b = sc2.nextFloat();
		System.out.println("\nIngrese la operación (+, -, x, /, P, R; donde P y R equivalen a potencia y raíz, respectivamente):\n");
		z = sc3.nextLine();
		switch(z) {
				case "+":
					c = a+b;
					System.out.println("\nEl resultado de su operación es:\n\n"+c+".");
				break;
				case "-":
					c = a-b;
					System.out.println("\nEl resultado de su operación es:\n\n"+c+".");
				break;
				case "x":
					while (b > 0) {
						c = c+a;
						b = b-1;
					}
					while (b < 0) {
						c = c+a;
						b = b+1;
					}	
					System.out.println("\nEl resultado de su operación es:\n\n"+c+".");
				break;
				case "/":
					while (b != 0) {
						c = c+a;
						b = b-1;
					}
					System.out.println("\nEl resultado de su operación es:\n\n"+c+".");
				break;
				
		}
		
	}

}
