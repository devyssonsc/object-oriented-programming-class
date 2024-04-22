
/**
 * Escreva uma descrição da classe Modalidade aqui.
 * 
 * @author Devysspm S. Cardoso
 * @version 09/04/2024
 */
public class Modalidade
{
    //Variáveis de instância
    private String nomeMod;
    private int numPrat;
    
    //Construtor
    public Modalidade(String newName)
    {
        nomeMod = newName;
        numPrat = 0;
    }
    
    //Métodos de instância
    public String getNomeMod()
    {
        return nomeMod;
    }
    
    public int getNumPrat()
    {
        return numPrat;
    }
    
    public void setNumPrat(int numPrat)
    {
        this.numPrat += numPrat;
    }
    
    public String toString()
    {
        return "Modalidade: " + nomeMod + " Nº de praticantes: " + numPrat;
    }
}
