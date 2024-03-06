
/**
 * Escreva uma descrição da classe Metodos aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Metodos
{
    public static int somar(int i1, int i2)
    {
        int soma = 0;
        for(int i = i1;i <= i2; i++){
           soma += i; 
        }
        return soma;
    }
    
    public static void main(String[] args)
    {
        System.out.println("Soma de 1 a 10: " + somar(1, 10));
        System.out.println("Soma de 20 a 30: " + somar(20, 30));
        System.out.println("Soma de 35 a 45: " + somar(35, 45));
    }
}
