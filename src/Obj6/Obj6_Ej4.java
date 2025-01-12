package Obj6;

public class Obj6_Ej4 {
    public static void main(String[] args) {
        
        System.out.println("Códigos promocionales: ORO, PLATA, BRONCE o PLATINO");
        
        System.out.print("Introduzca su código para saber su descuento:");
        String codigo = System.console().readLine();
        
        switch (codigo) {
            case "ORO":
                System.out.println("Su descuento es del 25%");
                break;
            case "PLATA":
                System.out.println("Su descuento es del 15%");
                break;
            case "BRONCE":
                System.out.println("Su descuento es del 5%");
                break;
            case "PLATINO":
                System.out.println("Su descuento es del 40%");
                break;
            default:
                System.out.println("Código promocional no válido");
                break;
        }
    }
}
