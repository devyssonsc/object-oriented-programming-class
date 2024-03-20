
/**
 * Escreva uma descrição da classe Teste aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
import java.util.Scanner;
public class Teste
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String option;
        String descricao;
        
        do{
            System.out.println("a) Inserir nova fotografia\nb) Imprimir espaço total, em bytes, que o álbum ocupa\nc) Imprimir todos os detalhes de todas as fotografias\nd) Imprimir a descrição de fotografias com uma dada 'tag'\ne) Pesquisar uma foto com uma dada descrição\nf) Atualizar link de uma dada fotografia\ng) Encerrar");
            option = input.nextLine();
        } while(!option.equalsIgnoreCase("a") && !option.equalsIgnoreCase("b") && !option.equalsIgnoreCase("c") && !option.equalsIgnoreCase("d") && !option.equalsIgnoreCase("e") && !option.equalsIgnoreCase("f") && !option.equalsIgnoreCase("g"));
        
        while (!option.equalsIgnoreCase("g")){
            switch(option){
                case "a":
                    do{
                        System.out.print("Descrição: ");
                        descricao = input.nextLine();
                    } while(!descricao.equalsIgnoreCase(""));
                    break;
                case "b":
                    
            }

            
            do{
                System.out.println("a) Inserir nova fotografia\nb) Imprimir espaço total, em bytes, que o álbum ocupa\nc) Imprimir todos os detalhes de todas as fotografias\nd) Imprimir a descrição de fotografias com uma dada 'tag'\ne) Pesquisar uma foto com uma dada descrição\nf) Atualizar link de uma dada fotografia\ng) Encerrar");
                option = input.nextLine();
            } while(!option.equalsIgnoreCase("a") && !option.equalsIgnoreCase("b") && !option.equalsIgnoreCase("c") && !option.equalsIgnoreCase("d") && !option.equalsIgnoreCase("e") && !option.equalsIgnoreCase("f") && !option.equalsIgnoreCase("g"));
        }
    }
}
