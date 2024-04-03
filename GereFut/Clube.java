
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
    String nomeCLube;
    int numJog;
    ArrayList <Jogador> jogadores = new ArrayList<Jogador>();
    int totalJ;
    
    //instance methods
    public void registaJogador(Jogador novoJ)
    {
        jogadores.add(novoJ);
    }
    
    public int pesquisaJog(String nome, byte numero)
    {
        for(Jogador jogador:jogadores){
            if(nome.equalsIgnoreCase(jogador.getNome()) && numero == jogador.getNumero()){
                return jogadores.indexOf(jogador);
            }
        }
        return -1;
    }
    
    public void imprime()
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
    
    public void registaCartao(String nome, byte num)
    {
        int indice = pesquisaJog(nome, num);
        jogadores.get(indice).setCartoes((short) 1);
    }
    
    public void totalJ()
    {
        System.out.println(jogadores.size() + " jogadores");
    }
}
