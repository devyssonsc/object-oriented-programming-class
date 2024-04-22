
/**
 * Escreva uma descrição da classe Compra aqui.
 * 
 * @author Devysson S. Cardoso
 * @version 10/04/2024
 */
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
public class Compra
{
    DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd-MMMM-yyyy");
        
    private String dataHoje;
    private ArrayList<DetalhesCompra> listaDetalhesCompras;
    private double valorTotal;
    
    public Compra()
    {
        dataHoje = LocalDate.now().format(formatador);
        listaDetalhesCompras = new ArrayList<DetalhesCompra>();
        valorTotal = 0;
    }
    
    
}//fim da classe
