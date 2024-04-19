package ar.edu.unju.fi.ejercicio7.model;

public class Empleado {
	
	private String nombre;
	private Integer legajo;
	private Float salario;
	
	//------------Constantes--------------
	private final int SALARIOMINIMO = 210000; 
	private final int AUMENTOPORMERITO = 20000;
	//-------------------------------------
	
	//-------Constructor Parametrizado------
	public Empleado(String nombre, Integer legajo, Float salario) {
		this.nombre = nombre;
		this.legajo = legajo;
		if (salario >= SALARIOMINIMO) {
			this.salario = salario;
		}else{
			this.salario = (float) SALARIOMINIMO;
		}
	}
	//--------------------------------------
	
	//--------------Metodos-----------------
	public float aumento(Float salario, int cant) {
		this.salario = (float) (this.salario + (AUMENTOPORMERITO*cant));
		return this.salario;
	}
	
	public void mostrarDatosEmpleado() {
		System.out.println("Nombre del empleado: "+nombre);
		System.out.println("Legajo: "+legajo);
		System.out.println("Salario $: "+salario);
	}
	//--------------------------------------
}
