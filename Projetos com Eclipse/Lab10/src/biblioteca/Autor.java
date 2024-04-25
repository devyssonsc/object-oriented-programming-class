/**
 * 
 */
package biblioteca;

import java.util.ArrayList;

public class Autor {
	private String nome;
	private String cc;
	private String email;
	private ArrayList<Livro> listaLivros;
	
	/**
	 * @param nome
	 * @param cc
	 * @param email
	 * @param listaLivros
	 */
	public Autor(String nome, String cc, String email) {
		this.nome = nome;
		this.cc = cc;
		this.email = email;
		listaLivros = new ArrayList<Livro>();
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @return the cc
	 */
	public String getCc() {
		return cc;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @return the listaLivros
	 */
	public ArrayList<Livro> getListaLivros() {
		return listaLivros;
	}
	
	public String getStringListaLivros() {
		String stringListaLivros = "";
		
		for(Livro livro:listaLivros) {
			if(listaLivros.indexOf(livro) != listaLivros.size() - 1) {
				stringListaLivros += livro.getTitulo() + ", ";
			} else {
				stringListaLivros += livro.getTitulo();
			}
		}
		
		return stringListaLivros;
	}

	@Override
	public String toString() {
		String stringListaLivros = "";
		
		for(Livro livro:listaLivros) {
			if(listaLivros.indexOf(livro) != listaLivros.size() - 1) {
				stringListaLivros += livro.getTitulo() + ", ";
			} else {
				stringListaLivros += livro.getTitulo();
			}
		}
		
		return nome + "\nNº de Identificação: " + cc + "\nEmail: " + email + "\nLivros: " + stringListaLivros + "\n----------\n";
	}
	
	
}//fim da classe
