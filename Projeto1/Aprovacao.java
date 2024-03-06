
/**
 * Escreva uma descrição da classe Aprovacao aqui.
 * 
 * @author Devysson S. Cardoso 
 * @version 06/03/2024
 */
public class Aprovacao
{
    public static void main(String[] args)
    {
        char grade = calculateGrade((float)78.5);
        char grade2 = calculateGrade((float)59.5);
        System.out.println("The grade is " + grade);
        System.out.println("The grade is " + grade2);
    }//fim do main
    
    public static char calculateGrade(float score)
    {
        if (score >= 90.0){
            return 'A';
        } else if (score >= 80.0){
            return 'B';
        } else if (score >= 70.0){
            return 'C';
        } else if (score >= 60.0){
            return 'D';
        } else {
            return 'F';
        }
    }//fim do calculateGrade
}//fim da classe
