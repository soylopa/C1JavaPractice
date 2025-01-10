package Obj3;

public class Obj3_Ej6 {
    public static void main(String[] args) {
      System.out.println("#####Uso de parentesis####");
      System.out.print("Numero 1: define a ");
      Integer numero1 = Integer.parseInt(System.console().readLine());
      System.out.print("Numero 2: define b ");
      Integer numero2 = Integer.parseInt(System.console().readLine());
      /* numeros 3 y 4 son float, numeros 1 y 2 son enteros */
      System.out.print("Numero 3: define c ");
      Float numero3 = Float.parseFloat(System.console().readLine());
      System.out.print("Numero 4: define d ");
      Float numero4 = Float.parseFloat(System.console().readLine());
      float resultado1 = (numero1 * numero2) + numero3 / numero4;
      float resultado2 = numero1 *(numero2+numero3/numero4);
      float resultado3 = numero1 * (numero2+numero3)/numero4;
      
      System.out.println("Resultado 1: (a * b) + c / d = " + String.valueOf(resultado1));
      System.out.println("Resultado 2: a * (b + c / d) = " + String.valueOf(resultado2));
      System.out.println("Resultado 3: a * (b + c) / d = " + String.valueOf(resultado3));
    }
}
