
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
        System.out.print("Digite o nome do residente que deseja encontrar: ");
        String encontrarResidente = input.nextLine();
        int entrada = 999;
        int andar = 999;
        for(int i = 0; i < 4; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                System.out.println(cond[i][j]);
                if (cond[i][j] == encontrarResidente)
                {
                    entrada = i;
                    andar = j;
                }
            }
        }
        if (entrada != 999)
        {
            System.out.println("--------------------------");
            System.out.print("Morada: entrada " + (entrada+1) + " andar" + (andar+1));
        } else{
            System.out.println("--------------------------");
            System.out.print("Não residente");
        }
    }// Fim do método
}// Fim da classe
