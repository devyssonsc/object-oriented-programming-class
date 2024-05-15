/**
 * 
 */
package clube;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 */
public class Clube {
	ArrayList<Modalidade> listaModalidades;
	
	Scanner input = new Scanner(System.in);
	
	
	
	/**
	 * 
	 */
	public Clube() {
		listaModalidades = new ArrayList<>();
	}

	public void registarModalidades(String nome, String escalao, String nomeTreinador, String estadio)
	{
		Modalidade newModalidade = new Futebol(nome, escalao, nomeTreinador, estadio);
		listaModalidades.add(newModalidade);
		registarJogadores(newModalidade);
		
	}
	
	public void registarModalidades(String nome, String escalao, int maxJogadores)
	{
		Modalidade newModalidade = new Voleibol(nome, escalao, maxJogadores);
		listaModalidades.add(newModalidade);
		registarJogadores(newModalidade);
	}
	
	public void registarJogadores(Modalidade modalidade)
	{
		int numCamisa;
		String nomeJogador;
		
		System.out.println("\nRegisto de jogadores:\n");
		
		do {
			System.out.print("Nº da camisa(-1 para Terminar): ");
			numCamisa = input.nextInt();
			input.nextLine();
		} while(numCamisa < -1 || numCamisa > 99);
		
		while(numCamisa != -1) {
		
			do {
				System.out.print("Nome do jogador: ");
				nomeJogador = input.nextLine();
			} while(nomeJogador.equals(""));
		
			if(modalidade instanceof Voleibol) {
				Voleibol voleibol = (Voleibol) modalidade;
				if(modalidade.getListaJogadores().size() < voleibol.getMaxJogadores()) {
					modalidade.getListaJogadores().add(new Jogador(numCamisa, nomeJogador));
				} else {
					System.out.println("\nLimite de jogadores excedido!\n");
				}
			} else {
				modalidade.getListaJogadores().add(new Jogador(numCamisa, nomeJogador));				
			}
			
			do {
				System.out.print("Nº da camisa(-1 para Terminar): ");
				numCamisa = input.nextInt();
				input.nextLine();
			} while(numCamisa < -1 || numCamisa > 99);
			
		}
	}
	
	public void imprimirDetalhesTodasModalidades()
	{
		for(Modalidade modalidade:listaModalidades) {
			System.out.println(modalidade.toString());
		}
	}
	
	public void imprimirDetalhesJogadoresModalidade(String nomeModalidade)
	{
		for(Modalidade modalidade:listaModalidades) {
			if(modalidade.getClass().getSimpleName().equalsIgnoreCase(nomeModalidade)) {
				System.out.println(modalidade.listaJogadoresString());
			}
		}
	}
	
	public void imprimirJogadoresZerados()
	{
		for(Modalidade modalidade:listaModalidades) {
			for(Jogador jogador:modalidade.getListaJogadores()) {
				if(jogador.getJogosDisputados() == 0) {
					System.out.println(jogador.getNumCamisa() + " - " + jogador.getNome() + "(" + modalidade.getNome() + ")");
				}
			}
		}
	}
}//fim da classe
