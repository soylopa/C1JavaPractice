package Obj10.Ej2;

import Obj10.Ej1.Lavadora;

public class Obj10_Ej2 {
    public static void main(String[] args) {
        Lavadora lavadora= new Lavadora();
        lavadora.SetRPM(1200);
        lavadora.SetKilos(8);
        lavadora.SetTension(220);    
        lavadora.Encender();

        Microondas microondas= new Microondas();
        microondas.SetGrill(true);
        microondas.SetPotenciaMaxima(800);
        microondas.SetTension(200);
        microondas.Apagar();
        lavadora.Mostrar();
        microondas.Mostrar();
    }
    
}
