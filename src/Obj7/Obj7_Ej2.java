package Obj7;

public class Obj7_Ej2 {
    public static void main(String[] args) {
        int valor = 0;
        boolean fin = false;
        while (!fin) {
            System.out.print("Introduzca un número mayor a 100: ");
            valor = Integer.parseInt(System.console().readLine());
            if (valor > 100) {
                fin = true;
                
            }
            else{
                System.out.println("El valor introducido es menor a 100, no es válido.");
            }
        }
        System.out.println("Fin del programa.");
    }
}
