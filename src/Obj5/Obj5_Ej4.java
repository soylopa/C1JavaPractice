package Obj5;
import java.util.ArrayList;
import java.util.List;
public class Obj5_Ej4 {
    public static void main(String[] args) {
        List<Integer> numeros= new ArrayList<Integer>(List.of(1,2,3,4));
        System.out.println("Lista original: " + numeros.get(0)+ ", "+ numeros.get(1)+  ", " +numeros.get(2)+", " + numeros.get(3));
        System.out.println(numeros.set(0,10));
        System.out.println(numeros.set(1,11));
        System.out.println(numeros.set(2,12));
        System.out.println(numeros.set(3,13));
        System.out.println("Lista modificada: " + numeros.get(0)+ ", "+ numeros.get(1)+  ", " +numeros.get(2)+", " + numeros.get(3));
}
}