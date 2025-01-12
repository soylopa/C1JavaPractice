package Obj6;

public class Obj6_Ej3 {
    public static void main(String[] args) {
        System.out.print("Introduzca un número entero:");
        int numero1 = Integer.parseInt(System.console().readLine());
        System.out.print("Introduzca otro número entero:");
        int numero2= Integer.parseInt(System.console().readLine());
        if (numero1>numero2) {
            System.out.println("El primero número es mayor que el segundo");
        }
        else{
            if (numero2>numero1) {
                System.out.println("El segundo número es mayor que el primero");
                
            }
            else{
                System.out.println("Los dos números son iguales");
            }
        }
    }
}
