import java.util.Scanner;

public class Perimetro {
  
    public static void main(String[] args){ 
      Scanner scanner = new Scanner(System.in); 

      Integer largo;
      Integer ancho;
      
      System.out.println("ingrese largo");
      largo = scanner.nextInt();

      System.out.println("ingrese ancho");
      ancho = scanner.nextInt();

      Integer perimetro = 2 * (largo + ancho);

      System.out.println("el perimetro es: " + perimetro);

      
    } 
}
