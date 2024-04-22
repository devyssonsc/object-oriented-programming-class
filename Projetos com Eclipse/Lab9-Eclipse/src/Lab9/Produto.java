package Lab9;
/**
 * Lab 9.
 * 
 * @author João Mesquita & Devysson Cadoso
 * @version Abril de 2024
 */
public class Produto
{
    private String codProduto;
    private String descricao;
    private int quantStock;
    private double preco;

    /**
     * Construtor para objetos da classe Produto
     */
    public Produto( String codProduto, String descricao, int quantStock, double preco )
    {
        this.codProduto = codProduto;
        this.descricao = descricao;
        this.quantStock = quantStock;
        this.preco = preco;
    }
    
    /**
     * @return o código do produto
     */
    public String getCodigo()
    {
        return codProduto;
    }
    
    /**
     * @return o stock do produto
     */
    public int getQuantStock()
    {
        return quantStock;
    }
    
    /**
     * @return o preço do produto
     */
    public double getPreco()
    {
        return preco;
    }
    
    /**
     * @param novo stock do produto
     */
    public void setQuantStock( int quantComprada )
    {
        quantStock = quantStock - quantComprada;
    }
    
    /**
     * @return todos os detalhes do produto
     */
    public String toString()
    {
        return "[" + codProduto + "] O produto " + descricao + " custa " + preco + "€ e há " + quantStock + " em stock.";
    }
}
