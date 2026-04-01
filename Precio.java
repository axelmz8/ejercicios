import java.util.Scanner;

public class precio {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("ingrse el precio");

    Integer precio = scanner.nextInt();
    Integer descuento = 0;
    Integer precioFinal;

    if (precio > 4999) {
        descuento = 20;
    } else if (precio > 1999) {
        descuento = 10;
    } else {
        descuento = 0;
    }
    precioFinal = precio - (precio * descuento / 100);

    System.out.println("precio original: " + precio);
    System.out.println("precio con descuento: " + precioFinal);
}

}