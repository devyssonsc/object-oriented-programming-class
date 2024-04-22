
/**
 * Escreva uma descrição da classe GereClube aqui.
 * 
 * @author Devysson S. Cardoso
 * @version 09.04.2024
 */
import java.util.ArrayList;
public class GereClube
{
    private int numPratClube;
    private String nomeClube;
    private ArrayList<Modalidade> listaModalidades;
    private int maxMods;
    
    public GereClube(String nomeClube, int maxMods)
    {
        numPratClube = 0;
        this.nomeClube = nomeClube;
        listaModalidades = new ArrayList<Modalidade>();
        this.maxMods = maxMods;
    }
    
    public void inserirModalidade(String nomeMod)
    {
        if(listaModalidades.size() < maxMods){
            listaModalidades.add(new Modalidade(nomeMod));
        } else{
            System.out.println("Número de modalidades máximo atingido: " + maxMods);
        }
    }
    
    public void imprimirPraticantesMod(String nomeMod)
    {
        for(Modalidade modalidade:listaModalidades){
            if(nomeMod.equalsIgnoreCase(modalidade.getNomeMod())){
                System.out.println(modalidade.getNumPrat() + " praticantes em " + nomeMod);
            }
        }
    }
    
    public void imprimirModalidades()
    {
        for(Modalidade modalidade:listaModalidades){
            System.out.println(modalidade);//.toString();
        }
    }
    
    public void contaP()
    {
        for(Modalidade modalidade:listaModalidades){
            numPratClube += modalidade.getNumPrat();
        }
        System.out.println("O clube " + nomeClube + " tem " + numPratClube + " praticantes");
    }
    
    public void registrarPraticante(String mod)
    {
        for(Modalidade modalidade: listaModalidades){
            if(mod.equalsIgnoreCase(modalidade.getNomeMod())){
                modalidade.setNumPrat(1);
            }
        }
    }
    
    public void imprimirMaiorMod()
    {
        int maior = -1;
        int indice = 0;
        for(Modalidade modalidade: listaModalidades){
            if(modalidade.getNumPrat() > maior){
                maior = modalidade.getNumPrat();
                indice = listaModalidades.indexOf(modalidade);
            }
        }
        
        if(maior == -1){
            System.out.println("Não há praticantes no clube ainda");
        } else{
            System.out.println(listaModalidades.get(indice).getNomeMod() + " é a modalidade com maior número de praticantes: " + listaModalidades.get(indice).getNumPrat());
        }
    }
}
