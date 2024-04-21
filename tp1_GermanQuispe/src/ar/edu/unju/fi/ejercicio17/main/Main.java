package ar.edu.unju.fi.ejercicio17.main;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio17.model.Jugador;

public class Main {
	
	private static Scanner sc;
	private static List <Jugador> jugadores; 
	private static Iterator <Jugador> iteradorJugadores;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		precargarJugador();
		int opc;
		do {
			menu();
			opc = sc.nextInt();
			try {	
				switch (opc) {
					case 1: {
						agregarJugador();
						break;
					}
					case 2:
						mostrarJugador();
						break;
					case 3:
						mostrarOrdenado();
						
						break;
					case 4:
						modificarDatos();
						break;
					case 5:
						elimnarJugador();
						break;
					case 6:
						mostrarCantidadJugadores();
						break;
					case 7:
						jugadoresPorNacionalidad();
						break;
					case 8:
						System.out.println("Fin del programa");
						break;
					default:
						System.out.println("Ingrese una opcion dentro de los paremetros");
						break;
				}
			}catch (Exception e) {
				System.out.println("Ingreso no valido....");
				
			}
		}while (opc!=8);
		sc.close();

	}
	
	/**
	 * Metodo jugadoresPorNacionalidad
	 * filtra los jugadores por nacionalidad
	 * y luego los cuenta. 
	 */
	public static void jugadoresPorNacionalidad() {
		long cant=0;
		System.out.println("--------------------------------------------------------");
		System.out.println("Ingrese la nacionalidad para determinar la cantidad: ");
		String nacionalidad=sc.next();
		cant= jugadores.stream().filter(fi -> fi.getNacionalidad().equals(nacionalidad)).count();;
		System.out.println("Jugador/es "+nacionalidad+"/s: "+cant);
	}
	
	/**
	 * Metodo mostrarCantidadJugadores
	 */
	public static void mostrarCantidadJugadores() {
		
		System.out.println("El tamaño del Array es: "+jugadores.size());
	}
	/**
	 * Metodo elimanarJugador
	 * elimina un jugador por nombre y apellido
	 */
	public static void elimnarJugador() {
		iteradorJugadores = jugadores.iterator();
		Jugador value=buscarJugador();
		while(iteradorJugadores.hasNext()) {
			Jugador j = iteradorJugadores.next();
			if(j == value) {
				iteradorJugadores.remove();
				System.out.println("Se elimino a: "+j);
			}
		}
		if(value==null) {
			System.out.println("No se registro un jugador con ese nombre y apellido..");
		}
	}
	
	/**
	 * Metodo modificarDatos
	 * Valida y llama un metodo para mostrar
	 */
	public static void modificarDatos() {
		Jugador value=buscarJugador();
		for(Jugador jugador:jugadores){
			if(jugador == value) {
				System.out.println("---------------Modificar datos----------------");
				System.out.print("Modifique nombre: ");
				jugador.setNombre(sc.next());
				System.out.print("Modifique apellido: ");
				jugador.setApellido(sc.next());
				System.out.print("Modofique fecha de nacimiento(yyyy/MM/dd): ");
				jugador.setFechaDeNacimiento(valFecha());
				System.out.print("Modifique nacionalidad: ");
				jugador.setNacionalidad(sc.next());
				System.out.print("Modifique estatura: ");
				jugador.setEstatura(valFloat());
				System.out.print("Modifique peso: ");
				jugador.setPeso(valFloat());
				System.out.print("Modifique posicion(delantero,medio,defensa o arquero): ");
				jugador.setPosicion(valPosicion());
			}
		}
		if(value==null) {
			System.out.println("No se registro un jugador con ese nombre y apellido..");
		}
		System.out.println("---------------------------------------------");
		
	}
	
	/**
	 * metodo mostrarOrdenado
	 * muestra las listas ordenas por apellida
	 */
	public static void mostrarOrdenado() {
		jugadores.sort(Comparator.comparing(Jugador::getApellido));
		jugadores.forEach(jug -> System.out.println(jug));
	}
	
	/**
	 * Metodo buscar jugador
	 * buscarun jugador por nombre y apellido
	 */
	public static Jugador buscarJugador() {
		System.out.print("Ingrese el nombre del jugador: ");
		String nom = sc.next();
		System.out.print("Ingrese el apellido del jugador: ");
		String ape= sc.next();
		Jugador jugadorEncontrado = null;
		for(Jugador jugador:jugadores) {
			if (jugador.getNombre().equals(nom) && jugador.getApellido().equals(ape)) {
				jugadorEncontrado = jugador;
			}
		}
		return jugadorEncontrado;
	}
	
	/**
	 * Metodo mostrarJugador()
	 * mediante la buscqueda del jugador muestra
	 * por pantalla sus daots
	 */
	public static void mostrarJugador() {
		Jugador value=buscarJugador();
		for(Jugador jugador:jugadores){
			if(jugador == value) {
				System.out.println("Nombre y apellido: "+jugador.getNombre()+" "+jugador.getApellido());
				System.out.println("Edad: "+jugador.calcularEdad()+" años");
				System.out.println("Nacionalidad: "+jugador.getNacionalidad());
				System.out.println("Estatura: "+jugador.getEstatura()+" m.");
				System.out.println("Peso: "+jugador.getPeso()+" kg");
			}
		}
		if(value==null) {
			System.out.println("No se registro un jugador con ese nombre y apellido..");
		}
	}
	/**
	 * Metodo valPosicion
	 * valida si la encatrada de 
	 * posicion es correcta
	 * @return posicion
	 */
	public static String valPosicion() {
		String val = null;
		String s = null;
		String[] posiciones= {"delantero","medio","defensa","arquero"};
		do {
			s =sc.next();
			
			for(int i = 0; i<posiciones.length;i++) {
				if(s.equals(posiciones[i])) {
					val = posiciones[i];
				}
			}
			if(val==null) {
				System.out.println("No se ingreso una posicion correcta...");
				System.out.println("Ingrese nuevamente: ");
			}
			
		}while(val==null);
		return val;
		
	}
	
	/**
	 * metodo valFloat
	 * Valida la entrada de datos tipo Float
	 * @return dato de tipo float
	 */
	public static Float valFloat() {
		Float s = null;
		do{
			try {
				s=Float.parseFloat(sc.next());
				
			}catch (Exception e) {
				System.out.println("se ingreso datos invalidos...!!");
				System.out.println("Ingrese nuevamente: ");
			}
		}while(s==null);
		return s;
		
	}
	
	/**
	 * Valida el ingreso de la fecha nacimiento
	 * @return devuelve la fecha asignada correctamente
	 */
	public static LocalDate valFecha() {
		LocalDate s=null;
		do {
			try {
				s =LocalDate.parse(sc.next());
			}catch (Exception e) {
				System.out.println("se ingreso datos invalidos a fecha...!!");
				System.out.println("Ingrese nuevamente: ");
			}
		}while(s==null);
		return  s;
	}
	/**
	 * Metodo agregar nuevos jugadores
	 * agrega nuevos jugadores al arrayList
	 */
	public static void agregarJugador() {
		
		System.out.println("=========================================================");
		System.out.println("Ingrese nombre del Jugador: ");
		String nombre = sc.next();
		
		System.out.println("Ingrese apellido del Jugador: ");
		String apellido = sc.next();
		System.out.println("Ingrese fecha de nacimiento del Jugador(yyyy-MM-dd): ");
		LocalDate fechaNacimiento =valFecha();
		System.out.println("Ingrese nacionalidad del jugador: ");
		String nacionalidad = sc.next();
		System.out.println("Ingrese estatura del Jugador(m): ");
		Float estatura = valFloat();
		System.out.println("Ingrese peso del Jugador(kg): ");
		Float peso = valFloat();
		
		System.out.println("Ingrese posicion del jugador(delantero,medio,defensa o arquero):");
		String posicion = valPosicion();
		System.out.println("=========================================================");
		jugadores.add(new Jugador(nombre, apellido, fechaNacimiento, nacionalidad, estatura, peso, posicion));
		//jugadores.add(new Jugador(null,apellido,null,null,null,null,posicion));
		
	}
	/**
	 * Se muestra el menu con todas las opciones permitidas
	 */
	public static void menu() {
			System.out.println("-----------------------Menu--------------------------");
			System.out.println("1 - Alta jugador ");
			System.out.println("2 - Mostrar datos del jugadores ");
			System.out.println("3 - Mostrar jugadores ordenados por apellido ");
			System.out.println("4 - Modificar los datos de un jugador");
			System.out.println("5 - Eliminar un jugador");
			System.out.println("6 - Mostrar cantidad de jugadores");
			System.out.println("7 - Mostrar cantidad de jugadores segun su nacional:");
			System.out.println("8 - Salir");
			System.out.println("-----------------------------------------------------");
			System.out.print("Ingrese opcion: ");
	}
	
	/**
	 * Se precarga el arrayList
	 */
	public static void precargarJugador() {
		if (jugadores == null) {
			jugadores = new ArrayList<>();
			agregarJugador();
		}
		
	}
}
