package modelo;

import java.util.Scanner;
import excepciones.CantMesasIncorrectoException;
import excepciones.MesaNoDisponibleException;

/**
 * @author Agüero Sebastián, Mujica Juan Manuel, Navarro Pablo, Vucetic Ivo
 * <br>
 * Clase UI
 * */
public class UI {
	private Negocio Cerveceria=null;
	
	public UI() {
		this.Cerveceria = new Negocio();
	}
	
	public void abrirLocal() {
		Scanner entrada= new Scanner(System.in);
		int cantMesas = entrada.nextInt();
		try {
			this.Cerveceria.abrirLocal(cantMesas);
		}
		catch (CantMesasIncorrectoException e){
			System.out.println(e.getMessage());
		}
	}
	
	public void cerrarMesa() {
		Scanner entrada= new Scanner(System.in);
		int nroMesa = entrada.nextInt();
		
		try {
			System.out.println("El importe de la mesa"+nroMesa+"es: $"+this.Cerveceria.cerrarMesa(nroMesa));
		}
		catch (CantMesasIncorrectoException e){
			System.out.println(e.getMessage());
		}
	}
	
	public void ocuparMesa() {
		Scanner entrada= new Scanner(System.in);
		int nroMesa = entrada.nextInt();
		Mesa mesaCerrada=null;
		try {
			mesaCerrada= this.Cerveceria.ocuparMesa(nroMesa);
		}catch (CantMesasIncorrectoException e){
			System.out.println(e.getMessage());
		}catch (MesaNoDisponibleException e) {
			System.out.println(e.getMessage());
		}
		
	}
}
