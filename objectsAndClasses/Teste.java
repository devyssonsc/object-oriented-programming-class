
/**
 * Escreva uma descrição da classe Teste aqui.
 * 
 * @author Devysson S. Cardoso
 * @version (um número da versão ou uma data)
 */
import java.util.Scanner;
public class Teste
{
    public static void main(String[] args)
    {
        System.out.println("Brand :" + Drink.getBrand());
        Scanner input = new Scanner(System.in);
        System.out.print("Tipo da embalagem: ");
        String pType = input.nextLine();
        
        System.out.print("Sabor: ");
        String flav = input.nextLine();
        
        System.out.print("Preço: ");
        double pric = input.nextDouble();
        
        Drink drink1 = new Drink(pType, flav, pric);
        
        System.out.println(drink1.getFlavour());
        drink1.setStock((short)50);
        
        String packageT = drink1.getPackageType();
        System.out.println(packageT);
        
        System.out.println("Brand :" + drink1.getBrand());
        
        Drink drink2 = new Drink();
        drink2.setFlavour("orange");
        drink2.setPackageType("pack");
        drink2.setPrice(1.8);
        
        System.out.println(drink2.getPackageType());
        System.out.println(drink2.getFlavour());
        System.out.println(drink2.getPrice());
        System.out.println(drink2.getStock());
    }
}
