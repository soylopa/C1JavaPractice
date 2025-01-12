package Obj8;

public class Obj8_Ej4 {
    static int SolicitarNumero(){
        System.out.println("Introduzca número: ");
        int valor = Integer.parseInt(System.console().readLine());
        return valor;
    }
    static void Sumar(){
        int valor1 = SolicitarNumero();
        int valor2 = SolicitarNumero();
        System.out.println("Resultado: " + (valor1 + valor2));
    }
    public static void main(String[] args) {
        Sumar();
    }
}
