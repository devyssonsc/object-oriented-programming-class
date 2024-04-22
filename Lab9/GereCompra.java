
/**
 * Escreva uma descrição da classe GereCompra aqui.
 * 
 * @author Devysson S. Cardoso
 * @version 14.04.2024
 */
import java.util.ArrayList;
public class GereCompra
{
    //Variáveis de instância
    ArrayList<Cliente> listaClientes;
    ArrayList<Produto> listaProdutos;
    
    //Construtor
    public GereCompra()
    {
        listaClientes = new ArrayList();
        listaProdutos = new ArrayList();
    }
    
    //Métodos para produtos
    public void registrarProduto(String codProduto, String descProduto, int stockProduto, double precoProduto)
    {
        listaProdutos.add(new Produto(codProduto, descProduto, stockProduto, precoProduto));
    }
    
    public void imprimirProdutos()
    {
        for(Produto produto:listaProdutos){
            System.out.println(produto);
        }
    }
    
    public int pesquisarProduto(String codProduto)
    {
        for(Produto produto:listaProdutos){
            if(codProduto.equalsIgnoreCase(produto.getCodProduto())){
                return listaProdutos.indexOf(produto);
            }
        }
        return -1;
    }
    
    public int consultarStock(String codProduto)
    {
        int indice = pesquisarProduto(codProduto);
        
        if(indice == -1){
            System.out.println("Produto não registrado");
        } else{
            return listaProdutos.get(indice).getQuantStock();
        }
        return 999;
    }
    
    //Métodos para clientes
    public void registrarCliente(String codCliente, String nomeCliente, int numContribuinte)
    {
        listaClientes.add(new Cliente(codCliente, nomeCliente, numContribuinte));
    }
    
    public void realizarCompra(String codCliente, ArrayList<String> codProdComprados, ArrayList<Integer> quantComprados){
        for(Cliente cliente:listaClientes){
            if(codCliente.equalsIgnoreCase(cliente.getCodigoCli())){
                cliente.registrarCompra(codProdComprados, quantComprados);
            }
        }
    }
}//fim da classe
