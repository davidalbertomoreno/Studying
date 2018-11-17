package Experimentos;

public class Contador_Cifras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		int n=783;
		while(n>=1){
		 n=n/10;
		 count=count+1;}
		System.out.println("El número de cifras es: "+count);
	}

}