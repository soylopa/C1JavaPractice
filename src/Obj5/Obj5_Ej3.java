package Obj5;
import java.util.ArrayList;
import java.util.List;
public class Obj5_Ej3 {
    public static void main(String[] args) {
        List<Integer> numeros= new ArrayList<Integer>(List.of(1,2,3,4));
        System.out.println(numeros.get(0));
        System.out.println(numeros.get(1));
        System.out.println(numeros.get(2));
        System.out.println(numeros.get(3));
        
        List<String> listaCadenas = new ArrayList<String>(List.of("Hola","Qué tal?","Estoy aprendiendo Java"));
        System.out.println(listaCadenas.get(0));
        System.out.println(listaCadenas.get(1));
        System.out.println(listaCadenas.get(2));
        System.out.println(listaCadenas.get(3));
    }
}
