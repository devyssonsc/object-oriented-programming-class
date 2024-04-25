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
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}
	/**
	 * @return the ano
	 */
	public int getAno() {
		return ano;
	}
	/**
	 * @return the isbn
	 */
	public String getIsbn() {
		return isbn;
	}
	/**
	 * @return the editora
	 */
	public String getEditora() {
		return editora;
	}
	
	/**
	 * @return the listaAutores
	 */
	public ArrayList<Autor> getListaAutores()
	{
		return listaAutores;
	}
	
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
