
/**
 * Escreva uma descrição da classe Lab21 aqui.
 * 
 * @author Devysson S. Cardoso 
 * @version 05/03/2024
 */
import java.util.Scanner;
public class Lab2_1
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);
        String[] names = new String[20];
        String newName;
        String nomeBuscado;
        int pos = 0;
        
        do{
            System.out.print("Digite um nome: ");
            newName = input.nextLine();
        } while (newName.equals(""));
        
        while (pos < 20 && !newName.equalsIgnoreCase("Terminar")){
            int k = 0;
            
            while (k < pos && !newName.equalsIgnoreCase(names[k])){
                k++;
            }
            
            if (k == pos){
                names[pos] = newName;
                pos++;
            } else {
                System.out.println("Este nome já está na lista");
            }
            
            do{
                System.out.print("Digite um nome: ");
                newName = input.nextLine();
            } while (newName.equals(""));
        }
        
        for (int i = 0; i < pos; i++){
                System.out.println(names[i]);
            }
            
        System.out.print("Digite o nome que quer buscar: ");
        nomeBuscado = input.nextLine();
        
        
        while (!nomeBuscado.equalsIgnoreCase("Terminar")){
            int x = 0;
            while (x < pos && !nomeBuscado.equalsIgnoreCase(names[x])){
                x++;
            }
           
            if (x < pos){
                    System.out.println("O nome existe");
                } else{
                    System.out.println("O nome não existe");
            }
            System.out.print("Digite o nome que quer buscar: ");
            nomeBuscado = input.nextLine();
        }
    }//fim do método
}//fim da classe
