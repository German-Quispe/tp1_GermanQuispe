package ar.edu.unju.fi.ejercicio16;


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//----------Declaracion de el Array tipo String----------
		String[] nombre = new String[5];
		//-------------------------------------------------------
		
		int pos = 0;
		byte indice;

		//----------Bucle para el ingreso de los nombres---------
		for (int i = 0; i < nombre.length; i++) {
			System.out.println("Ingrese nombre de una persona: ");
			nombre[i] = sc.next();
		}
		//-------------------------------------------------------
		
		//----Implementacion del While para mostrar los datos----
		while (pos<nombre.length) {
			System.out.println("Elemento guardado en la posicion "+pos+" es: "+nombre[pos]);
			pos++;
		}
		//-------------------------------------------------------
		
		System.out.println("El tamaño del Array es: "+nombre.length);//mostrar tamaño del array
		
		//--------------Validacion para el rango---------------- 
		do {
			System.out.println("Ingrese la posicion del Array[0,4] que desea eliminar: ");
			indice = sc.nextByte();
		}while(indice > 4 || indice < 0);
		//-------------------------------------------------------
		
		//---Eliminacion del elemento en la posicion indicada----
		//------y desplazamiento de los otros elementos----------
		for (int i = indice ; i<nombre.length;i++) {
			if(i+1<nombre.length) {
				nombre[i] = nombre[i+1];
			}else {
				nombre[i]= "      ";
			}
		}
		//-------------------------------------------------------
		//-----------Muestra los datos modificados--------------
		System.out.println("---------------------------------------------");
		for (int i = 0; i<nombre.length;i++) {
			System.out.print("| "+nombre[i]+" ");
		}
		System.out.print("|");
		//-------------------------------------------------------
		
		sc.close();
	}

}
