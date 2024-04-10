package ar.edu.unju.fi.ejercicio5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int num;
		int multiplicacion;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese un numero entero entre 1 y 9: ");
		num = sc.nextInt();
		
		if (num >=1 && num <=9) {
			//uso de la estructura de control interativa for
			for (int i = 0; i <= 10; i++) {
				multiplicacion = num * i;
				System.out.println(num + " x " + i + " = " + multiplicacion);
			}
			
		}else {
			System.out.println("No se respeto el intervalo permitido");
		}
		sc.close();
	}

}