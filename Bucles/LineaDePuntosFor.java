// El programa le pide al usuario indicar el tamaño de una línea de puntos (un número entero), tras eso, se genera el resultado usando un bucle for.
// Importamos la clase Scanner, necesaria para leer la entrada del usuario.
import java.util.Scanner; 
// Creamos la clase LineaDePuntosFor, donde estará el código del programa
public class LineaDePuntosFor { 
  public static void main(String[] args) {
    // Definimos el Scanner, le puse de nombre: scanner
    Scanner scanner = new Scanner(System.in);
    
    // Imprimimos por pantalla que queremos saber el número de puntos que el usuario desea generar.
    System.out.print("¿Cuántos puntos quieres? ");
    
    // Creamos una variable para guardar el valor de puntos.
    int x = scanner.nextInt();
    
    // Creamos un bucle for: inicialización (int i = 0), condición (i < x), incremento (i++)
    /* El bucle for se ejecutará cuando la i valga:
        i = 0;
        ...
        ...
        ...
        i = x-1;
    */
    for (int i = 0 ; i < x ; i++) {
      System.out.print("."); // Imprimimos un punto y un salto de línea.
    }
  }
}
