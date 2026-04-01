import java.util.Scanner; 
public class Ventadebici {

public static void main(String[] args){

Scanner scanner = new Scanner(System.in);

    Integer bici;
    Integer precio;
    Integer descuento;
    
    System.out.println("ingrese cantidad de bicicletas:");
    bici = scanner.nextInt();

    System.out.println("ingrese precio de bicicletas:");
    precio = scanner.nextInt();

    System.out.println("ingrse descuento");
    descuento = scanner.nextInt();

    Integer total = bici * precio;
    Integer toalConDescuento = total - (total * descuento )/100;

    System.out.println("el total es " + total);
    System.out.println("total con descuento " + toalConDescuento);

    scanner.close();

}



    }