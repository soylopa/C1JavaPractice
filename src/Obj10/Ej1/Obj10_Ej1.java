package Obj10.Ej1;

public class Obj10_Ej1 {
    public static void main(String[] args) {
        Lavadora lavadora = new Lavadora();
        lavadora.SetRPM(1200);
        lavadora.SetKilos(8);
        lavadora.SetTension(230);
        lavadora.Encender();
        lavadora.Mostrar();
    }
}
