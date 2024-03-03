
/**
 * Escreva uma descrição da classe CiclioFor aqui.
 * 
 * @author Devysson 
 * @version (um número da versão ou uma data)
 */

import java.util.Scanner;
public class CiclioFor
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner (System.in);
        int soma = 0;
        int nAluno;
        int nota;
        for (int i= 1; i<=3; i++)
        {
            do{
                System.out.print("Digite o seu número: ");
                nAluno = input.nextInt();   
            } while(nAluno < 0);
            
            do{
                System.out.print("Digite a sua nota: ");
                nota = input.nextInt();
            } while(nota < 0 || nota > 20);
            
            soma += nota;
        }// Fim for
        int media = soma / 10;
        System.out.print("Média:" + media);
    }// Fim método
}// Fim classe
