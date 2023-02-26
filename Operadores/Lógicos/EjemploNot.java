// El programa le pide al usuario poner true o false, entonces lo niega usando el operador lógico NOT y lo imprime por pantalla
// Importamos la clase Scanner, necesaria para leer la entrada del usuario.
import java.util.Scanner;

public class EjemploNot { // Creamos la clase EjemploNot, donde estará el código del programa
  public static void main(String[] args) {
    // Definimos el Scanner, le puse de nombre: scanner
    Scanner scanner = new Scanner(System.in);
    
    // Declaramos la variable de tipo boolean con nombre: variable
    System.out.print("true o false? ");
    // Creamos una variable para guardar el valor del usuario
    boolean variable = scanner.nextBoolean();
    System.out.println("Entonces usando el NOT sale: " + !variable); // Imprimimos el valor que nos han puesto, pero negado (y un salto de línea)
    // Es decir:
    // Si es true--> false  
    // Si es false--> true
  }
}
