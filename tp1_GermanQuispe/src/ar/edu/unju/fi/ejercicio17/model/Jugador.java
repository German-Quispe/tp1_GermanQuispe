package ar.edu.unju.fi.ejercicio17.model;

import java.time.LocalDate;
import java.time.Period;

public class Jugador {
	
		private String nombre;
		private String apellido;
		private LocalDate fechaDeNacimiento;
		private String nacionalidad;
		private Float estatura;
		private Float peso;
		private String posicion;
		
		
		public Jugador(String nombre, String apellido, LocalDate fechaDeNacimiento, String nacionalidad, Float estatura,
				Float peso, String posicion) {
			super();
			this.nombre = nombre;
			this.apellido = apellido;
			this.fechaDeNacimiento = fechaDeNacimiento;
			this.nacionalidad = nacionalidad;
			this.estatura = estatura;
			this.peso = peso;
			this.posicion = posicion;
		}


		@Override
		public String toString() {
			return "Jugador [Nombre = " + nombre + ", Apellido = " + apellido + ", Fecha de Nacimiento = " + fechaDeNacimiento
					+ ", Nacionalidad = " + nacionalidad + ", Estatura = " + estatura + ", Peso = " + peso + ", Posicion = "
					+ posicion + "]";
		}


		public int calcularEdad() {
			LocalDate fechaActual = LocalDate.now();
			Period periodo = Period.between(fechaDeNacimiento, fechaActual);
			return periodo.getYears();
		}


		public String getNombre() {
			return nombre;
		}


		public void setNombre(String nombre) {
			this.nombre = nombre;
		}


		public String getApellido() {
			return apellido;
		}


		public void setApellido(String apellido) {
			this.apellido = apellido;
		}


		public LocalDate getFechaDeNacimiento() {
			return fechaDeNacimiento;
		}


		public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
			this.fechaDeNacimiento = fechaDeNacimiento;
		}


		public String getNacionalidad() {
			return nacionalidad;
		}


		public void setNacionalidad(String nacionalidad) {
			this.nacionalidad = nacionalidad;
		}


		public Float getEstatura() {
			return estatura;
		}


		public void setEstatura(Float estatura) {
			this.estatura = estatura;
		}


		public Float getPeso() {
			return peso;
		}


		public void setPeso(Float peso) {
			this.peso = peso;
		}


		public String getPosicion() {
			return posicion;
		}


		public void setPosicion(String posicion) {
			this.posicion = posicion;
		}
		
		
}
