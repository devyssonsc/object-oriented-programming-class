/**
 * 
 */
package clube;

import java.util.Scanner;

/**
 * 
 */
public class Teste {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Clube upt = new Clube();
		int option;

		do {
			System.out.println("1. Registar modalidades.");
			System.out.println("2. Imprimir todos os detalhes de todas as modalidades.");
			System.out.println("3. Imprimir a informação dos jogadores que praticam uma dada modalidade.");
			System.out.println("4. Imprimir o nº e nome dos jogadores que nunca jogaram, indicando a respetiva modalidade.");
			System.out.println("5. Atualizar o nº de jogos disputados de um dado jogador de uma dada modalidade e escalão.");
			System.out.println("6. Encerrar");
			option = input.nextInt();
			input.nextLine();
		} while(option < 1 || option > 6);
		
		while (option != 6) {
			String nomeModalidade;
			String escalao;
			String tipoModalidade;
			String nomeTreinador;
			String estadio;
			int maxJogadores;
			
			switch(option) {
				case 1:
					do {
						System.out.print("Nome: ");
						nomeModalidade = input.nextLine();
					} while(nomeModalidade.equals(""));
					
					do {
						System.out.print("Escalão: ");
						escalao = input.nextLine();
					} while(escalao.equals(""));
					
					do {
						System.out.print("Modalidade (F ou V): ");
						tipoModalidade = input.nextLine();
					} while(!tipoModalidade.equalsIgnoreCase("F") && !tipoModalidade.equalsIgnoreCase("V"));
					
					if(tipoModalidade.equalsIgnoreCase("F")) {
						do {
							System.out.print("Nome do treinador: ");
							nomeTreinador = input.nextLine();
						} while(nomeTreinador.equals(""));
						
						do {
							System.out.print("Estádio: ");
							estadio = input.nextLine();
						} while(estadio.equals(""));
						
						upt.registarModalidades(nomeTreinador, escalao, nomeTreinador, estadio);
					} else {
						do {
							System.out.print("Nº máximo de jogadores: ");
							maxJogadores = input.nextInt();
						} while(maxJogadores < 0);
						
						upt.registarModalidades(nomeModalidade, escalao, maxJogadores);
					}
			}
			do {
				System.out.println("1. Registar modalidades.");
				System.out.println("2. Imprimir todos os detalhes de todas as modalidades.");
				System.out.println("3. Imprimir a informação dos jogadores que praticam uma dada modalidade.");
				System.out.println("4. Imprimir o nº e nome dos jogadores que nunca jogaram, indicando a respetiva modalidade.");
				System.out.println("5. Atualizar o nº de jogos disputados de um dado jogador de uma dada modalidade e escalão.");
				System.out.println("6. Encerrar");
				option = input.nextInt();
				input.nextLine();
			} while(option < 1 || option > 6);
		}
		input.close();
	}

}
