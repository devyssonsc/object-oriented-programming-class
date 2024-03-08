
/**
 * Escreva uma descrição da classe Lab5_6 aqui.
 * 
 * @author Devysson S. Cardoso
 * @version 08/03/2024
 */
import java.util.Scanner;
public class Lab5_6
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        String[] alunos = new String[50];
        String nomePesquisado;
        String novoNome;
        int option;
        
        do{
            System.out.println("Menu de navegação:\n1) Inserir aluno\n2) Imprimir alunos\n3) Pesquisar aluno\n0) Sair");
            option = input.nextInt();
            input.nextLine();
        } while (option < 0 || option > 3);
        
        while (option != 0){
            switch (option) {
                case 1:
                    do{
                        System.out.print("Nome que será inserido: ");
                        novoNome = input.nextLine();
                    } while (novoNome.equals(""));
                    inserir(alunos, novoNome);
                    break;
                case 2:
                    imprimir(alunos);
                    break;
                case 3:
                    do{
                        System.out.print("Nome que será pesquisado: ");
                        nomePesquisado = input.nextLine();
                    } while (nomePesquisado.equals(""));
                    int pos = pesquisar(alunos, nomePesquisado);
                    if (pos > -1){
                        System.out.println("O aluno existe na posição " + pos);
                    } else{
                        System.out.println("O aluno não existe");
                    }
                    break;
            }
            
            do{
                System.out.println("Menu de navegação:\n1) Inserir aluno\n2) Imprimir alunos\n3) Pesquisar aluno\n0) Sair");
                option = input.nextInt();
                input.nextLine();
            } while (option < 0 || option > 3);
        }
    }//fim da classe
    
    public static void inserir (String[] alunos, String nome)
    {
        int pos = 0;
        for (int i = 0; i < 50; i++){
            if (alunos[i] == null){
                pos = i;
                break;
            }
        }
        alunos[pos] = nome;
        
        String aux;
        for (int i = 0; i <= pos; i++){
            for (int j = 0; j <= pos; j++){
                if(alunos[i].compareToIgnoreCase(alunos[j]) < 0){
                    aux = alunos[i];
                    alunos[i] = alunos[j];
                    alunos[j] = aux;
                }
            }
        }
        System.out.println("Nome inserido");
    }
    
    public static void imprimir (String[] alunos)
    {
        for (int i = 0; i < 50; i++){
            if (alunos[i] != null){
                System.out.println(alunos[i]);
            }
        }
    }
    
    public static int pesquisar (String[] alunos, String nome)
    {
        for (int i = 0; i < 50; i++){
            if (alunos[i] != null){
                if (alunos[i].equalsIgnoreCase(nome)){
                    return i;
                }
            } else{
                return -1;
            }
        }
        return -1;
    }
}//fim da classe
