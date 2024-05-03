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
		
			modalidade.getListaJogadores().add(new Jogador(numCamisa, nomeJogador));
			
			do {
				System.out.print("Nº da camisa(-1 para Terminar): ");
				numCamisa = input.nextInt();
				input.nextLine();
			} while(numCamisa < -1 || numCamisa > 99);
			
		}
	}
}
