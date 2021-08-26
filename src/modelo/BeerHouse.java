package modelo;

//import java.util.ArrayList;
import java.util.HashMap;

public class BeerHouse {
	private static BeerHouse instance=null;
	//cantiadad máxima de mesas
	private int cantidadDeMesasHabilitadas;	// cantiadad de mesas disponibles cuando se abre el local
	private int cantidadDeProductos;
	private HashMap<Integer, Mesa> mesas = new HashMap<Integer,Mesa>();
	//private HashMap<Integer, Producto> carta = new HashMap<Integer,Producto>();
	
	//private ArrayList<Mesa> mesas = new ArrayList<Mesa>();

	private BeerHouse() {
		this.cantidadDeMesasHabilitadas=0;
		this.cantidadDeProductos=0;
	}
	
	public static BeerHouse getInstance() {
		if(BeerHouse.instance==null)
			BeerHouse.instance= new BeerHouse();
		return BeerHouse.instance;
	}
	
	private void desocuparMesas() {
		Mesa actual=null;
		for(int i=0 ; i<=this.mesas.size(); i++) {
			actual=this.mesas.get(i);
			actual.setOcupada(false);
		}
	}
	
	public void abrirLocal(int cantMesas) {
		//Pre: cantidad de mesas >=1 
		//Pre cantiad de productos>= 1
		
		//Inicializar los atributos
		desocuparMesas();
		this.cantidadDeProductos=0;
		this.cantidadDeMesasHabilitadas=cantMesas;
		
	}
	
	public void agregarMesa(Mesa mesa) {
		this.mesas.put(mesa.getNumero(),mesa);
		
	}
	
	public Mesa ocuparMesa(int nroMesa) {
		Mesa aux;
		aux=this.mesas.get(nroMesa);
		aux.setOcupada(true);
		return aux;
	}
	
	public double cerrarMesa(int nroMesa) {
		double aux=this.mesas.get(nroMesa).getImporte();
		this.mesas.get(nroMesa).setOcupada(false);
		this.mesas.get(nroMesa).setImporte(0);
		return aux;
		
	}
	
	
	public int getCantidadDeMesasHabilitadas() {
		return cantidadDeMesasHabilitadas;
	}
	public int getCantidadDeProductos() {
		return cantidadDeProductos;
	}
	
}
