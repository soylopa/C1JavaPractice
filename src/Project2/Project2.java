package Project2;

public class Project2 {
    static void Sumar(){
        System.out.println("Inserte primera cifra: ");
        int numero1 = Integer.parseInt(System.console().readLine());
        System.out.println("Inserte segunda cifra: ");
        int numero2 = Integer.parseInt(System.console().readLine());
        System.out.println("Resultado de la suma: " + (numero1 + numero2));
    }
    static void Restar(){
        System.out.println("Inserte primera cifra: ");
        int numero1 = Integer.parseInt(System.console().readLine());
        System.out.println("Inserte segunda cifra: ");
        int numero2 = Integer.parseInt(System.console().readLine());
        System.out.println("Resultado de la suma: " + (numero1 - numero2));
    }
    static void Multiplicar(){
        System.out.println("Inserte primera cifra: ");
        int numero1 = Integer.parseInt(System.console().readLine());
        System.out.println("Inserte segunda cifra: ");
        int numero2 = Integer.parseInt(System.console().readLine());
        System.out.println("Resultado de la suma: " + (numero1 * numero2));
    }
    static void Dividir(){
        System.out.println("Inserte primera cifra: ");
        int numero1 = Integer.parseInt(System.console().readLine());
        System.out.println("Inserte segunda cifra: ");
        int numero2 = Integer.parseInt(System.console().readLine());
        System.out.println("Resultado de la suma: " + (numero1 / numero2));
    }
    static void Calculadora(){
        boolean fin = false;
        int opcion = 0;
        while (!fin) {
            System.out.println("Opción: ");
            opcion = Integer.parseInt(System.console().readLine());
            switch (opcion) {
                case 1:
                    Sumar();
                    break;
                case 2:
                    Restar();
                    break;
                case 3:
                    Multiplicar();
                    break;
                case 4:
                    Dividir();
                    break;
                case 5:
                    fin = true;
                    break;
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("******* \n Calculadora \n *************");
        System.out.println("Menú");
        System.out.println("1.-Sumar");
        System.out.println("2.- Restar");
        System.out.println("3.- Multiplicar");
        System.out.println("4.- Dividir ");
        System.out.println("5.- Salir");
        Calculadora();
        System.out.println("Programa finalizado.");
    }
}
