package Obj4;

public class Obj4_Ej7 {
    public static void main(String[] args) {
        String cadena = "En un lugar de la mancha";
        System.out.println("Primer carácter: " + cadena.charAt(0));
        System.out.println("Tercer carácter: " + cadena.charAt(3));
        System.out.println("Octavo carácter: " + cadena.charAt(8));
        System.out.println("Último carácter: " + cadena.charAt(cadena.length()-1));
        System.out.println("Contiene \"un\"?: " + cadena.contains("un"));
        System.out.println("Contiene \"casa\"?: " + cadena.contains("casa"));
    }
}
