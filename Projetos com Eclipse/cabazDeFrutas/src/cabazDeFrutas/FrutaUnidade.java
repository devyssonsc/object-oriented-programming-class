/**
 * 
 */
package cabazDeFrutas;

/**
 * 
 */
public class FrutaUnidade extends Fruta {
	private int quantidade;

	/**
	 * @param nome
	 * @param preco
	 */
	public FrutaUnidade(String nome, double preco, int quantidade) {
		super(nome, preco);
		this.quantidade = quantidade;
	}
	
	/**
	 * @return the quantidade
	 */
	public int getQuantidade() {
		return quantidade;
	}

	@Override
	public String toString() {
		return "FrutaUnidade" + super.toString() + "[quantidade=" + quantidade + "]";
	}

	public double aPagar() {
		return quantidade * getPreco(); 
	}
}
