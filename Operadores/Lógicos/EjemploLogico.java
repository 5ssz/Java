import java.util.Scanner;
public class EjemploLogico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Escribe el valor de la primera variable (true o false): "); 
        boolean primeraVariable = scanner.nextBoolean();
        System.out.print("Escribe el valor de la segunda variable (true o false): ");
        boolean segundaVariable = scanner.nextBoolean();

   /*
   NOT:
        Si es true --> false
        Si es false --> true
   */
        System.out.println("NOT en la primera variable: " + (!primeraVariable));
        System.out.println("NOT en la segunda variable: " + (!segundaVariable));

    /* AND:
    Las dos variables deben ser true para que sea true, en cualquier otro caso, es false
    */

        System.out.println("AND: " + (primeraVariable && segundaVariable));
    /* OR:
    Mientras que al menos una sea true, será true
    Es decir, solo será falsa cuando las dos variables sean falsas
    */
        System.out.println("OR: " + (primeraVariable || segundaVariable));
    }
}
