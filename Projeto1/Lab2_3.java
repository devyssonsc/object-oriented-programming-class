
/**
 * Escreva uma descrição da classe Lab2_3 aqui.
 * 
 * @author Devysson S. Cardoso
 * @version 06/03/2024
 */
import java.util.Scanner;
public class Lab2_3
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner (System.in);
        String[] names = new String[20];
        String newName;
        String nomeBuscado;
        String nomeEliminado;
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
        
        String aux;
        for (int i = 0; i < pos; i++){
            for (int j = 0; j < pos; j++){
                if (names[j].compareToIgnoreCase(names[i]) > 0){
                    aux = names[i];
                    names[i] = names[j];
                    names[j] = aux;
                }
            }
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
        
        System.out.print("Digite o nome que quer eliminar: ");
        nomeEliminado = input.nextLine();
        
        while (!nomeEliminado.equalsIgnoreCase("Terminar")){
            int e = 0;
            while (e < pos){
                for (int i = 0; i < pos; i++){
                    if (names[i].equalsIgnoreCase(nomeEliminado)){
                        e++;
                    }
                    names[i] = names[e];
                    e++;
                }
                pos--;
            }
            
            for (int i = 0; i < pos; i++){
                System.out.println(names[i]);
            }
        
            System.out.print("Digite o nome que quer eliminar: ");
            nomeEliminado = input.nextLine();
        }
    }//fim do main
}// fim da classe
