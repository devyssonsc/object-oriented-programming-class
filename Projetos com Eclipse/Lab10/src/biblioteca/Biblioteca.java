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
	
	public void adicionarLivro(Livro newLivro)
	{
		livros.add(newLivro);
	}
	
	public void adicionarAutor(Autor newAutor)
	{
		livros.get(livros.size() - 1).getListaAutores().add(newAutor);
		autores.add(newAutor);
		autores.get(autores.size() - 1).getListaLivros().add(livros.get(livros.size() - 1));
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
}
