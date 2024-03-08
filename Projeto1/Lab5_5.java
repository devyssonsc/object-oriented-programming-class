
/**
 * Escreva uma descrição da classe Lab5_5 aqui.
 * 
 * @author Devysson S. Cardoso
 * @version 08/03/2024
 */
import java.util.Scanner;
public class Lab5_5
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int[] valores = new int[10];
        int soma = 0;
        for (int i = 0; i < 10; i++){
            System.out.print((i + 1) + "º número: ");
            valores[i] = input.nextInt();
        }
        double media = media(valores);
        System.out.println("Média: " + media);
        imprimir(valores, media);
        
        System.out.print("Qual número deseja pesquisar? ('9999' para terminar)");
        int numPesquisado = input.nextInt();
        
        while (numPesquisado != 9999){
            int pos = pesquisar(valores, numPesquisado);
            
            if (pos > -1){
                System.out.println("A primeira aparição do " + numPesquisado + " é na posição " + pos);
            } else{
                System.out.println(numPesquisado + " não está no vetor");
            }
            
            System.out.print("Qual número deseja pesquisar? ('9999' para terminar)");
            numPesquisado = input.nextInt();
        }
    }//fim do main
    
    public static double media(int[] numeros)
    {
        int soma = 0;
        for (int i = 0; i < 10; i++){
            soma += numeros[i];
        }
        double media = (double) soma / 10;
        return media;
    }//fim do media
    
    public static void imprimir(int[] numeros, double media)
    {
        System.out.println("Números menores que a média: ");
        for (int i = 0; i < 10; i++){
            if (numeros[i] < media){
                System.out.print(numeros[i] + " ");
            }
        }
        System.out.print("\n");
    }//fim do imprimir
    
    public static int pesquisar(int[]numeros, int numPesquisado)
    {
        for (int i = 0; i < 10; i++){
            if (numeros[i] == numPesquisado){
                return i;
            }
        }
        return -1;
    }
}//fim da classe
