
/**
 * Escreva uma descrição da classe AlunosDesconhecidos aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
import java.util.Scanner;
public class AlunosDesconhecidos
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner (System.in);
        int soma = 0;
        int contador = 0;
        int nAluno;
        int nota;
        do{
            System.out.print("Digite o seu número:");
            nAluno = input.nextInt();
        } while(nAluno < 0);
        
        while (nAluno != 0)
        {
            do{
                System.out.print("Digite a nota: ");
                nota = input.nextInt();
            } while(nAluno < 0);
        
            soma += nota;
            contador += 1;
            
            do{
                System.out.print("Digite o seu número:");
                nAluno = input.nextInt();
            } while(nAluno < 0);
        }
        
        int media = soma / contador;
        System.out.print("Média: " + media);
    } //fim método
}//fim classe
