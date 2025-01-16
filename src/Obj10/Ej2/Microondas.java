package Obj10.Ej2;

import Obj10.Ej1.Electrodomestico;

public class Microondas extends Electrodomestico{
    int PotenciaMaxima;
    boolean Grill;
    public Microondas(){PotenciaMaxima= 0; Grill=false;}
    public int GetPotenciaMaxima() {return PotenciaMaxima;}
    public void SetPotenciaMaxima( int potenciamaxima){ PotenciaMaxima= potenciamaxima;}
    public boolean getGrill(){return Grill;}
    public void SetGrill(boolean grill){ Grill=grill;}
    public void Mostrar(){
        System.out.println("----Microondas----");
        System.out.println("Potencia Máxima: "+ PotenciaMaxima);
        System.out.println("Tiene grill: "+ Grill);
        System.out.println("Tensión: " + GetTension());
        if(EstaEncendido())
            System.out.println("El microondas está encendido");
        else
            System.out.println("El microondas está apagado");
        System.out.println("---------------");
    }
}
