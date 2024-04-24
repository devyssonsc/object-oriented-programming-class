package Lab9;
import java.util.Scanner;
import java.time.LocalDate;
/**
 * Lab 9.
 * 
 * @author João Mesquita (48953) & Devysson Cardoso (48330)
 * @version Abril de 2024
 */
public class Teste
{
    public static void main( String[] args )
    {
        GereCompra gestor = new GereCompra();
        Scanner scanner = new Scanner( System.in );
        double total = 0;
        int opcao = -1;
        String codProduto;
        String descricao;
        int quantStock;
        double preco;
        String procura;
        String codigoCli;
        String nome;
        int numContrib;
        int quantComprada;
        
        while ( opcao != 0 ) {
            do{
                System.out.println( "Bem-vindo ao gestor de vendas on-line!\n" );
                System.out.println( "Escolha a operação que deseja realizar:" );
                System.out.println( "1) Registar produto para venda." );
                System.out.println( "2) Imprimir os detalhes dos produtos." );
                System.out.println( "3) Pesquisar um produto." );
                System.out.println( "4) Registar cliente." );
                System.out.println( "5) Registar compra." );
                System.out.println( "6) Imprimir os detalhes das compras dos cliente." );
                System.out.println( "7) Imprimir o valor total das compras." );
                System.out.println( "0) Fechar o gestor de vendas." );
                opcao = scanner.nextInt();
                scanner.nextLine();
            } while(opcao < 0 || opcao > 9);
    
            switch ( opcao ) {
                case 1:
                    do{
                        System.out.println( "Introduza o código (exclusivo) do novo produto." );
                        codProduto = scanner.nextLine();
                    } while(codProduto.equals(""));
                    
                    do{
                        System.out.println( "Introduza a descrição do novo produto." );
                        descricao = scanner.nextLine();
                    } while(descricao.equals(""));
                    
                    do{
                        System.out.println( "Introduza a quantidade de stock novo produto." );
                        quantStock = scanner.nextInt();
                        scanner.nextLine();
                    } while(quantStock <= 0);
                    
                    do{
                        System.out.println( "Introduza o preço do novo produto, em euros." );
                        preco = scanner.nextDouble();
                        scanner.nextLine();
                    } while(preco <= 0);
                    
                    Produto produto = new Produto( codProduto, descricao, quantStock, preco );
                    gestor.setProduto( produto );
                    
                    System.out.println( "Produto registado com sucesso.\n" );
                    break;
                case 2:
                    System.out.println( "" );
                    gestor.imprimeProdutos();
                    System.out.println( "****************************************" );
                    System.out.println( "" );
                    break;
                case 3:
                    do{
                        System.out.println("Introduza o código do produto a procurar.");
                        procura = scanner.nextLine();
                    } while(procura.equals(""));
                    
                    Produto posicao = gestor.pesquisaProduto( procura );
                    if ( posicao != null ) {
                        System.out.println( "" );
                        System.out.println( "****************************************" );
                        System.out.println( posicao ); // posicao.toString() - O método toString() funciona por omissão
                        System.out.println( "****************************************" );
                        System.out.println( "" );
                    }
                    else {
                        System.out.println( "Não existe nenhum produto com esse código." );
                    }
                    break;
                case 4:
                    do{
                        System.out.println( "Introduza o código (exclusivo) do cliente." );
                        codigoCli = scanner.nextLine();
                    } while(codigoCli.equals(""));
                    
                    do{
                        System.out.println( "Introduza o nome do cliente." );
                        nome = scanner.nextLine();
                    } while(nome.equals(""));
                    
                    do{
                        System.out.println( "Introduza o número de contribuinte do cliente." );
                        numContrib = scanner.nextInt();
                        scanner.nextLine();
                    } while((numContrib / 100000000) < 1 || (numContrib / 100000000) >= 10);
                    
                    
                    Cliente cliente = new Cliente( codigoCli, nome, numContrib );
                    gestor.setCliente( cliente );
                    System.out.println( "Cliente registado com sucesso." );
                    System.out.println( "" );
                    break;
                case 5:
                    do{
                        System.out.println( "Introduza o código do cliente que está a comprar." );
                        codigoCli = scanner.nextLine();
                    } while(codigoCli.equals(""));
                    
                    Cliente position = gestor.pesquisaCliente( codigoCli );
                    if ( position != null ) {
                        Compra compra = new Compra( LocalDate.now() );
                        position.setCompra( compra );
                        do{
                            System.out.println( "Qual o código do produto que quer comprar? (Nada para terminar as compras)" );
                            codProduto = scanner.nextLine();
                        } while(codProduto.equals(""));
                        
                        while ( !codProduto.equalsIgnoreCase( "Nada" ) ) {
                            Produto pos = gestor.pesquisaProduto( codProduto );
                            if ( pos != null ) {
                                do{
                                    System.out.println( "Quantos produtos desses quer comprar?" );
                                    quantComprada = scanner.nextInt();
                                    scanner.nextLine();
                                } while(quantComprada <= 0);
                                if ( quantComprada <= pos.getQuantStock() ) {
                                    DetalheCompra detalhes = new DetalheCompra( codProduto, quantComprada );
                                    compra.setDetalhesCompra( detalhes );
                                    compra.setValorTotal( pos.getPreco() * quantComprada );
                                    total = total + pos.getPreco() * quantComprada;
                                    pos.setQuantStock( quantComprada );
                                    System.out.println( "Compra registada com sucesso." );
                                }
                                else {
                                    System.out.println( "Não há stock suficiente para essa compra." );
                                }
                            }
                            else {
                                System.out.println( "Não existe nenhum produto com esse código." );
                            }
                            
                            do{
                                System.out.println( "Qual o código do produto que quer comprar? (Nada para terminar as compras)" );
                                codProduto = scanner.nextLine();
                            } while(codProduto.equals(""));
                        }
                    }
                    else {
                        System.out.println( "Não existe nenhum cliente com esse código." );
                    }
                    break;
                case 6:
                    gestor.imprimeClientes();
                    System.out.println( "" );
                    break;
                case 7:
                    System.out.println( "" );
                    System.out.println( "O valor total das compras é de " + total + " euros." );
                    System.out.println( "" );
                    break;
                case 0:
                    System.out.println( "Até amanhã..." );
                    break;
            }
        }
        scanner.close();
    }
}
