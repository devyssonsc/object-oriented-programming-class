
/**
 * Escreva uma descrição da classe Teste aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Teste
{
    public static void main(String[] args)
    {
        Drink d1 = new Drink("bottle", "apple", 1);
        System.out.println("address on the first drink" + d1);
        
        Drink d2 = new Drink("package", "banana", 2);
        System.out.println("address on the second drink" + d2);
        
        d1.printFlavour();
        d2.printFlavour();
    }
}
