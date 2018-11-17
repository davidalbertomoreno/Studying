package Experimentos;
import java.util.Scanner;
public class Calculadora_Cuadrática {
    public static void main(String[] args) {
    	
double x;
System.out.println("Bienvenido a la calculadora de ecuaciones cuadráticas.\n");
System.out.println("Las ecuaciones de segundo grado tienen la forma: ax^2 + bx + c = 0 (donde 'a' es distinto de 0).\n");
System.out.println("Ingrese el primer valor (a) de su ecuación cuadrática:\n" );
Scanner a = new Scanner(System.in);
double inputDouble1 = a.nextDouble();
System.out.println("\nIngrese el segundo valor (b) de su ecuación de segundo grado:\n");
Scanner b = new Scanner(System.in);
double inputDouble2 = b.nextDouble();
System.out.println("\nIngrese el tercer valor (c, valor libre) de su ecuación de segundo grado:\n");
Scanner c = new Scanner(System.in);
double inputDouble3 = c.nextDouble();
math.sqrt(b*b-4*a*c);
System.out.println(+discriminante);

//Discriminante: math.sqrt(b*b - 4*a*c)
	}

}
