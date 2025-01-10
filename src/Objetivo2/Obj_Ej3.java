package Objetivo2;

public class Obj_Ej3 {
    public static void main(String[] args) {
        System.out.println("Cómo te llamas?");
        String nombre = System.console().readLine();
        System.out.println("Cuántos años tienes?");
        String edad = System.console().readLine();
        System.out.println("Entonces te llamas " + nombre + " y tienes " + edad + " años.");
    }
}
