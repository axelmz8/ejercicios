import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    System.out.println("ingrese una la nota");
    
    Integer nota = scanner.nextInt();

    if (nota > 9) {
        System.out.println("excelente");
    } else if (nota > 6) {
        System.out.println("muy bien");
    } else {
        System.out.println("reprobado");
    }
    }
    }
