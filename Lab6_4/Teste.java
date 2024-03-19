
/**
 * Escreva uma descrição da classe Teste aqui.
 * 
 * @author Devysson S. Cardoso
 * @version 18.03.2024
 */
import java.util.Scanner;
public class Teste //Has composition between Teste and Contato (Teste has a Contato)
{
    static Contato[] contatos = new Contato[10];
    static int qtdContatos = 0;
    static String nome;
    static int numTelm;
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String option;
        String novoNome;
        int novoNumTelm;
        int telmAlterado;
        
        do{
            System.out.println("a. Inserir contactos\nb. Alterar o nome de um contacto\nc. Imprimir os detalhes de todos os contactos\nd. Encerrar");
            option = input.nextLine();
        } while (!option.equalsIgnoreCase("a") && !option.equalsIgnoreCase("b") && !option.equalsIgnoreCase("c") && !option.equalsIgnoreCase("d"));
        
        while (!option.equalsIgnoreCase("d")){
            switch (option){
                case "a":
                    do{
                        System.out.print("Nome do novo contacto: ");
                        novoNome = input.nextLine();
                    } while (novoNome.equalsIgnoreCase(""));
                    do{
                        System.out.print("Número do novo contacto: ");
                        novoNumTelm = input.nextInt();
                        input.nextLine();
                    } while ((novoNumTelm / 100000000) < 1 || (novoNumTelm / 100000000) > 10); //verifica se o número tem 9 dígitos
                    insereContato(novoNome, novoNumTelm);
                    System.out.println("\n--------------------------------------------------");
                    break;
                case "b":
                    do{
                        System.out.print("Número do contacto que deseja alterar: ");
                        telmAlterado = input.nextInt();
                        input.nextLine();
                    } while ((telmAlterado / 100000000) < 1 || (telmAlterado / 100000000) > 10);
                    do{
                        System.out.print("Novo nome do contacto: ");
                        novoNome = input.nextLine();
                    } while (novoNome.equalsIgnoreCase(""));
                    alterarNome(telmAlterado, novoNome);
                    System.out.println("\n--------------------------------------------------");
                    break;
                case "c":
                    imprimeContato();
                    System.out.println("\n--------------------------------------------------");
                    break;
            }
            
            do{
                System.out.println("a. Inserir contactos\nb. Alterar o nome de um contacto\nc. Imprimir os detalhes de todos os contactos\nd. Encerrar");
                option = input.nextLine();
            } while (!option.equalsIgnoreCase("a") && !option.equalsIgnoreCase("b") && !option.equalsIgnoreCase("c") && !option.equalsIgnoreCase("d"));
        }
    }
    
    /**
     * @param recieve a String and a interger that will be the name and the number of the contact
     */
    public static void insereContato(String novoNome, int novoTelm)
    {
        contatos[qtdContatos] = new Contato(novoNome, novoTelm);
        qtdContatos++;
    }
    
    
    /**
     * @param recieve a interger and a String that will be the number and the new name of the contact
     */
    public static void alterarNome(int telm, String novoNome)
    {
        int indiceEncontrado = 999;
        for (int i = 0; i < qtdContatos; i++){
            if (telm == contatos[i].getNumTelm()){
                indiceEncontrado = i;
            }
        }
        
        if (indiceEncontrado == 999){
            System.out.println("Número não encontrado");    
        } else{
            contatos[indiceEncontrado].setNome(novoNome);
        }
    }
    
    /**
     * print all the contacts
     */
    public static void imprimeContato()
    {
        for(int i = 0; i < qtdContatos; i++){
            System.out.print((i + 1) + ". ");
            System.out.println(contatos[i].toString());
        }
    }
}
