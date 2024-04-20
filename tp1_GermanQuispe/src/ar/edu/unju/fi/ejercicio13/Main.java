package ar.edu.unju.fi.ejercicio13;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//------Creamos un array de tipo int---------
		int[] num = new int[8];
		//-------------------------------------------
		Scanner sc = new Scanner(System.in);
		//-----------Recorrido del Array--------------
		for (int i = 0; i<num.length;i++) {
			System.out.println("Ingrese un numero entero: ");
			num[i] = sc.nextInt();
		}
		//--------------------------------------------
		//--------Mostramos los datos del Array-------
		System.out.println("--------------------------------");
		for (int i = 0; i<num.length;i++) {
			System.out.println("Elemento en la posicion "+i+" = "+num[i]);
		}
		System.out.println("--------------------------------");
		//--------------------------------------------
		sc.close();
	}

}
