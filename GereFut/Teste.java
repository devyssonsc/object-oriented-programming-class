
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
        Clube FCP = new Clube("Porto", 30);
        Scanner input = new Scanner(System.in);
        String option;
        String newName;
        int newNum;
        
        do{
            System.out.println("Gerenciamento do clube:\na. Registrar jogador\nb. Pesquisar jogador\nc. Imprimir detalhes dos jogadores\nd. Imprimir total de cartões amarelos do clube\ne. Registrar cartão para um jogador\nf. Imprime o número de jogadores do clube\ng. Encerrar");
            option = input.nextLine();
        } while(!option.equalsIgnoreCase("a") && !option.equalsIgnoreCase("b") && !option.equalsIgnoreCase("c") && !option.equalsIgnoreCase("d") && !option.equalsIgnoreCase("e") && !option.equalsIgnoreCase("f") && !option.equalsIgnoreCase("g"));
        
        while(!option.equalsIgnoreCase("g")){
            
            switch(option){
                case "a":
                    do{
                        System.out.print("Nome: ");
                        newName = input.nextLine();
                    } while(newName.equals(""));
                    
                    do{
                        System.out.print("Número(0 a 100): ");
                        newNum = input.nextInt();
                        input.nextLine();
                    } while(newNum < 0 && newNum >= 100);
                    Jogador novoJ = new Jogador(newName, (byte) newNum);
                    FCP.registrarJogador(novoJ);
                    System.out.println("------------------------");
                    break;
                case "b":
                    do{
                        System.out.print("Qual o nome do jogador que deseja pesquisar? ");
                        newName = input.nextLine();
                    } while(newName.equals(""));
                    
                    do{
                        System.out.print("Número(0 a 100): ");
                        newNum = input.nextInt();
                        input.nextLine();
                    } while(newNum < 0 && newNum >= 100);
                    
                    int indice = FCP.pesquisarJog(newName, (byte) newNum);
                    if(indice != -1){
                        System.out.println("O jogador está na posição " + (indice+1) + " na lista de jogadores");
                    } else{
                        System.out.println("Não é jogador do clube");
                    }
                    
                    System.out.println("------------------------");
                    break;
                case "c":
                    FCP.imprimir();
                    
                    System.out.println("------------------------");
                    break;
                case "d":
                    FCP.contaC();
                    
                    System.out.println("------------------------");
                    break;
                case "e":
                    do{
                        System.out.print("Nome do jogador a receber cartão: ");
                        newName = input.nextLine();
                    } while(newName.equals(""));
                    
                    do{
                        System.out.print("Número(0 a 100): ");
                        newNum = input.nextInt();
                        input.nextLine();
                    } while(newNum < 0 && newNum >= 100);
                    
                    FCP.registrarCartao(newName, (byte) newNum);
                    
                    System.out.println("------------------------");
                    break;
                case "f":
                    FCP.totalJ();
                    
                    System.out.println("------------------------");
                    break;
            }
            
            do{
                System.out.println("Gerenciamento do clube:\na. Registrar jogador\nb. Pesquisar jogador\nc. Imprimir detalhes dos jogadores\nd. Imprimir total de cartões amarelos do clube\ne. Registrar cartão para um jogador\nf. Imprime o número de jogadores do clube\ng. Encerrar");
                option = input.nextLine();
            } while(!option.equalsIgnoreCase("a") && !option.equalsIgnoreCase("b") && !option.equalsIgnoreCase("c") && !option.equalsIgnoreCase("d") && !option.equalsIgnoreCase("e") && !option.equalsIgnoreCase("f") && !option.equalsIgnoreCase("g"));
        }
    }
}
