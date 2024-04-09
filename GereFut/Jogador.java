
/**
 * Escreva uma descrição da classe Jogador aqui.
 * 
 * @author Devysson S. Cardoso 
 * @version 03.04.2024
 */
public class Jogador
{
    //Instance variable
    private String nome;
    private byte numero;
    private short cartoes;
    
    //contructor
    public Jogador(String nome, byte numero)
    {
        this.nome = nome;
        this.numero = numero;
        cartoes = 0;
    }
    
    //instance methods
    public String getNome()
    {
        return nome;
    }
    
    public byte getNumero()
    {
        return numero;
    }
    
    public short getCartoes()
    {
        return cartoes;
    }
    
    public void setCartoes(short novosCartoes)
    {
        cartoes = novosCartoes;
    }
    
    public String toString()
    {
        return "Nome: " + nome + " - Número: " + numero + " - Nº de cartões: " + cartoes;
    }
}
