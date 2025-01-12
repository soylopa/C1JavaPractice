package Obj5;

public class Obj5_Ej1 {
    public static void main(String[] args) {
        String cadenaEspacios = "En algun lugar de la mancha";
        String [] arrayCadenas = cadenaEspacios.split(" ");
        System.out.println(arrayCadenas[0]);
        System.out.println(arrayCadenas[1]);
        System.out.println(arrayCadenas[2]);
        System.out.println(arrayCadenas[3]);
        System.out.println(arrayCadenas[4]);
        System.out.println(arrayCadenas[5]);
        System.out.println();
        String cadenaSeparadores = "Casa,Perro,Gato,Pájaro,Balón";
        arrayCadenas= cadenaSeparadores.split(",");
        System.out.println(arrayCadenas[0]);
        System.out.println(arrayCadenas[1]);
        System.out.println(arrayCadenas[2]);
        System.out.println(arrayCadenas[3]);
        System.out.println(arrayCadenas[4]);
        System.out.println(arrayCadenas[5]);
    }
}
