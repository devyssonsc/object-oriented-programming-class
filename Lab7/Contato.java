/**
 * Escreva uma descrição da classe Contato aqui.
 * 
 * @author Devysson S. Cardoso 
 * @version 18.03.2024
 */
public class Contato
{
    //instance variables
    private String nome;
    private int numTelm;
    
    //class variables
    private static String tipoContato = "Amigos";
    
    //constructor
    /**
     * @param recieve a String and interger that will be used to construct a object
     */
    public Contato(String nome, int numTelm)
    {
        this.nome = nome;
        this.numTelm = numTelm;
    }
    
    //class mathods
    //get methods
    /**
     * @return a String that is the type of the contacts
     */
    public static String getTipoC()
    {
        return tipoContato;
    }
    
    //instance methods
    public String toString()
    {
        return "Nome: " + nome + " - " + "Número do telemóvel: " + numTelm;
    }
    
    //get methods
    
    /**
     * @return a String that is the Name of the contact
     */
    public String getNome()
    {
        return nome;
    }
    
    /**
     * @return a integer that is the number of the contact
     */
    public int getNumTelm()
    {
        return numTelm;
    }
    
    //set methods
    /**
     * @param recieve a String that will be the new name of the contact
     */
    public void setNome(String nome)
    {
        this.nome = nome;
    }
}//class end
