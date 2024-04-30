/**
 * 
 */
package cabazDeFrutas;

/**
 * 
 */
public class FrutaPeso extends Fruta {
	private double peso;

	/**
	 * @param nome
	 * @param preco
	 */
	public FrutaPeso(String nome, double preco, double peso) {
		super(nome, preco);
		this.peso = peso;
	}

	/**
	 * @return the peso
	 */
	public double getPeso() {
		return peso;
	}
	
	@Override
	public String toString() {
		return "FrutaPeso" + super.toString() + "[peso=" + peso + "]";
	}

	public double aPagar() {
		return peso * getPreco(); 
	}
}
