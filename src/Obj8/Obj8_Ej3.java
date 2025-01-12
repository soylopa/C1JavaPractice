package Obj8;

public class Obj8_Ej3 {
    static int Sumar(int suma1, int suma2){
        return suma1+suma2;
    }
    public static void main(String[] args) {
        System.out.print("Primera cifra: ");
        int sum1 = Integer.parseInt(System.console().readLine());
        System.out.print("Segunda cifra: ");
        int sum2 = Integer.parseInt(System.console().readLine());
        System.out.println("Resultado: " + Sumar(sum1,sum2));

    }
}
