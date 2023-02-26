// El programa le pide al usuario indicar el tamaño de una línea de puntos (un número entero), tras eso, se genera el resultado usando un bucle while.
// Importamos la clase Scanner, necesaria para leer la entrada del usuario.
import java.util.Scanner; 
// Creamos la clase LineaDePuntosWhile, donde estará el código del programa
public class LineaDePuntosWhile { 
  public static void main(String[] args) {
    // Definimos el Scanner, le puse de nombre: scanner
    Scanner scanner = new Scanner(System.in);
    
    // Imprimimos por pantalla que queremos saber el número de puntos que el usuario desea generar.
    System.out.print("¿Cuántos puntos quieres? ");
    
    // Creamos una variable para guardar el valor de puntos.
    int x = scanner.nextInt();
    
    // Creamos una variable que nos lleve la cuenta de cuantos puntos hemos puesto, por ahora no hemos puesto ninguno, así que vale 0
    int contador = 0;
    
    // Usamos un bucle while, con la condición: Si la variable contador ES MÁS PEQUEÑA que la variable X, se ejecutará
    while (contador < x) {
      System.out.print(".");  // Imprimimos un punto (sin salto de línea)      
      // System.out.println("."); así se imprimiría con salto de línea
      contador++; // Sumamos el valor del contador, contador +1, ya que hemos impreso un punto
  } // Llegará un momento dónde la condición no se cumplirá, ahí acabará el bucle y la ejecución del código
}
}
