package ar.edu.unju.fi.ejercicio12.main;

import java.util.Calendar;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio12.model.Persona;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese nombre:");
		String nombre = sc.nextLine();
		System.out.println("Ingrese fecha de naciomiento:");
		System.out.println("Año(yyyy): ");
		int anio = sc.nextInt();
		System.out.println("Mes(MM): ");
		int mes = sc.nextInt();
		System.out.println("Dia(dd): ");
		int dia = sc.nextInt();

		Calendar fechaNacimiento = Calendar.getInstance();
		fechaNacimiento.set(anio, mes, dia);
		
		Persona persona = new Persona(nombre, fechaNacimiento);
		
		persona.mostrarDatos();
		
	}

}
