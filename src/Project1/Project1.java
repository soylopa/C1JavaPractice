package Project1;

public class Project1 {
    public static void main(String[] args) {
        System.out.println("***** \n Calculadora\n ************");
        System.out.println("Menú");
        System.out.println("1.-Sumar");
        System.out.println("2.- Restar");
        System.out.println("3.- Multiplicar");
        System.out.println("4.- Dividir ");
        System.out.println("5.- Salir");
        boolean fin =false;
        int opcion = 0;
        while (!fin) {
            System.out.print("Opción: ");
            opcion = Integer.parseInt(System.console().readLine());
            switch (opcion) {
                case 1:
                    System.out.println("Inserte primera cifra: ");
                    int numero1 = Integer.parseInt(System.console().readLine());
                    System.out.println("Inserte segunda cifra: ");
                    int numero2 = Integer.parseInt(System.console().readLine());
                    System.out.println("Resultado de la suma: " + (numero1 + numero2));
                    break;
                case 2:
                    System.out.println("Inserte primera cifra: ");
                    int numero3 = Integer.parseInt(System.console().readLine());
                    System.out.println("Inserte segunda cifra: ");
                    int numero4 = Integer.parseInt(System.console().readLine());
                    System.out.println("Resultado de la resta: " + (numero3 - numero4));
                    break;
                case 3:
                    System.out.println("Inserte primera cifra: ");
                    int numero5 = Integer.parseInt(System.console().readLine());
                    System.out.println("Inserte segunda cifra: ");
                    int numero6 = Integer.parseInt(System.console().readLine());
                    System.out.println("Resultado de la multiplicación: " + (numero5 * numero6));
                    break;
                case 4:
                    System.out.println("Inserte primera cifra: ");
                    int numero7 = Integer.parseInt(System.console().readLine());
                    System.out.println("Inserte segunda cifra: ");
                    int numero8 = Integer.parseInt(System.console().readLine());
                    System.out.println("Resultado de la división: " + (numero7 / numero8));
                    break;
                case 5:
                    
                    fin= true;
                    break;
                default:
                    break;
            }
        }
        System.out.println("Fin del programa.");
    }
}
