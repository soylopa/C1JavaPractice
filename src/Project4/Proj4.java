package Project4;

public class Proj4 {
    static int LeerNumero(String texto){
        boolean leido= false;
        int valor=0;
        while (!leido) {
            try{
                System.out.print(texto);
                valor= Integer.parseInt(System.console().readLine());
                leido=true;
            }
            catch(Exception ex){
                System.out.println("Error: tienes que introducir un número");
            }
            
        } return valor;
    }
    static void Sumar(){
        int numero1= LeerNumero("Interte primera cifra: ");
        int numero2= LeerNumero("Interte segunda cifra: ");
        System.out.println("Resultado de la suma: " + (numero1 + numero2));
    }
    static void Restar(){
        int numero1= LeerNumero("Interte primera cifra: ");
        int numero2= LeerNumero("Interte segunda cifra: ");
        System.out.println("Resultado de la resta: " + (numero1 + numero2));
    }
    static void Multiplicar(){
        int numero1= LeerNumero("Interte primera cifra: ");
        int numero2= LeerNumero("Interte segunda cifra: ");
        System.out.println("Resultado de la multiplicación: " + (numero1 + numero2));
    }
    static void Dividir(){
        int numero1= LeerNumero("Interte dividendo cifra: ");
        int numero2= LeerNumero("Interte divisor cifra: ");
        try{
        System.out.println("Resultado de la división: " + (numero1 / numero2));}
        catch(ArithmeticException ex){System.out.println("Error: " + ex.getMessage());}
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
        System.out.println("*******\nCalculadora\n*************");
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
