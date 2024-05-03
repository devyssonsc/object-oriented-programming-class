package primeiroAno;
/**
 * 
 */

import java.util.ArrayList;

import recurso.Recurso;
/**
 * 
 */
public class UnidadeCurricular {
	private String nome;
	private ArrayList<Recurso> listaRecursos;
	
	/**
	 * @param nome
	 */
	public UnidadeCurricular(String nome) {
		this.nome = nome;
		listaRecursos = new ArrayList<Recurso>();
	}
	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * @return the listaRecursos
	 */
	public ArrayList<Recurso> getListaRecursos() {
		return listaRecursos;
	}
	@Override
	public String toString() {
		return "UnidadeCurricular [nome=" + nome + ", listaRecursos=" + listaRecursos + "]";
	}
	
	
}
