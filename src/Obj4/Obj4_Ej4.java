package Obj4;

public class Obj4_Ej4 {
    public static void main(String[] args) {
        String cadena1 = "Hola time software";
        String cadena2 = "Esto es una cadena";
        String cadena3 = "multilínea";
        String cadenaMultilineaV1 =  cadena1.concat("\n");
        cadenaMultilineaV1 = cadenaMultilineaV1.concat(cadena2);
        
        cadenaMultilineaV1 = cadenaMultilineaV1.concat(cadena3);
        String cadenaMultilineaV2 = cadena1 + "\n" + cadena2 + "\n" + cadena3;
        System.out.println(cadenaMultilineaV1);
        System.out.println();
        System.out.println(cadenaMultilineaV2);
        String cadena4 = "La cadena tiene %s líneas. \nLa primera la ha escrito %s.\n La segunda la ha escrito %s.";
        String cadenaFinal = String.format(cadena4,3,"Alfredo","Sheila");
        System.out.println(cadenaFinal);
    }
}
