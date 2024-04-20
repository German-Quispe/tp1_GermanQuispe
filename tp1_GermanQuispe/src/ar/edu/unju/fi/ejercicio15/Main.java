package ar.edu.unju.fi.ejercicio15;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int indice;
		do {
			System.out.println("Ingrese un rango[5,10] para el Array: ");
			indice = sc.nextInt();
		}while (indice < 5 || indice > 10);
		
		String[] nombre = new String[indice];
		
		for (int i = 0; i<nombre.length;i++) {
			System.out.println("Ingrese un nombre de una persona: ");
			nombre[i] = sc.next();
		}
		System.out.println("----------------------------------------------");
		for (int i = 0; i<nombre.length;i++) {
			System.out.println("Elemento en la posicion "+i+" = "+nombre[i]);
		}
		//---Recorrido del Array de la ultima posicion a la primera---
		System.out.println("----------------------------------------------");
		for (int i = nombre.length-1; i>=0;i--) {
			System.out.println("Elemento en la posicion "+i+" = "+nombre[i]);
		}
		//-------------------------------------------------------------
		System.out.println("----------------------------------------------");
	}

}
