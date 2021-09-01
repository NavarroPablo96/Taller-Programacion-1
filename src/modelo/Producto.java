package modelo;

public class Producto {
	private double precio;
	private int id;
	private String descripcion;
	
	public Producto(double precio, int id, String descripcion) {
		super();
		this.precio = precio;
		this.id = id;
		this.descripcion = descripcion;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}
