
/**
 * Escreva uma descrição da classe Drink aqui.
 * 
 * @author Devysson S. Cardoso
 * @version (um número da versão ou uma data)
 */
import java.util.Scanner;
public class Drink
{
    //instance variables
    String packageType;
    String flavour;
    double price;
    short stock;
        
    //class variables
    static String brand = "Compal";
    public Drink(String packageType, String flavour, double price)
    {
        this.packageType = packageType;
        this.flavour = flavour;
        this.price = price;
        stock = 0;
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Tipo da embalagem: ");
        String pType = input.nextLine();
        
        System.out.print("Sabor: ");
        String flav = input.nextLine();
        
        System.out.print("Preço: ");
        double pric = input.nextDouble();
        
        Drink drink1 = new Drink(pType, flav, pric);
        
        drink1.printFlavour();
        drink1.changeStock((short)50);
    }
    
    /**
    * method to change stock
    * @param 
    */
   
    public void changeStock(short newStock)
    {
        stock = newStock;
    }
    
    /**
    * method to print flavour
    */
   
    public void printFlavour()
    {
        System.out.println(flavour);
    }
    
    //class method
    public static void printBrand()
    {
        System.out.println(brand);
    }
}
