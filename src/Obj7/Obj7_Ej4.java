package Obj7;

public class Obj7_Ej4 {
    public static void main(String[] args) {
        int valor = 0;
        do{
            System.out.print("Introduzca un número mayor que 100: ");
            valor = Integer.parseInt(System.console().readLine()); 
        }
        while(valor<=100);
        System.out.println("Fin del programa.");
    }
}
