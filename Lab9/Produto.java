/**
 * Escreva uma descrição da classe Produto aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Produto
{
    //Variáveis de instância
    private String codProduto;
    private String desc;
    private int quantStock;
    private double preco;
    
    //Construtor
    public Produto(String codProduto, String desc, int quantStock, double preco)
    {
        this.codProduto = codProduto;
        this.desc = desc;
        this.quantStock = quantStock;
        this.preco = preco;
    }
    
    //Métodos de instância
    public String getCodProduto()
    {
        return codProduto;
    }
    
    public String getDesc()
    {
        return desc;
    }
    
    public int getQuantStock()
    {
        return quantStock;
    }
    
    public double getPreco()
    {
        return preco;
    }
    
    public void setQuantStock(int comprados)
    {
        quantStock -= comprados;
    }
    
    //toString();
    public String toString()
    {
        return codProduto + " - " + desc + " (Stock: " + quantStock + ") = " + preco + " Euros"; 
    }
}
