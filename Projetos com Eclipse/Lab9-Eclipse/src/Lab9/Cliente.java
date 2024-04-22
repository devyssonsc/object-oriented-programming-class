package Lab9;
import java.util.ArrayList;
/**
 * Lab 9.
 * 
 * @author João Mesquita & Devysson Cadoso
 * @version Abril de 2024
 */
public class Cliente
{
    private String codigoCli;
    private String nome;
    private int numContrib;
    private ArrayList< Compra > compras;

    /**
     * Construtor para objetos da classe Clientes
     */
    public Cliente( String codigoCli, String nome, int numContrib )
    {
        this.codigoCli = codigoCli;
        this.nome = nome;
        this.numContrib = numContrib;
        compras = new ArrayList<>();
    }

    /**
     * @return o código do cliente
     */
    public String getCodigoCli()
    {
        return codigoCli;
    }
    
    /**
     * @param objeto compra
     */
    public void setCompra( Compra compra )
    {
        compras.add( compra );
    }
    
    /**
     * Método para imprimir os detalhes do cliente
     */
    public void imprimeComprasPorCliente()
    {   
        for ( Compra i : compras ) {
            System.out.println( i ); // i.toString() - O método toString() funciona por omissão
            i.imprimeInfoCompra();
        }   
    }
    
    /**
     * @return todos os atributos de uma compra
     */
    public String toString()
    {
        return "[" + codigoCli + "] O cliente " + nome + " fez um total de " + compras.size() + " compras. | NIF: " + numContrib;
    }
}
