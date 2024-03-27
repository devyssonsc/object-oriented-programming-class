
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
        Album album1 = new Album("Album1");
        String option;
        String descricao;
        String link;
        int bytes;
        String tag;
        String tagImpressa;
        String descPesquisada;
        String descAtualizada;
        String novoLink;
        
        int qtdAlbuns = 0;
        
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
                    } while(descricao.equalsIgnoreCase(""));
                    
                    do{
                        System.out.print("Link: ");
                        link = input.nextLine();
                    } while(link.equalsIgnoreCase(""));
                    
                    do{
                        System.out.print("Total de bytes da foto: ");
                        bytes = input.nextInt();
                    } while(bytes <= 0);
                    
                    do{
                        System.out.print("Tag: ");
                        tag = input.nextLine();
                    } while(tag.equalsIgnoreCase(""));
                    album1.inserirFotografia(descricao, link, bytes, tag);
                    
                    System.out.println("--------------------------------");
                    break;
                case "b":
                    album1.imprimirBytesTotais();
                    System.out.println("--------------------------------");
                    break;
                case "c":
                    album1.imprimirFotografias();
                    System.out.println("--------------------------------");
                    break;
                case "d":
                    do{
                        System.out.print("Deseja imprimir as fotos de qual tag? ");
                        tagImpressa = input.nextLine();
                    } while (tagImpressa.equals(""));
                    album1.imprimirDescricao(tagImpressa);
                    
                    System.out.println("--------------------------------");
                    break;
                case "e":
                    do{
                        System.out.print("Descrição que deseja pesquisar: ");
                        descPesquisada = input.nextLine();
                    } while (descPesquisada.equals(""));
                    album1.pesquisarFotografia(descPesquisada);
                    
                    System.out.println("--------------------------------");
                    break;
                case "f":
                    do{
                        System.out.print("Descrição que deseja atualizar: ");
                        descAtualizada = input.nextLine();
                    } while (descAtualizada.equals(""));
                    
                    do{
                        System.out.print("NovoLink: ");
                        novoLink = input.nextLine();
                    } while (novoLink.equals(""));
                    
                    album1.atualizarLink(descAtualizada, novoLink);
                    
                    System.out.println("--------------------------------");
                    break;
            }

            
            do{
                System.out.println("a) Inserir nova fotografia\nb) Imprimir espaço total, em bytes, que o álbum ocupa\nc) Imprimir todos os detalhes de todas as fotografias\nd) Imprimir a descrição de fotografias com uma dada 'tag'\ne) Pesquisar uma foto com uma dada descrição\nf) Atualizar link de uma dada fotografia\ng) Encerrar");
                option = input.nextLine();
            } while(!option.equalsIgnoreCase("a") && !option.equalsIgnoreCase("b") && !option.equalsIgnoreCase("c") && !option.equalsIgnoreCase("d") && !option.equalsIgnoreCase("e") && !option.equalsIgnoreCase("f") && !option.equalsIgnoreCase("g"));
        }
    }
}
