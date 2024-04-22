package Lab9;
import java.util.ArrayList;
import java.time.LocalDate;
/**
 * Lab 9.
 * 
 * @author João Mesquita & Devysson Cadoso
 * @version Abril de 2024
 */
public class Compra
{
    private LocalDate data;
    private ArrayList< DetalheCompra > detalhesCompra;
    private double valorTotal;

    /**
     * Construtor para objetos da classe Compras
     */
    public Compra( LocalDate data )
    {
        this.data = data;
        detalhesCompra = new ArrayList<>();
        valorTotal = 0;
    }
    
    /**
     * @param valor a acrescentar ao valor total da compra
     */
    public void setValorTotal( double valor )
    {
        valorTotal = valorTotal + valor;
    }
    
    /**
     * @param detalhes da compra (referência e quantidade comprada do produto)
     */
    public void setDetalhesCompra( DetalheCompra refQtd )
    {
        detalhesCompra.add(refQtd);
    }
    
    /**
     * Imprime detalhes de cada compra
     */
    public void imprimeInfoCompra()
    {   
        for ( DetalheCompra i : detalhesCompra ) {
            System.out.println( i ); // i.toString() - O método toString() funciona por omissão
        }   
    }
    
    /**
     * @return o a data e os valor total da compra
     */
    public String toString()
    {
        return "Data da compra: " + data + " | Valor total da compra: " + valorTotal;
    }
}
