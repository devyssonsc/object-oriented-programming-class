
/**
 * Escreva uma descrição da classe GestorWhatsapp aqui.
 * 
 * @author Devysson S. Cardoso
 * @version 19.03.2024
 */
 
public class GestorWhatsapp
{
    static Contato[] contatosA = new Contato[50];
    static Contato[] contatosB = new Contato[100];
    static int qtdContatosA = 0;
    static int qtdContatosB = 0;
    /**
     * @param recieve a String and a interger that will be the name and the number of the contact
     */
    public static void insereContato(String novoNome, int novoTelm, String qlLista)
    {
        if (qlLista.equalsIgnoreCase("A")){
            contatosA[qtdContatosA] = new Contato(novoNome, novoTelm);
            qtdContatosA++;
        } else{
            contatosB[qtdContatosB] = new Contato(novoNome, novoTelm);
            qtdContatosB++;
        }
    }
    
    public static int pesquisaContato(int telm, String qlLista)
    {
        int indiceEncontrado = 999;
        if (qlLista.equalsIgnoreCase("A")){
            for (int i = 0; i < qtdContatosA; i++){
                if (telm == contatosA[i].getNumTelm()){
                    return indiceEncontrado;
                }
            }
        } else{
            for (int i = 0; i < qtdContatosB; i++){
                if (telm == contatosB[i].getNumTelm()){
                    return indiceEncontrado;
                }
            }
        }
        
        return -1;
    }
    
    /**
     * @param recieve a interger and a String that will be the number and the new name of the contact
     */
    public static void alterarNome(int telm, String novoNome, String qlLista)
    {
        int indiceEncontrado = 999;
        
        if (qlLista.equalsIgnoreCase("A")){
            for (int i = 0; i < qtdContatosA; i++){
                if (telm == contatosA[i].getNumTelm()){
                    indiceEncontrado = i;
                }
            }
            
            if (indiceEncontrado == 999){
                System.out.println("Número não encontrado");    
            } else{
                contatosA[indiceEncontrado].setNome(novoNome);
            }
        } else{
            for (int i = 0; i < qtdContatosB; i++){
                if (telm == contatosB[i].getNumTelm()){
                    indiceEncontrado = i;
                }
            }
            
            if (indiceEncontrado == 999){
                System.out.println("Número não encontrado");    
            } else{
                contatosB[indiceEncontrado].setNome(novoNome);
            }
        }
    }
    
    /**
     * print all the contacts
     */
    public static void imprimeContato(String qlLista)
    {
        if (qlLista.equalsIgnoreCase("A")){
            for(int i = 0; i < qtdContatosA; i++){
                System.out.print((i + 1) + ". ");
                System.out.println(contatosA[i].toString());
            }
        } else{
            for(int i = 0; i < qtdContatosB; i++){
                System.out.print((i + 1) + ". ");
                System.out.println(contatosA[i].toString());
            }
        }
    }
    
    /**
     * print a contact
     */
    public static void imprimeContato(int telm, String qlLista)
    {
        int indiceEncontrado = 999;
        
        if (qlLista.equalsIgnoreCase("A")){
            for (int i = 0; i < qtdContatosA; i++){
                if (telm == contatosA[i].getNumTelm()){
                    indiceEncontrado = i;
                }
            }
        
            if (indiceEncontrado != 999){
                System.out.println(contatosA[indiceEncontrado].toString());
            }
        } else{
            for (int i = 0; i < qtdContatosB; i++){
                if (telm == contatosB[i].getNumTelm()){
                    indiceEncontrado = i;
                }
            }
        
            if (indiceEncontrado != 999){
                System.out.println(contatosB[indiceEncontrado].toString());
            }
        }
    }
}
