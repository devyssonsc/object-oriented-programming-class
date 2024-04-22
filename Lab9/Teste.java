
/**
 * Main
 * 
 * @author Devysson S. Cardoso
 * @version 15.04.2024
 */
import java.util.ArrayList;
import java.util.Scanner;
public class Teste
{
    public static void main(String[] args)
    {
        GereCompra loja = new GereCompra();
        Scanner input = new Scanner(System.in);
        String option;
        
        String codProduto;
        String descProduto;
        int stockProduto;
        double precoProduto;
        
        String codCliente;
        String nomeCliente;
        int numContribuinte;
        
        ArrayList<String> codProdComprados = new ArrayList();
        ArrayList<Integer> quantComprados = new ArrayList();
        int quantComprada;
        
        do{
            System.out.println("Menu:\na. Registrar os produtos existentes para venda\nb. Imprimir os detalhes dos produtos\nc. Pesquisar um dado produto\nd. Registrar clientes\ne. Registrar as compras dos clientes\nf. Imprimir para cada cliente os detalhes das suas compras\ng. Imprimir o valor total das compras em euros\ng. Encerrar");
            option = input.nextLine();
        } while(!option.equalsIgnoreCase("a") && !option.equalsIgnoreCase("b") && !option.equalsIgnoreCase("c") && !option.equalsIgnoreCase("d") && !option.equalsIgnoreCase("e") && !option.equalsIgnoreCase("f") && !option.equalsIgnoreCase("g"));
        
        while(!option.equalsIgnoreCase("g")){
            switch(option){
                case "a":
                    do{
                        System.out.print("Código do produto: ");
                        codProduto = input.nextLine();
                    } while(codProduto.equals(""));
                    
                    do{
                        System.out.print("Descrição do produto: ");
                        descProduto = input.nextLine();
                    } while(descProduto.equals(""));
                    
                    do{
                        System.out.print("Stock do produto: ");
                        stockProduto = input.nextInt();
                        input.nextLine();
                    } while(stockProduto <= 0);
                    
                    do{
                        System.out.print("Preço do produto: ");
                        precoProduto = (double) input.nextDouble();
                        input.nextLine();
                    } while(precoProduto <= 0);
                    
                    loja.registrarProduto(codProduto, descProduto, stockProduto, precoProduto);
                    System.out.println("---------------------------------");
                    break;
                case "b":
                    loja.imprimirProdutos();
                    
                    System.out.println("---------------------------------");
                    break;
                case "c":
                    do{
                        System.out.print("Qual a descrição do produto pesquisado? ");
                        descProduto = input.nextLine();
                    } while(descProduto.equals(""));
                    
                    loja.pesquisarProduto(descProduto);
                    System.out.println("---------------------------------");
                    break;
                case "d":
                    do{
                        System.out.print("Código do cliente: ");
                        codCliente = input.nextLine();
                    } while(codCliente.equals(""));
                    
                    do{
                        System.out.print("Nome do cliente: ");
                        nomeCliente = input.nextLine();
                    } while(nomeCliente.equals(""));
                    
                    do{
                        System.out.print("Número de contribuinte: ");
                        numContribuinte = input.nextInt();
                        input.nextLine();
                    } while((numContribuinte / 100000000) < 1 && (numContribuinte / 100000000) > 10);
                    
                    loja.registrarCliente(codCliente, nomeCliente, numContribuinte);
                    System.out.println("---------------------------------");
                    break;
                case "e":
                    do{
                        System.out.print("Código do cliente que realizará a compra: ");
                        codCliente = input.nextLine();
                    } while(codCliente.equals(""));
                    
                    do{
                        System.out.print("Código do produto comprado: ");
                        codProduto = input.nextLine();
                    } while(codProduto.equals(""));
                    
                    int stockDisponivel = loja.consultarStock(codProduto);
                    
                    while(!codProduto.equalsIgnoreCase("Terminar")){
                        if(stockDisponivel > 0){
                            do{
                                System.out.print("Quantidade: ");
                                quantComprada = input.nextInt();
                                input.nextInt();
                            } while(quantComprada > 0);
                            
                            if(quantComprada > stockDisponivel){
                                while(quantComprada > stockDisponivel || quantComprada == -1){
                                    System.out.println("Apenas " + stockDisponivel + " disponíveis");
                                    do{
                                        System.out.print("Quantidade(-1 para cancelar compra): ");
                                        quantComprada = input.nextInt();
                                        input.nextInt();
                                    } while(quantComprada > 0);
                                }
                                
                                if(quantComprada <= stockDisponivel){
                                    codProdComprados.add(codProduto);
                                    quantComprados.add(quantComprada);
                                }
                            } else{
                                codProdComprados.add(codProduto);
                                quantComprados.add(quantComprada);
                            }
                        } else{
                            System.out.println("Estoque de " + codProduto + " vazio");
                        }
                        
                        do{
                            System.out.print("Qual outro produto deseja comprar ('Terminar' para finalizar produtos comprados): ");
                            codProduto = input.nextLine();
                        } while(codProduto.equals(""));
                        
                        stockDisponivel = loja.consultarStock(codProduto);
                    }
                    
                    loja.realizarCompra(codCliente, codProdComprados, quantComprados);
                    
                    System.out.println("---------------------------------");
                    break;
                case "f":
                    
                    
                    System.out.println("---------------------------------");
                    break;
            }
            
            do{
                System.out.println("Menu:\na. Registrar os produtos existentes para venda\nb. Imprimir os detalhes dos produtos\nc. Pesquisar um dado produto\nd. Registrar clientes\ne. Registrar as compras dos clientes\nf. Imprimir para cada cliente os detalhes das suas compras\ng. Imprimir o valor total das compras em euros\ng. Encerrar");
                option = input.nextLine();
            } while(!option.equalsIgnoreCase("a") && !option.equalsIgnoreCase("b") && !option.equalsIgnoreCase("c") && !option.equalsIgnoreCase("d") && !option.equalsIgnoreCase("e") && !option.equalsIgnoreCase("f") && !option.equalsIgnoreCase("g"));
        }
    }
}
