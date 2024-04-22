
/**
 * Escreva uma descrição da classe Teste aqui.
 * 
 * @author Devysson S. Cardoso
 * @version 18.03.2024
 */
import java.util.Scanner;
public class Teste //Has composition between Teste and Contato (Teste has a Contato)
{
    static String nome;
    static int numTelm;
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        GestorWhatsapp listaA = new GestorWhatsapp(50);
        GestorWhatsapp listaB = new GestorWhatsapp(100);
        String option;
        String novoNome;
        int novoNumTelm;
        int telmAlterado;
        String qlLista;
        int contactoPesquisado;
        int result;
        int telmImpresso;
        
        do{
            System.out.println("a. Inserir contactos\nb. Alterar o nome de um contacto\nc. Pesquisar contactos\nd. Imprimir um contacto\ne. Imprimir os contactos\nf. Encerrar");
            option = input.nextLine();
        } while (!option.equalsIgnoreCase("a") && !option.equalsIgnoreCase("b") && !option.equalsIgnoreCase("c") && !option.equalsIgnoreCase("d") && !option.equalsIgnoreCase("e") && !option.equalsIgnoreCase("f"));
        
        while (!option.equalsIgnoreCase("f")){
            switch (option){
                case "a":
                    do{
                        System.out.println("Em qual lista deseja inserir?\nA) Lista A\nB) Lista B");
                        qlLista = input.nextLine();
                    }while (!qlLista.equalsIgnoreCase("A") && !qlLista.equalsIgnoreCase("B"));
                    
                    do{
                        System.out.print("Nome do novo contacto: ");
                        novoNome = input.nextLine();
                    } while (novoNome.equalsIgnoreCase(""));
                    do{
                        System.out.print("Número do novo contacto: ");
                        novoNumTelm = input.nextInt();
                        input.nextLine();
                    } while ((novoNumTelm / 100000000) < 1 || (novoNumTelm / 100000000) > 10); //verifica se o número tem 9 dígitos
                    
                    if (qlLista.equalsIgnoreCase("A")){
                        listaA.insereContacto(novoNome, novoNumTelm);
                    } else{
                        listaB.insereContacto(novoNome, novoNumTelm);
                    }
                    
                    System.out.println("\n--------------------------------------------------");
                    break;
                case "b":
                    do{
                        System.out.println("Em qual lista deseja alterar?\nA) Lista A\nB) Lista B");
                        qlLista = input.nextLine();
                    }while (!qlLista.equalsIgnoreCase("A") && !qlLista.equalsIgnoreCase("B"));
                    
                    do{
                        System.out.print("Número do contacto que deseja alterar: ");
                        telmAlterado = input.nextInt();
                        input.nextLine();
                    } while ((telmAlterado / 100000000) < 1 || (telmAlterado / 100000000) > 10);
                    do{
                        System.out.print("Novo nome do contacto: ");
                        novoNome = input.nextLine();
                    } while (novoNome.equalsIgnoreCase(""));
                    
                    if (qlLista.equalsIgnoreCase("A")){
                        listaA.alterarNome(telmAlterado, novoNome);
                    } else{
                        listaB.alterarNome(telmAlterado, novoNome);
                    }
                    
                    System.out.println("\n--------------------------------------------------");
                    break;
                case "c":
                    do{
                        System.out.println("Em qual lista deseja pesquisar?\nA) Lista A\nB) Lista B");
                        qlLista = input.nextLine();
                    }while (!qlLista.equalsIgnoreCase("A") && !qlLista.equalsIgnoreCase("B"));
                    
                    do{
                        System.out.print("Número de telemóvel que deseja pesquisar: ");
                        contactoPesquisado = input.nextInt();
                        input.nextLine();
                    } while((contactoPesquisado / 100000000) < 1 || (contactoPesquisado / 100000000) > 10);
                    
                    if (qlLista.equalsIgnoreCase("A")){
                        result = listaA.pesquisarContacto(contactoPesquisado);
                    } else{
                        result = listaB.pesquisarContacto(contactoPesquisado);
                    }
                    
                    if (result == -1){
                        System.out.println("Contacto não encontrado");
                    } else{
                        System.out.println("Contacto encontrado na " + (result+1) + "ª posição");
                    }
                    
                    System.out.println("\n--------------------------------------------------");
                    break;
                case "d":
                    do{
                        System.out.println("De qual lista é o contacto que deseja imprimir?\nA) Lista A\nB) Lista B");
                        qlLista = input.nextLine();
                    }while (!qlLista.equalsIgnoreCase("A") && !qlLista.equalsIgnoreCase("B"));
                    
                    do{
                        System.out.print("Número do contacto que deseja imprimir: ");
                        telmImpresso = input.nextInt();
                        input.nextLine();
                    } while((telmImpresso / 100000000) < 1 || (telmImpresso / 100000000) > 10);
                    
                    if (qlLista.equalsIgnoreCase("A")){
                        listaA.imprimirUmContacto(telmImpresso);
                    } else{
                        listaB.imprimirUmContacto(telmImpresso);
                    }
                    
                    System.out.println("\n--------------------------------------------------");
                    break;
                case "e":
                    do{
                        System.out.println("Qual lista deseja imprimir?\nA) Lista A\nB) Lista B");
                        qlLista = input.nextLine();
                    }while (!qlLista.equalsIgnoreCase("A") && !qlLista.equalsIgnoreCase("B"));
                    
                    if (qlLista.equalsIgnoreCase("A")){
                        listaA.imprimirContacto();
                    } else{
                        listaB.imprimirContacto();
                    }
                    
                    System.out.println("\n--------------------------------------------------");
                    break;
            }
            
            do{
                System.out.println("a. Inserir contactos\nb. Alterar o nome de um contacto\nc. Pesquisar contactos\nd. Imprimir um contacto\ne. Imprimir os contactos\nf. Encerrar");
                option = input.nextLine();
            } while (!option.equalsIgnoreCase("a") && !option.equalsIgnoreCase("b") && !option.equalsIgnoreCase("c") && !option.equalsIgnoreCase("d") && !option.equalsIgnoreCase("e") && !option.equalsIgnoreCase("f"));
            
        }
    }
    
    
}
