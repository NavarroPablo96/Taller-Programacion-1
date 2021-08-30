package caso5;
//import java.util.random;

public class Juego {
	private int cantidadIntentos;
	private int numero; //entre 1 y 100
	
	
	
	public void inicializarJuego() {
		//
		//random rd= new random();
		this.cantidadIntentos=0;
		int numero=(int)(Math.random()*100 + 1);
		
		System.out.println("numero random=" + numero);
		//int numeroAleatorio = rd.nextInt(100);
		
	}
}
