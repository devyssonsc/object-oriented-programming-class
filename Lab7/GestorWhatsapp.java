
/**
 * Escreva uma descrição da classe GestorWhatsapp aqui.
 * 
 * @author Devysson S. Cardoso
 * @version 19.03.2024
 */
 
public class GestorWhatsapp
{
    public Contacto[] contactos;
    int qtdContactos = 0;
    int total;
    
    //Constructor
    public GestorWhatsapp(int num)
    {
        contactos = new Contacto[num];
    }
    
    /**
     * @param recieve a String and a interger that will be the name and the number of the contact
     */
    public void insereContacto(String novoNome, int novoTelm)
    {
        contactos[qtdContactos++] = new Contacto(novoNome, novoTelm);
    }
    
    public int pesquisarContacto(int telm)
    {
        int indiceEncontrado = 999;
        for (int i = 0; i < qtdContactos; i++){
            if (telm == contactos[i].getNumTelm()){
                return indiceEncontrado;
            }
        }
        
        return -1;
    }
    
    /**
     * @param recieve a interger and a String that will be the number and the new name of the contact
     */
    public void alterarNome(int telm, String novoNome)
    {
        int indiceEncontrado = 999;
        
        
        for (int i = 0; i < qtdContactos; i++){
            if (telm == contactos[i].getNumTelm()){
                indiceEncontrado = i;
            }
        }
        
        if (indiceEncontrado == 999){
            System.out.println("Número não encontrado");    
        } else{
            contactos[indiceEncontrado].setNome(novoNome);
        }
    }
    
    /**
     * print all the contacts
     */
    public void imprimirContacto()
    {
        for(int i = 0; i < qtdContactos; i++){
            System.out.print((i + 1) + ". ");
            System.out.println(contactos[i].toString());
        }
    }
    
    /**
     * print a contact
     */
    public void imprimeContato(int telm, String qlLista)
    {
        int indiceEncontrado = 999;
        for (int i = 0; i < qtdContactos; i++){
            if (telm == contactos[i].getNumTelm()){
                indiceEncontrado = i;
            }
        }
    
        if (indiceEncontrado != 999){
            System.out.println(contactos[indiceEncontrado].toString());
        }
    }
}
