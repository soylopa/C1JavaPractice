package Obj5;
import java.util.ArrayList;
import java.util.List;
public class Obj5_Ej5 {
    public static void main(String[] args) {
        List<Integer> numeros= new ArrayList<Integer>(List.of(1,2,3));
        System.out.println("Lista original: " + numeros.get(0)+ ", "+ numeros.get(1)+  ", " +numeros.get(2));
        System.out.println("Tamaño original: " + numeros.size());
        numeros.add(4);
        numeros.add(5);
        System.out.println("Tamaño modificado: " + numeros.size());
        System.out.println("Lista modificada: " + numeros.get(0)+ ", "+ numeros.get(1)+  ", " +numeros.get(2) + ", " +numeros.get(3)+ ", " +numeros.get(4));
        numeros.add(0,0);
        numeros.add(3,999);
        System.out.println("Tamaño modificado: " + numeros.size());
        System.out.println("Lista modificada: " + numeros.get(0)+ ", "+ numeros.get(1)+  ", " +numeros.get(2) + ", " +numeros.get(3)+ ", " +numeros.get(4));
    }
}
