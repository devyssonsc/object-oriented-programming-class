
/**
 * Escreva uma descrição da classe Cliente aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
import java.util.ArrayList;
public class Cliente
{
    //Variáveis de instância
    private String codigoCli;
    private String nome;
    private int numContrib;
    private int totalCompras;
    ArrayList<Compra> compras;
    
    //Construtor
    public Cliente(String codigoCli, String nome, int numContrib)
    {
        this.codigoCli = codigoCli;
        this.nome = nome;
        this.numContrib = numContrib;
        totalCompras = 0;
        compras = new ArrayList<Compra>();
    }
    
    //Métodos de instância
    public String getCodigoCli()
    {
        return codigoCli;
    }
    
    public String getNome()
    {
        return nome;
    }
    
    public int getNumContrib()
    {
        return numContrib;
    }
    
    public int getTotalCompras()
    {
        return totalCompras;
    }
    
    public void registrarCompra(ArrayList<String> codProdComprados, ArrayList<Integer> quantComprados)
    {
        compras.add(new Compra());
        totalCompras++;
        
        
    }
    
    //toString();
    public String toString()
    {
        return codigoCli + " - " + nome + " (" + numContrib + ") = " + totalCompras;
    }
}
