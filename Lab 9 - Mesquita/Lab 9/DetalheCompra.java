
/**
 * Lab 9.
 * 
 * @author João Mesquita & Devysson Cadoso
 * @version Abril de 2024
 */
public class DetalheCompra
{
    private String refProduto;
    private int quantComprada;

    /**
     * Construtor para objetos da classe DetalheCompra
     */
    public DetalheCompra( String refProduto, int quantComprada )
    {
        this.refProduto = refProduto;
        this.quantComprada = quantComprada;
    }
    
    /**
     * @return os detalhes da compra
     */
    public String toString()
    {
        return "Código do produto: " + refProduto + " | Quantidade: " + quantComprada;
    }
}
