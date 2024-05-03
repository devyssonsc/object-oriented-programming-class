/**
 * 
 */
package primeiroAno;

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
		Coordenacao coordenacao = new Coordenacao();
		int option;
		
		do {
			System.out.println("1. Registar os recursos de uma dada UC");
			System.out.println("2. Imprimir os detalhes de todos os recursos de todas as UCs");
			System.out.println("3. Imprimir o nome dos recursos de uma dada UC e de um dado tipo");
			System.out.println("4. Pesquisar um dado recurso por nome");
			System.out.println("5. Para uma dada UC, imprimir o nº total de recursos de cada tipo");
			System.out.println("6. Para um dado software, imprimir os nomes das UCs em que é indicado como recurso");
			System.out.println("7. Encerrar");
			option = input.nextInt();
			input.nextLine();
		} while(option < 1 || option > 7);
		
		String nomeUc;
		String tipoRecurso;
		String nomeSoftware;
		String nomeRecurso;
		
		while(option != 7) {
			switch(option) {
				case 1:
					do {
						System.out.print("Nome da UC: ");
						nomeUc = input.nextLine();
					} while(nomeUc.equals(""));
					
					coordenacao.registarRecursosUCs(nomeUc);
					
					System.out.println("\n********************\n");
					break;
					
				case 2:
					coordenacao.imprimirTodosOsDetalhes();
					
					System.out.println("\n********************\n");
					break;
					
				case 3:
					do {
						System.out.println("Deseja imprimir os nomes dos recursos de qual UC? ");
						nomeUc = input.nextLine();
					} while(nomeUc.equals(""));
					
					do {
						System.out.println("Qual o tipo de recurso deseja imprimir? (S ou I) ");
						tipoRecurso = input.nextLine();
					} while(!tipoRecurso.equalsIgnoreCase("S") && !tipoRecurso.equalsIgnoreCase("I"));
					
					if(tipoRecurso.equals("S")) {
						tipoRecurso = "RecursoSoftware";
					} else {
						tipoRecurso = "RecursoInformacao";
					}
					
					coordenacao.imprimirNomeRecursos(nomeUc, tipoRecurso);
					
					System.out.println("\n********************\n");
					break;
					
				case 4:
					do {
						System.out.println("Nome do recurso que deseja pesquisar: ");
						nomeRecurso = input.nextLine();
					} while(nomeRecurso.equals(""));
					
					coordenacao.imprimirTodosOsDetalhes(nomeRecurso);
					
					System.out.println("\n********************\n");
					break;
					
				case 5:
					do {
						System.out.println("Deseja imprimir o nº de recursos de cada tipo de qual UC? ");
						nomeUc = input.nextLine();
					} while(nomeUc.equals(""));
					
					coordenacao.imprimirTotalRecursosTipo(nomeUc);
					
					System.out.println("\n********************\n");
					break;
					
				case 6:
					do {
						System.out.println("Nome do software que deseja pesquisar: ");
						nomeSoftware = input.nextLine();
					} while(nomeSoftware.equals(""));
					
					coordenacao.imprimirUCsDoSoftware(nomeSoftware);
					
					System.out.println("\n********************\n");
					break;
			}
			
			do {
				System.out.println("1. Registar os recursos de uma dada UC");
				System.out.println("2. Imprimir os detalhes de todos os recursos de todas as UCs");
				System.out.println("3. Imprimir o nome dos recursos de uma dada UC e de um dado tipo");
				System.out.println("4. Pesquisar um dado recurso por nome");
				System.out.println("5. Para uma dada UC, imprimir o nº total de recursos de cada tipo");
				System.out.println("6. Para um dado software, imprimir os nomes das UCs em que é indicado como recurso");
				System.out.println("7. Encerrar");
				option = input.nextInt();
				input.nextLine();
			} while(option < 1 || option > 7);
		}
		
		input.close();
	}

}
