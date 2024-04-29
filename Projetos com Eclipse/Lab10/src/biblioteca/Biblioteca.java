package biblioteca;

import java.util.ArrayList;

public class Biblioteca {
	ArrayList<Livro> livros;
	ArrayList<Autor> autores;
	
	/**
     * Construtor padrão que inicializa as listas de livros e autores.
     */
	public Biblioteca()
	{
		livros = new ArrayList<Livro>();
		autores = new ArrayList<Autor>();
	}
	
	/**
	 * @return the autores
	 */
	public ArrayList<Autor> getAutores() {
		return autores;
	}

	/**
     * Adiciona um novo livro à biblioteca.
     *
     * @param newLivro O livro a ser adicionado
     */
	public void adicionarLivro(Livro newLivro)
	{
		livros.add(newLivro);
	}
	
	/**
     * Adiciona um novo autor à biblioteca e associa-o a um livro, se necessário.
     *
     * @param newAutor O autor a ser adicionado
     */
	public void adicionarAutor(Autor newAutor)
	{
		int indice = pesquisarAutor(newAutor.getCc());
		if(indice == -1) {
			newAutor.getListaLivros().add(livros.get(livros.size() - 1));
			autores.add(newAutor);
			livros.get(livros.size() - 1).getListaAutores().add(newAutor);
		} else {
			livros.get(livros.size() - 1).getListaAutores().add(newAutor);
			autores.get(indice).getListaLivros().add(livros.get(livros.size() - 1));
		}
	}
	
	/**
     * Pesquisa um autor na lista de autores por número de Cartão do Cidadão (CC).
     *
     * @param cc O número de Cartão do Cidadão a ser pesquisado
     * @return o índice do autor na lista de autores, ou -1 se não encontrado
     */
	public int pesquisarAutor(String cc)
	{
		for(Autor autor:autores) {
			if(autor.getCc().equals(cc)) {
				return autores.indexOf(autor);
			}
		}
		return -1;
	}
	
	
	/**
     * Pesquisa um livro na lista de livros por código ISBN.
     *
     * @param isbn O código ISBN a ser pesquisado
     * @return o índice do livro na lista de livros, ou -1 se não encontrado
     */
	public int pesquisarLivro(String isbn)
	{
		for(Livro livro:livros) {
			if(livro.getIsbn().equals(isbn)) {
				return livros.indexOf(livro);
			}
		}
		return -1;
	}
	
	/**
     * Imprime os detalhes de todos os livros da biblioteca.
     * Se não houver livros na lista, imprime uma mensagem informando isso.
     */
	public void imprimirDetalhesLivros()
	{
		if(livros.size() <= 0) {
			System.out.println("Não há livros na lista");
		} else {
			for(Livro livro:livros) {
				System.out.println(livro.toString());
			}
		}
	}
	
	/**
     * Imprime os detalhes de um livro específico da biblioteca, identificado pelo seu código ISBN.
     * Se não houver livros na lista ou se o ISBN especificado não corresponder a nenhum livro, imprime uma mensagem informando isso.
     *
     * @param isbn O código ISBN do livro a ser impresso
     */
	public void imprimirDetalhesLivros(String isbn)
	{
		if(livros.size() <= 0) {
			System.out.println("Não há livros na lista\n");
		} else {
			int imprimiu = 0;
			for(Livro livro:livros) {
				if(livro.getIsbn().equals(isbn)) {
					System.out.println(livro.getTitulo() + " (" + livro.getStringListaAutores() + ")\n");
					imprimiu++;
				}
			}
			if (imprimiu == 0) {
				System.out.println("Não existe livro com este código ISBN\n"); 
			}
		}
	}
	
	/**
     * Imprime os livros associados a um autor específico da biblioteca, identificado pelo número de Cartão do Cidadão (CC).
     * Se não houver autores cadastrados na lista ou se o CC especificado não corresponder a nenhum autor, imprime uma mensagem informando isso.
     *
     * @param cc O número de Cartão do Cidadão do autor cujos livros devem ser impressos
     */
	public void imprimirLivrosAutores(String cc)
	{
		if(autores.size() <= 0) {
			System.out.println("Não há autores cadastrados\n");
		} else {
			int imprimiu = 0;
			for(Autor autor:autores) {
				if(autor.getCc().equals(cc)) {
					for(Livro livro:autor.getListaLivros()) {
						System.out.println(livro.getTitulo() + "(" + livro.getAno() + ")\n");
						imprimiu++;
					}
				}
			}
			if(imprimiu == 0) {
				System.out.println("Não tem nenhum autor cadastrado com este número de Cartão do Cidadão\n");
			}
		}
	}
	
	/**
     * Imprime o nome de todos os autores cadastrados na biblioteca, junto com os títulos dos livros associados a cada autor.
     * Se não houver autores cadastrados na lista, imprime uma mensagem informando isso.
     */
	public void imprimirLivrosAutores()
	{
		if(autores.size() <= 0) {
			System.out.println("Não há autores cadastrados\n");
		} else {
			for(Autor autor:autores) {
				System.out.println(autor.getNome());
				System.out.println("Livros: " + autor.getStringListaLivros() + "\n");
			}
		}
	}
}//fim da classe
