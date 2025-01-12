package Obj9.Ej1;

public class Punto {
    int X;
    int Y;
    public Punto(int x, int y){
        X =x;
        Y=y;
    }
    public void MostrarPunto(){
        System.out.println(String.format("El punto es (%s,%s)", X,Y));
    }
}
