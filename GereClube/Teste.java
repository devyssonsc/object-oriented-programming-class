
/**
 * Escreva uma descrição da classe Teste aqui.
 * 
 * @author Devysson S. Cardoso
 * @version 09.04.2024
 */
import java.util.Scanner;
public class Teste
{
    public static void main (String args[])
    {
        GereClube UPT = new GereClube("Clube UPT", 5);
        Scanner input = new Scanner(System.in);
        String option;
        String newName;
        
        do{
            System.out.println("Gerenciamento do clube:\na. Inserir uma nova modalidade no clube\nb. Imprimir o nº de praticantes de uma dada modalidade\nc. Imprimir os detalhes de todas as modalidades do clube\nd. Imprimir o nº total de praticantes do clube\ne. Registrar novo praticante\nf. Imprimir modalidade com maior número de praticantes\ng. Encerrar");
            option = input.nextLine();
        } while(!option.equalsIgnoreCase("a") && !option.equalsIgnoreCase("b") && !option.equalsIgnoreCase("c") && !option.equalsIgnoreCase("d") && !option.equalsIgnoreCase("e") && !option.equalsIgnoreCase("f") && !option.equalsIgnoreCase("g"));
        
        while(!option.equalsIgnoreCase("g")){
            
            switch(option){
                case "a":
                    do{
                        System.out.print("Nome da nova modalidade: ");
                        newName = input.nextLine();
                    } while(newName.equals(""));
                    
                    UPT.inserirModalidade(newName);
                    
                    System.out.println("------------------------");
                    break;
                case "b":
                    do{
                        System.out.print("Modalidade que deseja saber os detalhes: ");
                        newName = input.nextLine();
                    } while(newName.equals(""));
                    
                    UPT.imprimirPraticantesMod(newName);
                    System.out.println("------------------------");
                    break;
                case "c":
                    UPT.imprimirModalidades();
                    
                    System.out.println("------------------------");
                    break;
                case "d":
                    UPT.contaP();
                    
                    System.out.println("------------------------");
                    break;
                case "e":
                    do{
                        System.out.print("Modalidade que deseja registrar novo praticante: ");
                        newName = input.nextLine();
                    } while(newName.equals(""));
                    
                    UPT.registrarPraticante(newName);
                    
                    System.out.println("------------------------");
                    break;
                case "f":
                    UPT.imprimirMaiorMod();
                    
                    System.out.println("------------------------");
                    break;
            }
            
            do{
                System.out.println("Gerenciamento do clube:\na. Inserir uma nova modalidade no clube\nb. Imprimir o nº de praticantes de uma dada modalidade\nc. Imprimir os detalhes de todas as modalidades do clube\nd. Imprimir o nº total de praticantes do clube\ne. Registrar novo praticante\nf. Imprimir modalidade com maior número de praticantes\ng. Encerrar");
                option = input.nextLine();
            } while(!option.equalsIgnoreCase("a") && !option.equalsIgnoreCase("b") && !option.equalsIgnoreCase("c") && !option.equalsIgnoreCase("d") && !option.equalsIgnoreCase("e") && !option.equalsIgnoreCase("f") && !option.equalsIgnoreCase("g"));
        }
    }
}