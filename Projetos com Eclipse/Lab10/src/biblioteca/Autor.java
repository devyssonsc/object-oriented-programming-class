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
	 */
	public Autor(String nome, String cc, String email) {
		this.nome = nome;
		this.cc = cc;
		this.email = email;
		listaLivros = new ArrayList<Livro>();
	}

	/**
	 * @return o nome do autor
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @return o cc do autor
	 */
	public String getCc() {
		return cc;
	}

	/**
	 * @return o email do autor
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @return a lista de livros associados ao autor
	 */
	public ArrayList<Livro> getListaLivros() {
		return listaLivros;
	}
	
	/**
     * Converte a lista de livros associados em uma string formatada.
     *
     * @return Uma string com os títulos dos livros associados separados por vírgula
     */
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

	/**
     * Sobrescreve o método toString para fornecer uma representação em string detalhada do autor, incluindo nome, CC, e-mail e lista de livros associados.
     *
     * @return Uma string com as informações completas do autor
     */
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
