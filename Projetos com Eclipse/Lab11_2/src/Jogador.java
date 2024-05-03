/**
 * 
 */

/**
 * 
 */
public class Jogador {
	private int numCamisa;
	private String nome;
	private int jogosDisputados;
	
	/**
	 * @param numCamisa
	 * @param nome
	 * @param jogosDisputados
	 */
	public Jogador(int numCamisa, String nome, int jogosDisputados) {
		this.numCamisa = numCamisa;
		this.nome = nome;
		this.jogosDisputados = jogosDisputados;
	}

	/**
	 * @return the numCamisa
	 */
	public int getNumCamisa() {
		return numCamisa;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @return the jogosDisputados
	 */
	public int getJogosDisputados() {
		return jogosDisputados;
	}

	/**
	 * @param jogosDisputados the jogosDisputados to set
	 */
	public void setJogosDisputados(int jogosDisputados) {
		this.jogosDisputados = jogosDisputados;
	}

	@Override
	public String toString() {
		return "Jogador [numCamisa=" + numCamisa + ", nome=" + nome + ", jogosDisputados=" + jogosDisputados + "]";
	}
	
	
}
