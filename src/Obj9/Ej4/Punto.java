package Obj9.Ej4;

public class Punto {
    public int X;
    public int Y;
    public Punto(){
        X=0;
        Y=0;
    }
    public void MostrarPunto(){
        System.out.println(String.format("El punto es (%s,%s)", X,Y));
    }
}
