package Obj7;
import java.util.*;
public class Obj7_Ej1 {
    public static void main(String[] args) {
        List<Integer> valores = new ArrayList<Integer>(List.of(1,2,3,4,5,6,7,8,9,0));
        int i= 0;
        boolean recorrido = false;
        while (!recorrido) {
            System.out.println(valores.get(i) + " ");
            i = i+1;
            if (i==valores.size()) {
                recorrido=true;
                
            }
            
            System.out.println();
        }
    }
}
