
/**
 * Escreva uma descrição da classe Lab5_4 aqui.
 * 
 * @author Devysson S. Cardoso 
 * @version 08/03/2024
 */
public class Lab5_4
{
    public static void main(String[] args)
    {
        imprimePrimos(7);
    }//fim do main
    
    public static void imprimePrimos (int n)
    {
        for(int i = 1; i <= n; i++){
            if (ePrimo(i) == true){
                System.out.println(i);
            }
        }
    }
    
    public static boolean ePrimo(int num)
    {
        if (num <= 1){
            return false;
        } else if (num == 2){
            return true;
        } else if (num % 2 == 0){
            return false;
        }else{
            double raiz = Math.sqrt(num);
            for (int i = 2; i <= raiz; i++){
                if (num % i == 0){
                    return false;
                }
            }
        }
        
        return true;
    }
}//fim da classe
