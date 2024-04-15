package ar.edu.unju.fi.ejercicio8.model;


public class CalculadoraEspecial {
	private int n;
	
	public CalculadoraEspecial() {
		// TODO Auto-generated constructor stub
	}
	
	//-----------------Metodos--------------------
	public void calcularSumatoria(int n) {
		int resultado = 0;
		for (int k=1;k<=n;k++) {
			resultado = (int) (resultado + Math.pow((k*(k+1))/2, 2));
		}
		System.out.println("Resultado de la sumatoria: "+resultado);
	}

	public void calcularProductorial(int n) {
		int resultado = 1;
		for (int k=1;k<=n;k++) {
			resultado = resultado * k*(k+4);
		}
		System.out.println("Resultado de la productoria: "+resultado);
	}
	//--------------------------------------------
	
	//-------------Metodos accesores--------------
	public Integer getN() {
		return n;
	}

	public void setN(Integer n) {
		this.n = n;
	}
	//--------------------------------------------
	
}
