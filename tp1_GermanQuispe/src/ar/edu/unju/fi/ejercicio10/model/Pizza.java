package ar.edu.unju.fi.ejercicio10.model;

public class Pizza {
	private Integer diametro;
	private Integer precio;
	private Double area;
	private Boolean ingredientesEspeciales;
	
	//----------Constantes---------------
	final int adicionarIngrediente20 = 500;
	final int adicionarIngrediente30 = 750;
	final int adicionarIngrediente40 = 1000;
	//-------------------------------------------
	//----------Constructos por Defecto-----------
	public Pizza() {
		// TODO Auto-generated constructor stub
	}
	//--------------------------------------------
	//------------Metodo Mostrar Datos-------------
	public void mostrarDatos() {
		System.out.println();
		System.out.println("-----------Pizza----------");
		System.out.println("Diametro: "+this.diametro);
		System.out.println("Ingrediente especiales: "+this.ingredientesEspeciales);
		System.out.println("Precio de la pizza: "+calcularPrecio());
		System.out.println("Area de la pizza: "+calcularArea());
		System.out.println("--------------------------");
		System.out.println();
	}
	//---------------------------------------------
	//-------Metodos Calcular Area y Precio--------
	public Double calcularArea() {
		area =  (Math.PI*Math.pow(diametro/2, 2));
		return area;
	}
	
	public int calcularPrecio() {
		switch (diametro) {
			case 20:
				if(ingredientesEspeciales==true) {
					precio = 4500+adicionarIngrediente20;
				}else {
					precio = 4500;
				}
				break;
			case 30:
				if(ingredientesEspeciales==true) {
					precio = 4800+adicionarIngrediente30;
				}else {
					precio = 4800;
				}
				break;
			case 40:
				if(ingredientesEspeciales==true) {
					precio = 5500+adicionarIngrediente40;
				}else {
					precio = 5500;
				}
				break;
		
			default:
				break;
			}
		return precio;
	}
	//----------------------------------------------
	//-------------Getters y Setters----------------
	public Integer getDiametro() {
		return diametro;
	}
	public void setDiametro(Integer diametro) {
		this.diametro = diametro;
	}
	public Integer getPrecio() {
		return precio;
	}
	public void setPrecio(Integer precio) {
		this.precio = precio;
	}
	public Double getArea() {
		return area;
	}
	public void setArea(Double area) {
		this.area = area;
	}
	public Boolean getIngredientesEspeciales() {
		return ingredientesEspeciales;
	}
	public void setIngredientesEspeciales(Boolean ingredientesEspeciales) {
		this.ingredientesEspeciales = ingredientesEspeciales;
	}
	//--------------------------------------------
}
