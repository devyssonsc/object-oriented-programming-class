
/**
 * Escreva uma descrição da classe CemAlunos aqui.
 * 
 * @author Devysso S. Cardoso
 * @version (um número da versão ou uma data)
 */
import java.util.Scanner;
public class CemAlunos
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        int[] alunos = new int[100]; //int[] alunos; - decaração
        int[] notas = new int[100]; //alunos = new int[100] - inicialização
        int soma = 0;
        int nAluno;
        int notaAluno;
        for (int i = 0; i < 100; i++)
        {
            do{
                System.out.print("Digite o número de aluno: ");
                nAluno = input.nextInt();
            } while (nAluno <=   0);
            alunos[i] = nAluno;
            
            do{
                System.out.print("Digite a nota: ");
                notaAluno = input.nextInt();
            } while (notaAluno < 0 || notaAluno > 20);
            
            notas[i] = notaAluno;
            soma += notas[i];
        }
        int media = soma / 100;
        
        System.out.println("Média: " + media);
        for (int k = 0; k < 100; k++)
        {
            if(notas[k] > media)
            {
                System.out.println(alunos[k] + "-" + notas[k]);
            }
        }
    }// fim método
}// fim classe
