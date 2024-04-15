package ar.edu.unju.fi.ejercicio9.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio9.model.Producto;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		for (int i = 1; i<=3; i++) {
			//ingreso de datos
			Producto producto = new Producto();
			System.out.println("Ingrese el nombre del producto: ");
			String nombre = sc.next();
			System.out.println("Ingrese el codigo del producto: ");
			String codigo = sc.next();
			System.out.println("Ingrese el precio del producto: ");
			Float precio = sc.nextFloat();
			Integer descuento;
			//Verifiacion de intervalo
			do {
				System.out.println("Ingrese el descuento[0,50]%: ");
				descuento = sc.nextInt();
			}while(descuento>50 || descuento<0);
			
			//Setteo
			producto.setNombre(nombre);
			producto.setCodigo(codigo);
			producto.setPrecio(precio);
			producto.setDescuento(descuento);
			
			//MostrarDatos
			producto.mostrarDatos();
			
		}
		sc.close();
		
	}

}
