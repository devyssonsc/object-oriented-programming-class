package biblioteca;

import java.util.Scanner;
import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Biblioteca biblioteca = new Biblioteca();
		
		String option;
		String titulo;
		int ano;
		String isbn;
		String editora;
		
		System.out.println("Seja bem-vindo a biblioteca da UPT, posso ajudar?");
		do {
			System.out.println("a. Registrar livros");
			System.out.println("b. Imprimir detalhes de todos os livros");
			System.out.println("c. Imprimir detalhes de um livro específico");
			System.out.println("d. Imprimir os livros de um autor específico");
			System.out.println("e. Imprimir o nome de todos os autores e os títulos de seus livros");
			System.out.println("f. Encerrar");
			option = input.nextLine();
		} while(!option.equalsIgnoreCase("a") && !option.equalsIgnoreCase("b") && !option.equalsIgnoreCase("c") && !option.equalsIgnoreCase("d") && !option.equalsIgnoreCase("e") && !option.equalsIgnoreCase("f"));

		while(!option.equalsIgnoreCase("f")) {
			switch(option) {
				case "a":
					do {
						System.out.print("Título: ");
						titulo = input.nextLine();
					} while(titulo.equals(""));
					
					do {
						System.out.print("Ano: ");
						ano = input.nextInt();
						input.nextLine();
					} while(ano < 1900 && ano > LocalDate.now().getYear());
					
					do {
						System.out.print("Código ISBN: ");
						isbn = input.nextLine();
					} while(!isbn.matches("\\d{10}"));
					
					do {
						System.out.print("Editora: ");
						editora = input.nextLine();
					} while(editora.equals(""));
					
					Livro newLivro = new Livro(titulo, ano, isbn, editora);
					
					biblioteca.adicionarLivro(newLivro);
					
					String nome;
					String cc;
					String email;
					
					do {
						System.out.print("Autores ('Terminar' para finalizar a lista de autores): ");
						nome = input.nextLine();
					} while(nome.equals(""));
					
					while(!nome.equalsIgnoreCase("Terminar")) {
						
						do {
							System.out.print("Nº do Cartão do Cidadão: ");
							cc = input.nextLine();
						} while(!cc.matches("\\d{12}"));
						
						do {
				            System.out.println("Digite seu e-mail:");
				            email = input.nextLine();
				        } while (!email.contains("@") || !email.contains(".com"));
						
						Autor newAutor = new Autor(nome, cc, email);
						
						biblioteca.adicionarAutor(newAutor);
						
						do {
							System.out.print("Autores ('Terminar' para finalizar a lista de autores): ");
							nome = input.nextLine();
						} while(nome.equals(""));
					}
					
					System.out.println("\nLivro adicionado");
					
					System.out.println("***********************************************************");
					break;
				case "b":
					biblioteca.imprimirDetalhesLivros();
					
					System.out.println("***********************************************************");
					break;
				case "c":
					do {
						System.out.println("Código ISBN do livro que deseja imprimir os detalhes: ");
						isbn = input.nextLine();
					} while(!isbn.matches("\\d{10}"));
					
					biblioteca.imprimirDetalhesLivros(isbn);
					
					System.out.println("***********************************************************");
					break;
				case "d":
					
					
					System.out.println("***********************************************************");
					break;
				case "e":
					
					
					System.out.println("***********************************************************");
					break;
			}
			
			do {
				System.out.println("a. Registrar livros");
				System.out.println("b. Imprimir detalhes de todos os livros");
				System.out.println("c. Imprimir detalhes de um livro específico");
				System.out.println("d. Imprimir os livros de um autor específico");
				System.out.println("e. Imprimir o nome de todos os autores e os títulos de seus livros");
				System.out.println("f. Encerrar");
				option = input.nextLine();
			} while(!option.equalsIgnoreCase("a") && !option.equalsIgnoreCase("b") && !option.equalsIgnoreCase("c") && !option.equalsIgnoreCase("d") && !option.equalsIgnoreCase("e") && !option.equalsIgnoreCase("f"));
		}
		input.close();
	}

}
