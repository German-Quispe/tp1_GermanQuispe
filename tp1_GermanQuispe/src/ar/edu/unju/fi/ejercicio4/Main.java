package ar.edu.unju.fi.ejercicio4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int num;
		int cont;
		int factorial = 1;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese un numero entero entre 1 y 10: ");
		num = sc.nextInt();
		
		//uso de la estructura condicional para corroborar el intervalo
		if (num >=0 && num <= 10) {
			
			cont = 1;
			while (cont <= num ) { //Uso de la estructura interativa
				
				factorial = factorial * cont;
				cont++;
				
			}
			
			System.out.println("El factorial de " + num + " es: " + factorial);
			
		}else {
				
				System.out.println("No se respeto el intervalo de numero");
			
		}
		
		sc.close();
	}

}
