/**
 * 
 */
package cabazDeFrutas;

import java.util.ArrayList;
import java.util.Scanner;
/**
 * 
 */
public class Cabaz {
	Scanner input = new Scanner(System.in);
	private ArrayList<Fruta> listaFrutas;
	
	/**
	 * @param listaFrutas
	 */
	public Cabaz() {
		listaFrutas = new ArrayList<Fruta>();
	}

	public void inserirCompra(Fruta fruta) {
		listaFrutas.add(fruta);
	}
	
	public double calcularTotal()
	{
		double total = 0;
		for(Fruta fruta:listaFrutas) {
			total += fruta.aPagar();
		}
		return total;
	}
	
	public int calcularNumFrutasTipo(String tipo) {
		int numFrutasTipo = 0;
		for(Fruta fruta:listaFrutas) {
			if(fruta.getClass().getSimpleName().equals(tipo)) {
				numFrutasTipo++;
			}
		}
		return numFrutasTipo;
	}
	
	public double calcularTotalGastoTipo(String tipo) {
		int totalGastoTipo = 0;
		for(Fruta fruta:listaFrutas) {
			if(fruta.getClass().getSimpleName().equals(tipo)) {
				totalGastoTipo += fruta.aPagar();
			}
		}
		return totalGastoTipo;
	}
}
