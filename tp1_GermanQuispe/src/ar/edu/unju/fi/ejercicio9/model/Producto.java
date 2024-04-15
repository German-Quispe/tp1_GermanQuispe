package ar.edu.unju.fi.ejercicio9.model;

public class Producto {
	private String nombre;
	private String codigo;
	private Float precio;
	private Integer descuento;
	
	public Producto() {
		// TODO Auto-generated constructor stub
	}
	
	//---------Metodoss-----------
	public void mostrarDatos () {
		System.out.println();
		System.out.println("----------------Factura----------------");
		System.out.println("Producto: "+this.nombre);
		System.out.println("Codigo: "+this.codigo);
		System.out.println("Precio Original: "+this.precio);
		System.out.println("Decuento: "+this.descuento+"%");
		System.out.println("Precio con Decuento: "+calcularDescuento(descuento,precio));
		System.out.println("---------------------------------------");
		System.out.println();
	}
	public float calcularDescuento(Integer descuento, Float precio) {
		float precioDecuento;
		precioDecuento=precio - (precio*descuento/100);
		return precioDecuento;
	}
	//---------------------------
	
	//++++++++Accesores+++++++++
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public Float getPrecio() {
		return precio;
	}
	public void setPrecio(Float precio) {
		this.precio = precio;
	}
	public Integer getDescuento() {
		return descuento;
	}
	public void setDescuento(Integer descuento) {
		this.descuento = descuento;
	}
	//+++++++++++++++++++++++++++
	
}
