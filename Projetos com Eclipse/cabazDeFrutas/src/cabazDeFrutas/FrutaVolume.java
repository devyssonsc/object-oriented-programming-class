/**
 * 
 */
package cabazDeFrutas;

/**
 * 
 */
public class FrutaVolume extends Fruta {
	private double volume;

	/**
	 * @param nome
	 * @param preco
	 */
	public FrutaVolume(String nome, double preco, double volume) {
		super(nome, preco);
		this.volume = volume;
	}

	/**
	 * @return the volume
	 */
	public double getVolume() {
		return volume;
	}

	@Override
	public String toString() {
		return "FrutaVolume" + super.toString() + "[volume=" + volume + "]";
	}

	public double aPagar() {
		return volume * getPreco(); 
	}
}
