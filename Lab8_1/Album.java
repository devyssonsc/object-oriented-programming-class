
/**
 * Escreva uma descrição da classe Album aqui.
 * 
 * @author Devysson S. Cardoso
 * @version 20.03.2024
 */
public class Album
{
    //instance variables
    private String nomeAlbum;
    private Foto listaFotos[];
    private int qtdFotos = 0;
    
    //constructor
    public Album(String nome)
    {
        this.nomeAlbum = nome;
        listaFotos = new Foto[100];
        qtdFotos = 0;
    }
    
    //methods
    public String getNameAlbum()
    {
        return nomeAlbum;
    }
    
    public void setNameAlbum(String novoNome)
    {
        nomeAlbum = novoNome;
    }
    
    public void inserirFotografia(String desc, String link, int bytes, String tag)
    {
        listaFotos[qtdFotos++] = new Foto(desc, link, bytes, tag);
    }
    
    public int imprimirBytesTotais()
    {
        int totalBytes = 0;
        for (int i = 0; i < qtdFotos; i++){
            totalBytes += listaFotos[i].getBytes();
        }
        return totalBytes;
    }
    
    public void imprimirFotografias()
    {
        for (int i = 0; i < qtdFotos; i++){
            System.out.println(listaFotos[i]);//.toString());
        }
    }
    

    public void imprimirDescricao(String tag)
    {
        for (int i = 0; i < qtdFotos; i++){
            if (tag.equalsIgnoreCase(listaFotos[i].getTag())){
                System.out.println(listaFotos[i].getDesc());
            }
        }
    }
    
    public int pesquisarFotografia(String desc)
    {
        for (int i = 0; i < qtdFotos; i++){
            if (desc.equalsIgnoreCase(listaFotos[i].getDesc())){
                System.out.println("A foto está na posição " + listaFotos[i]);
                return i;
            }
        }
        System.out.println("Não existe esta foto");
        return -1;
    }
    
    public void atualizarLink(String desc, String newLink)
    {
        int indice = pesquisarFotografia(desc);
        if (indice != -1){
            listaFotos[indice].setLink(newLink);
            System.out.println("\n------------------------\nLink Atualizado\n------------------------");
        }
    }
}//class end
