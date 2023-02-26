import java.util.Scanner;
public class ImprimePalabra {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Escribe una palabra: ");
    String palabra = scanner.next();
    System.out.println(palabra);
  }
}
