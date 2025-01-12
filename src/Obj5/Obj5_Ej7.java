package Obj5;
import java.util.HashMap;
public class Obj5_Ej7 {
    public static void main(String[] args) {
        HashMap<String,String> diasIngles= new HashMap<String,String>();
        diasIngles.put("Lunes","Monday");
        diasIngles.put("Martes","Tuesday");
        diasIngles.put("Miércoles","Wednesday");
        diasIngles.put("Jueves","Thursday");
        diasIngles.put("Viernes","Friday");
        diasIngles.put("Sábado","Saturday");
        diasIngles.put("Domingo","Sunday");

        System.out.println("Números de elementos del diccionario: " + diasIngles.size());

        System.out.println("Martes: "+ diasIngles.get("Martes"));
        System.out.println("Sábado: "+ diasIngles.get("Sábado"));
        System.out.println("¿Está el viernes?: "+ diasIngles.containsKey("Viernes"));
        diasIngles.remove("Viernes");
        System.out.println("¿Está el viernes?: "+ diasIngles.containsKey("Viernes"));
        System.out.println("¿Está el Sunday?: "+ diasIngles.containsValue("Sunday"));
        diasIngles.remove("Domingo");
        System.out.println("¿Está el Sunday?: "+ diasIngles.containsValue("Sunday"));

        System.out.println("Números de elementos del diccionario: " + diasIngles.size());
        diasIngles.clear();
        System.out.println("Números de elementos del diccionario: " + diasIngles.size());
    }
}
