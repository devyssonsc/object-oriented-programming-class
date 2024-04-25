package biblioteca;

import java.util.ArrayList;

public class Biblioteca {
	ArrayList<Livro> livros;
	ArrayList<Autor> autores;
	
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




	public void adicionarLivro(Livro newLivro)
	{
		livros.add(newLivro);
	}
	
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
	
	public int pesquisarAutor(String cc)
	{
		for(Autor autor:autores) {
			if(autor.getCc().equals(cc)) {
				return autores.indexOf(autor);
			}
		}
		return -1;
	}
	
	public int pesquisarLivro(String isbn)
	{
		for(Livro livro:livros) {
			if(livro.getIsbn().equals(isbn)) {
				return livros.indexOf(livro);
			}
		}
		return -1;
	}
	
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
