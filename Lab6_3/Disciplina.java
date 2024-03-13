
/**
 * Escreva uma descrição da classe Disciplina aqui.
 * 
 * @author Devysson S. Cardoso
 * @version 13.03.2024
 */
public class Disciplina
{
    //instance variables
    private String designacao;
    private String codigo;
    private byte ects;
    
    //classes variables
    private static String curso = "Engenharia Informática";
    
    public Disciplina()
    {
        designacao = "";
        codigo = "";
        ects = 0;
    }
    
    public Disciplina(String desig, String cod, byte ects)
    {
        designacao = desig;
        codigo = cod;
        this.ects = ects;
    }
    
    public void setEcts(byte ects)
    {
        this.ects = ects;
    }
    
    public String getDesignacao()
    {
        return designacao;
    }
    
    public String getCodigo()
    {
        return codigo;
    }
    
    public byte getEcts()
    {
        return ects;
    }
}
