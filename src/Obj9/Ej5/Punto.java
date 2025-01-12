package Obj9.Ej5;

public class Punto {
    private int X;
    private int Y;
    public Punto(){
        X = 0;
        Y=0;
    }
    public Punto(int x, int y){
        X=x;
        Y=y;
    }
    public void setX(int x){
        X=x;
    }
    public void setY(int y){
        Y=y;
    }
    public int getX(){
        return X;
    }
    public int getY(){
        return Y;
    }
    public void MostrarPunto(){
        System.out.println(String.format("El punto es (%s,%s)", X,Y));
    }
}
