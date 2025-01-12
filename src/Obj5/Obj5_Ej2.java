package Obj5;
import java.util.Arrays;
public class Obj5_Ej2 {
    public static void main(String[] args) {
        Integer [] arrayEnteros = {5,10,15,20,25,30};
        System.out.println("Original: "+ arrayEnteros[0] + ", " +  arrayEnteros[1] + ", " +  arrayEnteros[2] + ", " +  arrayEnteros[3] + ", " + arrayEnteros[4] + ", "+ arrayEnteros[5]  );
        arrayEnteros[1] = 43;
        arrayEnteros[4] = arrayEnteros[0]-3;
        System.out.println("Número de elementos: " + arrayEnteros.length);
        System.out.println("Original: "+ arrayEnteros[0] + ", " +  arrayEnteros[1] + ", " +  arrayEnteros[2] + ", " +  arrayEnteros[3] + ", " + arrayEnteros[4] + ", "+ arrayEnteros[5]  );
        Arrays.sort(arrayEnteros);
        System.out.println("Ordenados: "+ arrayEnteros[0] + ", " +  arrayEnteros[1] + ", " +  arrayEnteros[2] + ", " +  arrayEnteros[3] + ", " + arrayEnteros[4] + ", "+ arrayEnteros[5]  );
        System.out.println("Posición del elemento 90: " + Arrays.asList(arrayEnteros).indexOf(90));
        System.out.println("Posición del elemento 15: " + Arrays.asList(arrayEnteros).indexOf(15));
    }
}
