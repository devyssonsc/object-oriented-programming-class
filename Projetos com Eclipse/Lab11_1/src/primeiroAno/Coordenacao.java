/**
 * 
 */
package primeiroAno;

import java.util.ArrayList;
import java.util.Scanner;

import recurso.*;

/**
 * 
 */
public class Coordenacao {
	ArrayList<UnidadeCurricular> listaUCs;

	Scanner input = new Scanner(System.in);
	String nomeRecurso;
	String tipoRecurso;
	String versionSoftware;
	String urlSoftware;
	String tipoInformacao;
	String nomeAutorInformacao;
	/**
	 * @param listaUCs
	 */
	public Coordenacao() {
		listaUCs = new ArrayList<>();
	}
	
	public void registarRecursosUCs(String nomeUC)
	{

		int indice = 999;
		for(UnidadeCurricular uc:listaUCs) {
			if(uc.getNome().equals(nomeUC)) {
				indice = listaUCs.indexOf(uc);
			}
		}
		
		if(indice == 999) {
			listaUCs.add(new UnidadeCurricular(nomeUC));
			indice = listaUCs.size() - 1;
		}
		
		do {
			System.out.print("Nome do recurso ('Terminar' para terminar): ");
			nomeRecurso = input.nextLine();
		} while(nomeRecurso.equals(""));
		
		while(!nomeRecurso.equalsIgnoreCase("Terminar")) {
			do {
				System.out.print("Tipo do recurso (S ou I): ");
				tipoRecurso = input.nextLine();
			} while(!tipoRecurso.equalsIgnoreCase("S") && !tipoRecurso.equalsIgnoreCase("I"));
			
			if(tipoRecurso.equalsIgnoreCase("S")) {
				do {
					System.out.print("Versão: ");
					versionSoftware = input.nextLine();
				} while(versionSoftware.equals(""));
				
				do {
					System.out.print("URL: ");
					urlSoftware = input.nextLine();
				} while(urlSoftware.equals(""));
				
				listaUCs.get(indice).getListaRecursos().add(new RecursoSoftware(nomeRecurso, versionSoftware, urlSoftware));
			} else {
				do {
					System.out.print("Tipo (Livro ou Artigo de Revista): ");
					tipoInformacao = input.nextLine();
				} while(tipoInformacao.equals(""));
				
				do {
					System.out.print("Nome do autor: ");
					nomeAutorInformacao = input.nextLine();
				} while(nomeAutorInformacao.equals(""));
				listaUCs.get(indice).getListaRecursos().add(new RecursoInformacao(nomeRecurso, tipoInformacao, nomeAutorInformacao));
			}
			
			do {
				System.out.print("Nome do recurso ('Terminar' para terminar): ");
				nomeRecurso = input.nextLine();                       
			} while(nomeRecurso.equals(""));
		}
	}
	
	public void imprimirTodosOsDetalhes()
	    { 
		for(UnidadeCurricular uc:listaUCs) {
			for(Recurso recurso:uc.getListaRecursos()) {
				System.out.println(recurso.toString());
			}
		}
	}
	
	public void imprimirTodosOsDetalhes(String nomeRecurso) 
	{
		int count = 0;
		for(UnidadeCurricular uc:listaUCs) {
			for(Recurso recurso:uc.getListaRecursos()) {
				if(recurso.getNome().equalsIgnoreCase(nomeRecurso)) {
					System.out.println(recurso.toString() + " [UC=" + uc.getNome() + "]");
					count++;
				}
			}
		}
		if (count == 0) {
			System.out.println("Não existe este recurso em nenhuma UC");
		}
	}
	
	public void imprimirNomeRecursos(String nomeUc, String tipoRecurso)
	{

		boolean temTipo = false;
		for(UnidadeCurricular uc:listaUCs) {
			if(uc.getNome().equalsIgnoreCase(nomeUc)) {
				for(Recurso recurso:uc.getListaRecursos()) {
					if(recurso.getClass().getSimpleName().equalsIgnoreCase(tipoRecurso)) {
						temTipo = true;
						System.out.println(recurso.getNome());
					}
				}
			}
		}
		if(!temTipo) {
			System.out.println("Não existem recursos do tipo " + tipoRecurso + " na UC " + nomeUc);
		}
	}
	
	public void imprimirTotalRecursosTipo(String nomeUc)
	{
		int totalRecursosSoftware = 0;
		int totalRecursosInformacao = 0;
		
		for(UnidadeCurricular uc:listaUCs) {
			if(uc.getNome().equalsIgnoreCase(nomeUc)) {
				for(Recurso recurso:uc.getListaRecursos()) {
					if(recurso.getClass().getSimpleName().equals("RecursoSoftware")) {
						totalRecursosSoftware++;
					} else {
						totalRecursosInformacao++;
					}
				}
			}
		}
		System.out.println("A UC: " + nomeUc + " tem " + totalRecursosSoftware + " recursos do tipo Software e " + totalRecursosInformacao + " recursos do tipo Informação.");
	}
	
	public void imprimirUCsDoSoftware(String nomeSoftware) {
		for(UnidadeCurricular uc:listaUCs) {
			for(Recurso recurso:uc.getListaRecursos()) {
				if(recurso.getNome().equalsIgnoreCase(nomeSoftware)) {
					System.out.println(uc.getNome());
				}
			}
		}
	}
}//fim da classe
