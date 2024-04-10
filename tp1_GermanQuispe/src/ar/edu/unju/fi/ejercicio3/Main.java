package ar.edu.unju.fi.ejercicio3;

//importacion de scanner
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//declaracion de variables
		int num;
		
		// Intanciamos un objeto de tipo scanner
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese un numero entero al azar: ");
		num = sc.nextInt(); //Uso del metodo nextInt para cargar la entrada de un numero entero
		
		//Uso de la estructura de control condicional
		if (num % 2 != 0) {
			System.out.println(num * 2); //si es impar
		}else{
			System.out.println(num * 3); //si es par
		}
		//cierre del scanner
		sc.close();
	}

}
