/**
 * 
 */
package clube;

import java.util.ArrayList;

/**
 * 
 */
public class Modalidade {
	private String nome;
	private String escalao;
	private ArrayList<Jogador> listaJogadores;
	
	/**
	 * @param nome
	 * @param escalao
	 * @param listaJogadores
	 */
	public Modalidade(String nome, String escalao) {
		this.nome = nome;
		this.escalao = escalao;
		listaJogadores = new ArrayList<>();
	}
	
	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}
	
	/**
	 * @return the escalao
	 */
	public String getEscalao() {
		return escalao;
	}
	
	/**
	 * @return the listaJogadores
	 */
	public ArrayList<Jogador> getListaJogadores() {
		return listaJogadores;
	}
	
	@Override
	public String toString() {
		return "Nome da modalidade: " + nome + ", Escalão: " + escalao + "\nLista de jogadores: " + listaJogadoresString();
	}
	
	public String listaJogadoresString()
	{
		String detalhesJogadores = "";
		for(Jogador jogador:listaJogadores) {
			detalhesJogadores += "\n" + jogador.getNumCamisa() + " - " + jogador.getNome() + " (" + jogador.getJogosDisputados() + " jogos disputados)";
		}
		return detalhesJogadores + "\n";
	}
}
