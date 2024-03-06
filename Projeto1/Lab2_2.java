
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
        int[] somaLinhas = new int[4];
        int[] somaDias = new int[5];
        float[] mediaLinhas = new float[4];
        float[] mediaDias = new float[5];
        
        for (int row = 0; row < 4; row++){
            for (int col = 0; col < 5; col++){
                System.out.print("Linha " + (row+1) + " dia " + (col+1) + ": ");
                defeituosas = input.nextInt();
                tabela[row][col] = defeituosas;
            }
        }
        
        for (int row = 0; row < 4; row++){
            for (int col = 0; col < 5; col++){
                somaLinhas[row] += tabela[row][col];
                somaDias[col] += tabela[row][col];
                
                System.out.print(tabela[row][col] + " ");
            }
            System.out.print("\n");
        }
        
        System.out.println("\nSomas:");
        for (int i = 0; i < 5; i++){
            System.out.println(somaDias[i]);
        }
        System.out.println("-----------------------");
        for (int i = 0; i < 5; i++){
            System.out.print(somaDias[i] + " ");
        }
        
        
        for (int i = 0; i < 5; i++){
            mediaDias[i] = (float) somaDias[i]/4;
            if (i < 4){
                mediaLinhas[i] = (float) somaLinhas[i]/5;
            }
        }
        
        System.out.println("\n\nMédias:");
        for (int i = 0; i < 4; i++){
            System.out.println(mediaLinhas[i]);
        }
        System.out.println("-----------------------");
        for (int i = 0; i < 5; i++){
            System.out.print(mediaDias[i] + " ");
        }
        
        int maisDefeituosa = 0;
        int aux = 0;
        for (int i = 0; i < 4; i++){
            if (somaLinhas[i] > aux){
                maisDefeituosa = i;
                aux = somaLinhas[i];
            }
        }
        
        System.out.print("\nLinha que mais produz peças defeituosas: Linha " + (maisDefeituosa+1));
    }// fim do método
}// fim da classe
