package Obj3;

public class Obj3_Ej5 {
    public static void main(String[] args) {
        System.out.println("#####División de enteros####");
        System.out.print("Dividendo: ");
        Integer dividendo = Integer.parseInt(System.console().readLine());
        System.out.print("Divisor: ");
        Integer divisor = Integer.parseInt(System.console().readLine());
        Integer resultado1 = dividendo%divisor;
        System.out.println("Resultado: " + resultado1);


       
    }
}
