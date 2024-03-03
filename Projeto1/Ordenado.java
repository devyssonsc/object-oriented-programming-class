
/**
 * Escreva uma descrição da classe Ordenado aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
import java.util.Scanner;
public class Ordenado
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Quantos ordenados serão lidos? ");
        int qtOrdenados = input.nextInt();
        int[] ordenados = new int[qtOrdenados];
        int soma = 0;
        for (int i = 0; i < qtOrdenados; i++)
        {
            System.out.print("Digite o " + (i + 1) + "º ordenado: ");
            ordenados[i] = input.nextInt();
            soma += ordenados[i];
        }
        int media = soma / qtOrdenados;
        
        for (int k = 0; k < qtOrdenados; k++)
        {
            System.out.println(ordenados[k] + ":" + (ordenados[k] - media));
        }
    }//fim método
}//fim classe
