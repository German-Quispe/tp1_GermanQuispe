package ar.edu.unju.fi.ejercicio6.main;
import ar.edu.unju.fi.ejercicio6.model.Persona;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//----------------------Persona1----------------------
		//---------------Contructor por Defecto---------------
		Persona persona = new Persona();
		
		
		System.out.println("Ingrese DNI: ");
		String dni = sc.nextLine(); 
		System.out.println("Ingrese Nombre: ");
		String nombre = sc.nextLine();
		System.out.println("Ingrese fecha de naciomiento(yyyy-mm-dd): ");
		String fechaEnString =sc.next();
		
		DateTimeFormatter format = new DateTimeFormatterBuilder().append(DateTimeFormatter.ofPattern("yyyy-MM-dd")).toFormatter(); 
		LocalDate fechaNacimiento = LocalDate.parse(fechaEnString, format); 
		
		System.out.println("Ingrese provincia: ");
		String provincia = sc.next();
		
		
		persona.setDni(dni);
		persona.setNombre(nombre);
		persona.setFechaDeNacimiento(fechaNacimiento);
		persona.setProvincia(provincia);
		
		persona.mostrarDatos();
		//----------------------------------------------------
		
		//----------------------Persona2----------------------
		//Contructor parametrizado(DNI,Nombre,FechaDeNac,Privincia)
		
		
		
		System.out.println("Ingrese DNI: ");
		String dni2 = sc.nextLine();
		System.out.println("Ingrese Nombre: ");
		String nombre2 = sc.nextLine();
		System.out.println("Ingrese fecha de naciomiento(yyyy-mm-dd): ");
		String fechaEnString2 =sc.next();
		
		DateTimeFormatter format2 = new DateTimeFormatterBuilder().append(DateTimeFormatter.ofPattern("yyyy-MM-dd")).toFormatter(); 
		LocalDate fechaNacimiento2 = LocalDate.parse(fechaEnString2, format2);
		
		System.out.println("Ingrese provincia: ");
		String provincia2 = sc.next();
		
	
		Persona persona2 = new Persona(dni2,nombre2, fechaNacimiento2, provincia2);
		
	
		persona2.mostrarDatos();
		//----------------------------------------------------
		
		//----------------------Persona3----------------------
		//Contructor parametrizado(DNI,Nombre,FechaDeNac)
	
		
		System.out.println("Ingrese DNI: ");
		String dni3 = sc.nextLine();
		System.out.println("Ingrese Nombre: ");
		String nombre3 = sc.nextLine();
		System.out.println("Ingrese fecha de naciomiento(yyyy-mm-dd): ");
		String fechaEnString3 =sc.next();
		DateTimeFormatter format3 = new DateTimeFormatterBuilder().append(DateTimeFormatter.ofPattern("yyyy-MM-dd")).toFormatter(); 
		LocalDate fechaNacimiento3 = LocalDate.parse(fechaEnString3, format3); 
		
	
		Persona persona3 = new Persona(dni3,nombre3, fechaNacimiento3);
		
		
		persona3.mostrarDatos();
		//----------------------------------------------------
		sc.close();
	}

}
