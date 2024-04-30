/**
 * 
 */
package cabazDeFrutas;

/**
 * @author Devysson Souza Cardoso
 * @version 30.04.2024
 */

import java.util.Scanner;

public class Teste {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Cabaz cabaz = new Cabaz();
		int option;
		String tipo;
		String nome;
		double preco;
		
		do {
			System.out.println("Menu frutas");
			System.out.println("1. Inserir compra");
			System.out.println("2. Calcular valor total das frutas compradas");
			System.out.println("3. Determinar nº de frutas dado um tipo específico");
			System.out.println("4. Determinar o valor total gasto para um tipo de fruta");
			System.out.println("5. Encerrar");
			option = input.nextInt();
			input.nextLine();
		} while(option < 1 && option > 5);
		
		while(option != 5) {
			switch(option) {
				case 1:
					do {
						System.out.print("Nome da fruta: ");
						nome = input.nextLine();
					} while(nome.equals(""));
					
					do {
						System.out.print("Preço da fruta: ");
						preco = input.nextDouble();
						input.nextLine();
					} while(preco <= 0);
					
					do {
						System.out.println("Deseja determinar o nº de frutas de qual tipo? (FrutaUnidade, FrutaPeso, FrutaVolume)");
						tipo = input.nextLine();
					} while(!tipo.equals("FrutaUnidade") && !tipo.equals("FrutaPeso") && !tipo.equals("FrutaVolume"));
					
					Fruta f;
					
					switch(tipo) {
						case "FrutaUnidade":
							int quantidade;
							do {
								System.out.print("Quantidade: ");
								quantidade = input.nextInt();
								input.nextLine();
							} while(quantidade <= 0);
							
							f = new FrutaUnidade(nome, preco, quantidade);
							cabaz.inserirCompra(f);
							break;
						case "FrutaPeso":
							double peso;
							do {
								System.out.print("Peso: ");
								peso = input.nextDouble();
								input.nextLine();
							} while(peso <= 0);
							
							f = new FrutaPeso(nome, preco, peso);
							cabaz.inserirCompra(f);
							break;
						case "FrutaVolume":
							double volume;
							do {
								System.out.print("Volume: ");
								volume = input.nextDouble();
								input.nextLine();
							} while(volume <= 0);
							
							f = new FrutaPeso(nome, preco, volume);
							cabaz.inserirCompra(f);
					}
						
					System.out.println("********************\n");
					break;
				case 2:
					double total = cabaz.calcularTotal();
					System.out.println("Faturamento: " + total + " euros");
					System.out.println("********************\n");
					break;
				case 3:
					do {
						System.out.println("Deseja determinar o nº de frutas de qual tipo? (FrutaUnidade, FrutaPeso, FrutaVolume)");
						tipo = input.nextLine();
					} while(!tipo.equals("FrutaUnidade") && !tipo.equals("FrutaPeso") && !tipo.equals("FrutaVolume"));
					
					int numFrutasTipo = cabaz.calcularNumFrutasTipo(tipo);
					
					System.out.println("Tem " + numFrutasTipo + " frutas do tipo " + tipo);
					System.out.println("********************\n");
					break;
				case 4:
					do {
						System.out.println("Deseja determinar o valor total de frutas de qual tipo? (FrutaUnidade, FrutaPeso, FrutaVolume)");
						tipo = input.nextLine();
					} while(!tipo.equals("FrutaUnidade") && !tipo.equals("FrutaPeso") && !tipo.equals("FrutaVolume"));
					
					double totalGastoTipo = cabaz.calcularTotalGastoTipo(tipo);
					
					System.out.println("Foi gasto " + totalGastoTipo + " euros em frutas do tipo " + tipo);
					System.out.println("********************\n");
					break;
			}
			
			do {
				System.out.println("Menu frutas");
				System.out.println("1. Inserir compra");
				System.out.println("2. Calcular valor total das frutas compradas");
				System.out.println("3. Determinar nº de frutas dado um tipo específico");
				System.out.println("4. Determinar o valor total gasto para um tipo de fruta");
				System.out.println("5. Encerrar");
				option = input.nextInt();
				input.nextLine();
			} while(option < 1 && option > 5);
		}
		input.close();
	}

}
