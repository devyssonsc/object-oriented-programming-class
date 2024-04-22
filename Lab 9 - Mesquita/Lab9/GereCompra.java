
import java.util.ArrayList;
/**
 * Lab 9.
 * 
 * @author João Mesquita & Devysson Cadoso
 * @version Abril de 2024
 */
public class GereCompra
{
    private ArrayList< Cliente > clientes;
    private ArrayList< Produto > produtos;

    /**
     * Construtor para objetos da classe GereCompras
     */
    public GereCompra()
    {
        clientes = new ArrayList<>();
        produtos = new ArrayList<>();
    }
    
    /**
     * @param cliente
     */
    public void setCliente( Cliente cliente )
    {
        clientes.add( cliente );
    }
    
    /**
     * @param produto
     */
    public void setProduto( Produto produto )
    {
        produtos.add( produto );
    }
    
    /**
     * @param código do produto a procurar
     */
    public Produto pesquisaProduto( String procura )
    {
        int i = 0;
        while ( i < produtos.size() && !produtos.get( i ).getCodigo().equals( procura ) ) {
            i++;
        }
        if ( i == produtos.size() ) {
            return null;
        }
        return produtos.get( i );
    }
    
    /**
     * @param código do cliente a procurar
     */
    public Cliente pesquisaCliente( String procura )
    {
        int i = 0;
        while ( i < clientes.size() && !clientes.get( i ).getCodigoCli().equals( procura ) ) {
            i++;
        }
        if ( i == clientes.size() ) {
            return null;
        }
        return clientes.get( i );
    }
    
    /**
     * Método para iprimir os detalhes dos produtos
     */
    public void imprimeProdutos()
    {
        for ( Produto i : produtos ) {
            System.out.println( "****************************************" );       
            System.out.println( i ); // i.toString() - O método toString() funciona por omissão
        }
    }
    
    /**
     * Método para imprimir para cada cliente os detalhes das suas compras
     */
    public void imprimeClientes()
    {
        for ( Cliente i : clientes ) {
            System.out.println( "" );
            System.out.println( "****************************************" );
            System.out.println( i );
            i.imprimeComprasPorCliente();
            System.out.println( "****************************************" );
        }
    }
}
