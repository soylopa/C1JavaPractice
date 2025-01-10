package Obj3;

public class Obj3_Ej4 {
    public static void main(String[] args) {
        System.out.println("#####División de enteros####");
        System.out.print("Dividendo: ");
        Integer dividendo = Integer.parseInt(System.console().readLine());
        System.out.print("Divisor: ");
        Integer divisor = Integer.parseInt(System.console().readLine());
        Integer resultado1 = dividendo/divisor;
        System.out.println("Resultado: " + resultado1);


        System.out.println("#####División de decimalesl####");
        System.out.print("Dividendo:");
        Float dividendo2 = Float.parseFloat(System.console().readLine());
        System.out.print("Divisor:");
        Float divisor2 = Float.parseFloat(System.console().readLine());
        float resultado3 = dividendo2/divisor2;
        System.out.println("Resultado " + resultado3);
    }
}
