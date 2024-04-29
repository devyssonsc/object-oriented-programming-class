package biblioteca;

import java.util.ArrayList;

public class Livro {
	private String titulo;
	private int ano;
	private String isbn;
	private String editora;
	private ArrayList<Autor> listaAutores;
	
	/**
	 * @param titulo
	 * @param ano
	 * @param isbn
	 * @param editora
	 */
	public Livro(String titulo, int ano, String isbn, String editora) {
		this.titulo = titulo;
		this.ano = ano;
		this.isbn = isbn;
		this.editora = editora;
		listaAutores = new ArrayList<Autor>();
	}
	/**
	 * @return o título do livro
	 */
	public String getTitulo() {
		return titulo;
	}
	/**
	 * @return o ano em que o livro foi publicado
	 */
	public int getAno() {
		return ano;
	}
	/**
	 * @return o código isbn do livro
	 */
	public String getIsbn() {
		return isbn;
	}
	/**
	 * @return a editora do livro
	 */
	public String getEditora() {
		return editora;
	}
	
	/**
	 * @return a lista de autores associados ao livro
	 */
	public ArrayList<Autor> getListaAutores()
	{
		return listaAutores;
	}
	
	/**
     * Converte a lista de autores associados em uma string formatada.
     *
     * @return Uma string com os nomes dos autores separados por vírgula
     */
	public String getStringListaAutores()
	{
		String stringListaAutores = "";
		
		for(Autor autor:listaAutores) {
			if(listaAutores.indexOf(autor) != listaAutores.size() - 1) {
				stringListaAutores += autor.getNome() + ", ";
			} else {
				stringListaAutores += autor.getNome();
			}
		}
		
		return stringListaAutores;
	}
	
	/**
     * Sobrescreve o método toString para fornecer uma representação em string detalhada do livro, incluindo título, ano, ISBN, editora e lista de autores.
     *
     * @return Uma string com as informações completas do livro
     */
	@Override
	public String toString() {
		String stringListaAutores = "";
		
		for(Autor autor:listaAutores) {
			if(listaAutores.indexOf(autor) != listaAutores.size() - 1) {
				stringListaAutores += autor.getNome() + ", ";
			} else {
				stringListaAutores += autor.getNome();
			}
		}
		
		return titulo + " (" + ano + ") - Código ISBN: " + isbn + "\nEditora: " + editora + "\nAutores: " + stringListaAutores + "\n----------\n";
	}
}//fim da classe
