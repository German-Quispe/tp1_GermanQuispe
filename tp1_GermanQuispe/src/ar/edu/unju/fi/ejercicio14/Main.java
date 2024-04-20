package ar.edu.unju.fi.ejercicio14;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//------------variables utilizadas----------------
		int indice;
		int suma = 0;
		//------------------------------------------------
		//-------Validacion del rango para el Array-------
		do {
			System.out.println("Ingrese un rango[3,10] para el Array: ");
			indice = sc.nextInt();
		}while (indice < 3 || indice > 10);
		//------------------------------------------------
		//--------------Inicializo el Array---------------
		int[] num = new int[indice];
		//------------------------------------------------
		//-------------Ingreseo de datos------------------
		for (int i = 0; i<num.length;i++) {
			System.out.println("Ingrese un numero entero: ");
			num[i] = sc.nextInt();
		}
		//------------------------------------------------
		//---Muestro el Array y La suma de sus Elementos---
		System.out.println("--------------------------------");
		for (int i = 0; i<num.length;i++) {
			System.out.println("Elemento en la posicion "+i+" = "+num[i]);
			suma += num[i];//suma de elementos
		}
		System.out.println("La suma de sus elementos es :"+suma);
		System.out.println("--------------------------------");
		//-------------------------------------------------
		sc.close();
	
	}

}
