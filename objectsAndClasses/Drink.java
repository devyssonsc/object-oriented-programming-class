
/**
 * Escreva uma descrição da classe Drink aqui.
 * 
 * @author Devysson S. Cardoso
 * @version (um número da versão ou uma data)
 */
public class Drink
{
    //instance methods
    //Geters and setters
    /**
     * 
     * @return a String tha is the type of the package
     */
    public String getPackageType()
    {
        return packageType;
    }
    
    public String getFlavour()
    {
        return flavour;    
    }
    
    public double getPrice()
    {
        return price;
    }
    
    public short getStock()
    {
        return stock;
    }
    
    public void setStock(short newStock)
    {
        stock = newStock;
    }
    
    public void setPrice(double price)
    {
        this.price = price;
    }
    
    public void setFlavour(String flavour)
    {
        this.flavour = flavour;
    }
    
    public void setPackageType(String packageType)
    {
        this.packageType = packageType;
    }
    //instance variables
    private String packageType;
    private String flavour;
    private double price;
    private short stock;
    
    //class variables
    private static String brand = "Compal";
    
    public Drink(String pType, String flav, double price)
    {
        packageType = pType;
        flavour = flav;
        this.price = price;
        stock = 0;
    }
    
    public Drink() //Overloading polymorphism
    {
        packageType = "";
        flavour = "";
        this.price = 0.0;
        stock = 0;
    }
    
    //class method
    /**
     * method to print brand
     */
    public static String getBrand()
    {
        return brand;
    }
}
