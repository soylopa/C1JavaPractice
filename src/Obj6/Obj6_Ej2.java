package Obj6;
import java.util.*;
public class Obj6_Ej2 {
    public static void main(String[] args) {
        List<Integer> valores = new ArrayList<Integer>(List.of(2,5,8,9,3));
        System.out.print("Introduzca un número del 1 al 10:");
        int valor = Integer.parseInt(System.console().readLine());
        if(valores.contains(valor))
            {
                System.out.println("Valor encontrado en la lista de valores.");
            }
        else
            {
            System.out.println("Valor no encontrado en la lista de valores");
            }
    }
}
