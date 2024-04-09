
/**
 * Escreva uma descrição da classe Clube aqui.
 * 
 * @author Devysson S. Cardoso
 * @version 03.04.2024
 */
import java.util.ArrayList;
public class Clube
{
    //instance variables
    private String nomeClube;
    private int numJog;
    private ArrayList <Jogador> jogadores;
    private int totalJ;     //perguntar sobre enunciado
    
    //constructor
    public Clube(String nomeClube, int tam)
    {
        this.nomeClube = nomeClube;
        numJog = 0;
        jogadores = new ArrayList<Jogador>(tam);
        totalJ = tam;
    }
    
    //instance methods
    public void registrarJogador(Jogador novoJ)
    {
        if(jogadores.size() < totalJ){
            jogadores.add(novoJ);
        } else{
            System.out.println("O clube chegou ao seu limite de jogadores " + "(" + totalJ + ")");
        }
    }
    
    public int pesquisarJog(String nome, byte numero)
    {
        for(Jogador jogador:jogadores){
            if(nome.equalsIgnoreCase(jogador.getNome()) && numero == jogador.getNumero()){
                return jogadores.indexOf(jogador);
            }
        }
        return -1;
    }
    
    public void imprimir()
    {
        for(Jogador jogador:jogadores){
            System.out.println((jogadores.indexOf(jogador) + 1) + "-" + jogador);//.toString();
        }
    }
    
    public void contaC()
    {
        int totalCartoes = 0;
        for(Jogador jogador:jogadores){
            totalCartoes += jogador.getCartoes();
        }
        System.out.println(totalCartoes + " cartões");
    }
    
    public void registrarCartao(String nome, byte num)
    {
        int indice = pesquisarJog(nome, num);
        jogadores.get(indice).setCartoes((short) 1);
    }
    
    public void totalJ()
    {
        System.out.println(jogadores.size() + " jogadores");
    }
}
