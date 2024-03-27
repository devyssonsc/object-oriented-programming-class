
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
        for (int i = 0; i < qtdContactos; i++){
            if (telm == contactos[i].getNumTelm()){
                return i;
            }
        }
        
        return -1;
    }
    
    /**
     * @param recieve a interger and a String that will be the number and the new name of the contact
     */
    public void alterarNome(int telm, String novoNome)
    {
        int result = pesquisarContacto(telm);
        
        if (result == -1){
            System.out.println("Não existe um contacto com esse número");
        } else{
            contactos[result].setNome(novoNome);
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
    public void imprimirUmContacto(int telm)
    {
        int result = pesquisarContacto(telm);
        
        if (result == -1){
            System.out.println("Não existe um contacto com esse número");
        } else{
            System.out.println(contactos[result].toString());
        }
    }
}
