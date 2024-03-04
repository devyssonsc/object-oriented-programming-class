
/**
 * Escreva uma descrição da classe Matriz aqui.
 * 
 * @author Devysson S. Cardoso
 * @version 03/03/2024
 */
import java.util.Scanner;
public class Matriz
{
    public static void main (String[] args)
    {
        String[][] cond = {{"Ana", "Bruno", "Gonçalo"}, {"Diogo", "Elsa", "Fernando"}, {"Tiago", "Hugo", "Inês"}, {"José", "Luísa", "Mário"}};
        Scanner input = new Scanner(System.in);
        int entrada = -1;
        int andar = -1;
        
        for(int i = 0; i < 4; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                System.out.print(cond[i][j] + " ");
            }
            System.out.print("\n");
        }// Imprimir matriz
        
        System.out.println("--------------------------------------------------");
        System.out.print("Digite o nome do residente que deseja encontrar: ");
        String encontrarResidente = input.nextLine();
        
        for(int i = 0; i < 4; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                if (cond[i][j].compareTo(encontrarResidente) == 0)
                //ou dá para usar cond[i][j].equals(encontrarResidente); resulta em true ou false
                {
                    entrada = i;
                    andar = j;
                }
            }
        }// Encontra residente
        
        if (entrada != -1)
        {
            System.out.println("--------------------------");
            System.out.print("Morada: entrada " + (entrada+1) + " andar " + (andar+1));
        } else{
            System.out.println("--------------------------");
            System.out.print("Não residente");
        }//Verifica se a pessoa buscada mora no condomínio
    }// Fim do método
}// Fim da classe
