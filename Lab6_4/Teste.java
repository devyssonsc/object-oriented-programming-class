
/**
 * Escreva uma descrição da classe Teste aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
import java.util.Scanner;
public class Teste
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
                    break;
                case "c":
                    imprimeContato();
                    break;
            }
            
            do{
                System.out.println("a. Inserir contactos\nb. Alterar o nome de um contacto\nc. Imprimir os detalhes de todos os contactos\nd. Encerrar");
                option = input.nextLine();
            } while (!option.equalsIgnoreCase("a") && !option.equalsIgnoreCase("b") && !option.equalsIgnoreCase("c") && !option.equalsIgnoreCase("d"));
        }
    }
    
    public static void insereContato(String novoNome, int novoTelm)
    {
        contatos[qtdContatos] = new Contato(novoNome, novoTelm);
        qtdContatos++;
    }
    
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
    
    public static void imprimeContato()
    {
        for(int i = 0; i < qtdContatos; i++){
            System.out.print((i + 1) + ". ");
            System.out.println(contatos[i].getNome());
            System.out.println(contatos[i].getNumTelm());
            System.out.print("\n");
        }
    }
}
