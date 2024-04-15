package ar.edu.unju.fi.ejercicio7.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio7.model.Empleado;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//------------Ingresos de datos-----------------
		System.out.println("Ingrese el nombre del empleado");
		String nombre = sc.nextLine();
		System.out.println("Ingrese Nro de legajo: ");
		Integer legajo = sc.nextInt();
		System.out.println("Ingrese sueldo a cobrar: ");
		Float salario = sc.nextFloat();
		//----------------------------------------------
		
		Empleado empleado = new Empleado(nombre, legajo, salario);
		
		//------------Muestra los datos-----------------
		System.out.println();
		empleado.mostrarDatosEmpleado();
		//----------------------------------------------
		
		//------Verificar meritos y mostrar datos-------
		System.out.println();
		System.out.println("Ingrese la cant. de meritos del empleado: ");
		int cant = sc.nextInt();
		empleado.aumento(salario,cant);
		System.out.println();
		empleado.mostrarDatosEmpleado();
		//----------------------------------------------
		
		sc.close();
	}

}
