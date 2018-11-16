package Experimentos;
import java.util.Scanner;
public class Radio_Area_Circunferencia {
	    public static void main(String[] args) {     
	           Scanner sc = new Scanner(System.in);  //crear un objeto Scanner
	           String nombre;
	           double radio;
	           int n;
	           System.out.print("Introduzca su nombre: ");       
	           nombre = sc.nextLine();  //leer un String
	           System.out.println("Hola " + nombre + ".");
	           System.out.print("Introduzca el radio de la circunferencia: ");
	           radio = sc.nextDouble(); //leer un double
	           System.out.println("El área de la circunferencia es: " + radio*Math.PI*radio);
	     }
	}

