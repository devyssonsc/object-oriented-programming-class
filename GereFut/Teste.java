
/**
 * Escreva uma descrição da classe Teste aqui.
 * 
 * @author Devysson S. Cardoso
 * @version 03.04.2024
 */
import java.util.Scanner;
public class Teste
{
    public static void main (String args[])
    {
        Clube FCP = new Clube(30);
        Scanner input = new Scanner(System.in);
        String option;
        String newName;
        int newNum;
        
        do{
            System.out.println("Gerenciamento do clube:\na. Registrar jogador\nb. Pesquisar jogador\nc. Imprimir detalhes dos jogadores\nd. Imprimir total de cartões amarelos do clube\ne. Registrar cartão para um jogador\nf. Imprime o número de jogadores do clube");
            option = input.nextLine();
        } while(!option.equalsIgnoreCase("a") && !option.equalsIgnoreCase("b") && !option.equalsIgnoreCase("c") && !option.equalsIgnoreCase("d") && !option.equalsIgnoreCase("e") && !option.equalsIgnoreCase("f") && !option.equalsIgnoreCase("g"));
        
        while(!option.equalsIgnoreCase("a")){
            
            switch(option){
                case "a":
                    do{
                        System.out.print("Nome: ");
                        newName = input.nextLine();
                    } while(!newName.equals(""));
                    
                    do{
                        System.out.print("Nome: ");
                        newNum = input.nextInt();
                        input.nextLine();
                    } while(newNum < 0 && newNum >= 100);
                    
                    FCP.regista
            }
            
            do{
                System.out.println("Gerenciamento do clube:\na. Registrar jogador\nb. Pesquisar jogador\nc. Imprimir detalhes dos jogadores\nd. Imprimir total de cartões amarelos do clube\ne. Registrar cartão para um jogador\nf. Imprime o número de jogadores do clube");
                option = input.nextLine();
            } while(!option.equalsIgnoreCase("a") && !option.equalsIgnoreCase("b") && !option.equalsIgnoreCase("c") && !option.equalsIgnoreCase("d") && !option.equalsIgnoreCase("e") && !option.equalsIgnoreCase("f") && !option.equalsIgnoreCase("g"));
        }
    }
}
