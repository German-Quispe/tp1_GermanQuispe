package ar.edu.unju.fi.ejercicio6.model;

import java.time.LocalDate;

public class Persona {
	private String dni;
	private String nombre;
	private LocalDate fechaDeNacimiento;
	private String provincia;
	private int edad;
	
	//***************Constructores*******************
	public Persona() {
		// TODO Auto-generated constructor stub
	}
	
	public Persona(String dni, String nombre, LocalDate fechaDeNacimiento, String provincia) {
		this.dni = dni;
		this.nombre = nombre;
		this.fechaDeNacimiento = fechaDeNacimiento;
		this.provincia = provincia;
	}
	
	public Persona(String dni, String nombre, LocalDate fechaDeNacimiento) {
		this.dni = dni;
		this.nombre = nombre;
		this.fechaDeNacimiento = fechaDeNacimiento;
		this.provincia = "Jujuy";
	}
	//------------------------------------------------

	//***************Metodos*******************
	public int calcularEdad (LocalDate fechaDeNacimiento) {
		LocalDate fechaActual = LocalDate.now();
		int edad;
		int cant = fechaActual.getDayOfYear()-fechaDeNacimiento.getDayOfYear();
		if (cant>0) {
			edad = fechaActual.getYear()-fechaDeNacimiento.getYear();
		}else {
			edad = (fechaActual.getYear()-fechaDeNacimiento.getYear())-1;
		}
		return edad;
	}
	
	public boolean mayorMenor(int edad) {
		
		if (edad>18) {
			return true;
		}else {
			return false;
		}
	}
	
	public void mostrarDatos() {
		System.out.println("-----------Datos de la persona-----------");
		System.out.println("Dni: "+this.dni);
		System.out.println("Nombre: "+this.nombre);
		System.out.println("Fecha de nacimiento: "+this.fechaDeNacimiento);
		System.out.println("Provincia: "+this.provincia);
		System.out.println("Edad: "+this.calcularEdad(fechaDeNacimiento));
		if (this.mayorMenor(edad)) {
			System.out.println("La persona no es mayor de edad");
		}else {
			System.out.println("La persona es mayor de edad");
		}
		System.out.println("------------------------------------------");
		
	}
	//------------------------------------------------

	//***************getters y setters*******************

	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public LocalDate getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}
	public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	
	//------------------------------------------------

	
}
