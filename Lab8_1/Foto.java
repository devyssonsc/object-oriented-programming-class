
/**
 * Escreva uma descrição da classe Foto aqui.
 * 
 * @author Devysson S. Cardoso
 * @version 20.03.2024
 */
public class Foto
{
    //instance variables
    private String desc;
    private String link;
    private int bytes;
    private String tag;
    
    //constructor
    public Foto(String desc, String link, int bytes, String tag){
        this.desc = desc;
        this.link = link;
        this.bytes = bytes;
        this.tag = tag;
    }
    
    //instance methods
    public String toString()
    {
        return "Descrição: " + desc + " Link: " + link + " Tamanho: " + bytes + " bytes Tag: " + tag;
    }
    
    //---GET---
    public String getDesc()
    {
        return desc;
    }
    
    public String getLink()
    {
        return link;
    }
    
    public int getBytes()
    {
        return bytes;
    }
    
    public String getTag()
    {
        return tag;
    }
    
    //---SET---
    public void setLink(String newLink)
    {
        link = newLink;
    }
}
