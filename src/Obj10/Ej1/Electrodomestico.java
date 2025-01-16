package Obj10.Ej1;

public class Electrodomestico {
    Boolean Encendido;
    int Tension;
    public Electrodomestico(){Encendido= false; Tension=220;}
    public void Encender(){Encendido=true;}
    public void Apagar(){Encendido=false;}
    public boolean EstaEncendido(){return Encendido=true;}
    public void SetTension(int tension){Tension=tension;}
    public int GetTension(){return Tension;}
}
