package Obj8;

public class Obj8_Ej2 {
    static void esMayorQueCero(int valor){
        if(valor>0){
            System.out.println("El valor introducido es mayor que cero");
        }
        else{
            System.out.println("El valor introducido es menor que cero");
        }
    }
    public static void main(String[] args) {
        System.out.println("Introduce un número: ");
        int valorLeido= Integer.parseInt(System.console().readLine());
        esMayorQueCero(valorLeido);
    }
}
