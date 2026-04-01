import java.util.Scanner;

public class Salario {
    public static void main(String[]args){

    Scanner scanner = new Scanner(System.in); 

   final Integer valorHora = 25;
   final Integer valorHoraextra = 35;
   Integer salario;
   Integer horas;
   Integer horasExtras;

   System.out.println("ingrese la cantidad de horas trabajadas");
   horas = scanner.nextInt();
   System.out.println("trabajo horas extras?");
   boolean extras = scanner.nextBoolean();
    if(extras == true){
        System.out.println("cuantas horas extras trabajo");
        horasExtras = scanner.nextInt();
        salario = horas * valorHora + horasExtras * valorHoraextra;

        System.out.println("su salario es:" + salario);

    }else{
        salario = horas * valorHora;
        System.out.println("su salario es:" + salario);
    }    
}
}