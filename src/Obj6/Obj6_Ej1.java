package Obj6;

public class Obj6_Ej1 {
    public static void main(String[] args) {
        System.out.print("Escriba un número del 1 al 10:");
        int valor = Integer.parseInt(System.console().readLine());
        if(valor>10)
        {
            System.out.println("El número que has escrito es mayor a 10");
        }
        System.out.println("Has escrito el número: " + valor);
    }
}
