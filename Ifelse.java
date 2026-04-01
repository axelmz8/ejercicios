import java.util.Scanner;

public class Ifelse {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("ingrese un numero:");

    Integer numero = scanner.nextInt();

    if (numero % 2 == 0) {
    System.out.println("el numero es PAR");
} else { System.out.println("el numero es impar");
    
}

    }
}