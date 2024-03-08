
/**
 * Escreva uma descrição da classe WelcomeToJava5 aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class WelcomeToJava5
{
    public static void main (String[] args)
    {
    	nPrintln("Welcome to Java!", 5);
    }
    public static void nPrintln (String message, int n)
    {
	for (int i = 0; i < n; i++){
		System.out.println(message);
	}
    }
}
