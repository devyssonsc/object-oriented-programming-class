/**
 * 
 */
package clube;

/**
 * 
 */
public class Voleibol extends Modalidade {
	private int maxJogadores;

	/**
	 * @param nome
	 * @param escalao
	 */
	public Voleibol(String nome, String escalao, int maxJogadores) {
		super(nome, escalao);
		this.maxJogadores = maxJogadores;
	}

	/**
	 * @return the maxJogadores
	 */
	public int getMaxJogadores() {
		return maxJogadores;
	}

	@Override
	public String toString() {
		return "Voleibol\n" + super.toString() + "\nMáximo de Jogadores: " + maxJogadores + "\n";
	}
	
	
}
