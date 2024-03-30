
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
        //Album album1 = new Album("Album1");
        Album listaAlbuns[] = new Album[10];
        String option;
        String descricao;
        String link;
        int bytes;
        String tag;
        String tagImpressa;
        String descPesquisada;
        String descAtualizada;
        String novoLink;
        String nomeAlbum;
        int selectAlbum;
        
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
                        input.nextLine();
                    } while(bytes <= 0);
                    
                    do{
                        System.out.print("Tag: ");
                        tag = input.nextLine();
                    } while(tag.equalsIgnoreCase(""));
                    
                    if (qtdAlbuns == 0){
                        do{
                            System.out.println("Qual será o nome do seu primeiro álbum, onde será guardada a fotografia?");
                            nomeAlbum = input.nextLine();
                        } while (nomeAlbum.equals(""));
                        System.out.println("Album criado na posição " + qtdAlbuns);
                        listaAlbuns[qtdAlbuns] = new Album(nomeAlbum);
                        listaAlbuns[qtdAlbuns++].inserirFotografia(descricao, link, bytes, tag);
                    } else {
                        do{
                            System.out.println("Em qual álbum deseja inserir a fotografia?");
                            for (int i = 0; i < qtdAlbuns; i++){
                                System.out.println((i+1) + ". " + listaAlbuns[i].getNameAlbum());
                            }
                            System.out.println("0. Criar novo album");
                            selectAlbum = input.nextInt();
                            input.nextLine();
                        } while (selectAlbum < 0 && selectAlbum > qtdAlbuns);
                        
                        if (selectAlbum != 0){
                            System.out.println("Foto inserida no album " + (selectAlbum - 1));
                            listaAlbuns[selectAlbum - 1].inserirFotografia(descricao, link, bytes, tag);
                        } else{
                            do{
                                System.out.println("Qual será o nome do álbum, onde será guardada a fotografia?");
                                nomeAlbum = input.nextLine();
                            } while (nomeAlbum.equals(""));
                            System.out.println("Album criado na posição " + qtdAlbuns);
                            listaAlbuns[qtdAlbuns] = new Album(nomeAlbum);
                            listaAlbuns[qtdAlbuns++].inserirFotografia(descricao, link, bytes, tag);
                        }
                    }
                    
                    System.out.println("--------------------------------");
                    break;
                case "b":
                    int totalBytes = 0;
                    for (int i = 0; i < qtdAlbuns; i++){
                        totalBytes += listaAlbuns[i].imprimirBytesTotais();
                    }
                    System.out.println("Espaço total do album: " + totalBytes + " bytes");
                    System.out.println("--------------------------------");
                    break;
                case "c":
                    for (int i = 0; i < qtdAlbuns; i++){
                        listaAlbuns[i].imprimirFotografias();
                    }
                    System.out.println("--------------------------------");
                    break;
                case "d":
                    do{
                        System.out.print("Deseja imprimir as fotos de qual tag? ");
                        tagImpressa = input.nextLine();
                    } while (tagImpressa.equals(""));
                    
                    for (int i = 0; i < qtdAlbuns; i++){
                        listaAlbuns[i].imprimirDescricao(tagImpressa);
                    }
                    
                    System.out.println("--------------------------------");
                    break;
                case "e":
                    do{
                        System.out.print("Descrição que deseja pesquisar: ");
                        descPesquisada = input.nextLine();
                    } while (descPesquisada.equals(""));
                    
                    for (int i = 0; i < qtdAlbuns; i++){
                        listaAlbuns[i].pesquisarFotografia(descPesquisada);
                    }
                    
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
                    
                    for (int i = 0; i < qtdAlbuns; i++){
                        listaAlbuns[i].atualizarLink(descAtualizada, novoLink);
                    }
                    
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
