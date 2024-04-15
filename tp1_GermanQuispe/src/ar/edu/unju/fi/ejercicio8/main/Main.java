package ar.edu.unju.fi.ejercicio8.main;

import ar.edu.unju.fi.ejercicio8.model.CalculadoraEspecial;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		//-----------Constructores--------------
		Scanner sc = new Scanner(System.in);
		CalculadoraEspecial calculadoraEspecial = new CalculadoraEspecial();
		//--------------------------------------
		
		//----------Intanciar el valor n--------
		System.out.println("Ingrese el valor n: ");
		int n = sc.nextInt();
		//--------------------------------------
		
		//-------Invocacion de los metodos------
		calculadoraEspecial.calcularSumatoria(n);
		calculadoraEspecial.calcularProductorial(n);
		//--------------------------------------
	}

}
