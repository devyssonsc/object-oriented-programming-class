
/**
 * Escreva uma descrição da classe Lab2_2 aqui.
 * 
 * @author Devysson S. Cardoso
 * @version 05/03/2024
 */
import java.util.Scanner;
public class Lab2_2
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int[][] tabela = new int[4][5];
        int defeituosas;
        
        for (int row = 0; row < 4; row++){
            for (int col = 0; col < 5; col++){
                System.out.print("Linha " + (row+1) + " dia " + (col+1) + ": ");
                defeituosas = input.nextInt();
                tabela[row][col] = defeituosas;
            }
        }
        
        for (int row = 0; row < 4; row++){
            for (int col = 0; col < 5; col++){
                System.out.print(tabela[row][col] + " ");
            }
            System.out.print("\n");
        }
    }
}
