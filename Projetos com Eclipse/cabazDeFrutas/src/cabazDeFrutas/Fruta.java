/**
 * 
 */
package cabazDeFrutas;

/**
 * 
 */
public abstract class Fruta {
	private String nome;
	protected double preco;
	
	/**
	 * @param nome
	 * @param preco
	 */
	public Fruta(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * @return the preco
	 */
	public double getPreco() {
		return preco;
	}
	/**
	 * @param preco the preco to set
	 */
	public void setPreco(double preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "Fruta [nome=" + nome + ", preco=" + preco + "]";
	}
	
	public abstract double aPagar();
}
