
/**
 * Escreva uma descrição da classe Vetores aqui.
 * 
 * @author Devysson S. Cardosoa 
 * @version (um número da versão ou uma data)
 */
import java.util.Scanner;
public class Vetores
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Quantos elementos o vetor terá?");
        int n = input.nextInt();
        
        int[] vetor = new int[n];
        int[] vetor2 = new int[n];
        
        for (int i = 0; i < n; i++)
        {
            System.out.print((i+1) + "º número: ");
            vetor[i] = input.nextInt();
        }
        
        for (int k = 0; k < n; k++)
        {
            if (k % 2 == 0)
            {
                vetor2[k] = vetor[k] * 2;
            } else{
                vetor2[k] = vetor[k] * 3;
            }
        }
        
        for (int v = 0; v < n; v++)
        {
            if (v != n-1)
            {
                 System.out.print(vetor[v] + " ");
            } else{
                System.out.println(vetor[v]);
            }
        }
        
        for (int v2 = 0; v2 < n; v2++)
        {
            if (v2 != n-1)
            {
                 System.out.print(vetor2[v2] + " ");
            } else{
                System.out.println(vetor2[v2]);
            }
        }
    }// fim do método
}// fim da classe