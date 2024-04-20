package ar.edu.unju.fi.ejercicio12.model;

import java.util.Calendar;

public class Persona {

		private String nombre;
		private Calendar fechaNacimiento;
		
		
		
		public Persona(String nombre, Calendar fechaNacimiento) {
			super();
			this.nombre = nombre;
			this.fechaNacimiento = fechaNacimiento;
		}

		
		public void mostrarDatos () {
			
			System.out.println("--------------------------------------");
			System.out.println("Nombre: "+nombre);
			System.out.println("Fecha de nacimiento: "+fechaNacimiento.get(Calendar.DAY_OF_MONTH)+"/"+fechaNacimiento.get(Calendar.MONTH)+"/"+fechaNacimiento.get(Calendar.YEAR));
			System.out.println("Edad: "+edad()+" años");
			System.out.println("Signo del zodiaco: "+signoZodical());
			System.out.println("--------------------------------------");
			
		}

		public int edad () {
			
			Calendar hoy = Calendar.getInstance();
			
			long miliSegundo = hoy.getTimeInMillis() - fechaNacimiento.getTimeInMillis();
			int edad =  (int) (miliSegundo/1000/60/60/24/365.25);
			return edad;
		}
		
		public String signoZodical(){
			String signo = null;
			int dia = fechaNacimiento.get(Calendar.DAY_OF_MONTH);
			int mes = fechaNacimiento.get(Calendar.MONTH);
			
			switch (mes) {
				case 1: 
					if(dia >= 21 ) {
						signo = "Acuario";
					}else {
						signo = "Capricornio";
					}
					break;
				case 2:
					if (dia >= 19) {
						signo = "Piscis";
					}else {
						signo = "Acuario";
					}
					break;
				case 3:
					if (dia >=20) {
						signo = "Aries";
					}else {
						signo = "Piscis";
					}
					break;
				case 4:
					if (dia >= 20) {
						signo = "Tauro";
					}else {
						signo = "Aries";
					}
				case 5:
					if (dia >= 21) {
						signo = "Geminis";
					}else {
						signo = "Tauro";
					}
					break;
				case 6:
					if (dia >= 20 ) {
						signo = "Cancer";
					}else {
						signo = "Geminis";
					}
					break;
				case 7:
					if (dia >= 22) {
						signo = "Leo";
					}else {
						signo = "Cancer";
					}
					break;
				case 8:
					if (dia >= 21) {
						signo = "Virgo";
					}else {
						signo = "Leo";
					}
					break;
				case 9:
					if (dia >= 22) {
						signo = "Libra";
					}else {
						signo = "Virgo";
					}
					break;
				case 10:
					if (dia >= 22) {
						signo = "Escorpion";
					}else {
						signo = "Libra";
					}
					break;
				case 11:
					if (dia >= 21) {
						signo = "Sagitario";
					}else {
						signo = "Escorpion";
					}
					break;
				case 12:
					if (dia >= 21) {
						signo = "Capricornio";
					}else {
						signo = "Sagitario";
					}	
					break;
			}
			return signo;
		}
		
		
		public String estacionAnio() {
			
			String estacion = null;
			int dia = fechaNacimiento.get(Calendar.DAY_OF_MONTH);
			int mes = fechaNacimiento.get(Calendar.MONTH);
			switch (mes) {
				case 1,2: 
					estacion = "Verano";
					break;
				case 3:
					if (dia >= 21) {
						estacion = "Otonio";
					}else {
						estacion = "Verano";
					}
					break;
				case 4,5:
					estacion = "Otonio";
					break;
				case 6:
					if (dia >= 21) {
						estacion = "Invierno";
					}else {
						estacion = "Otonio";
					}
					break;
				case 7,8:
					estacion = "Invierno";
					break;
				case 9:
					if (dia >= 21) {
						estacion = "Primavera";
					}else {
						estacion = "Invierno";
					}
					break;
				case 10,11:
					estacion = "Primavera";
					break;
				case 12:
					if (dia >= 21) {
						estacion = "Verano";
					}else {
						estacion = "Primavera";
					}
					break;
			}
			return estacion;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public Calendar getFechaNacimiento() {
			return fechaNacimiento;
		}

		public void setFechaNacimiento(Calendar fechaNacimiento) {
			this.fechaNacimiento = fechaNacimiento;
		}		
}
