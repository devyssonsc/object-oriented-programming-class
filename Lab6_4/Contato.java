/**
 * Escreva uma descrição da classe Contato aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Contato
{
    //instance variables
    private String nome;
    private int numTelm;
    
    //class variables
    private static String tipoContato = "Amigos";
    
    //constructor
    public Contato(String nome, int numTelm)
    {
        this.nome = nome;
        this.numTelm = numTelm;
    }
    
    public String getTipoC()
    {
        return tipoContato;
    }
    
    public String getNome()
    {
        return nome;
    }
    
    public int getNumTelm()
    {
        return numTelm;
    }
    
    public void setNome(String nome)
    {
        this.nome = nome;
    }
}
