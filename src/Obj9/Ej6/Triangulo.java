package Obj9.Ej6;

public class Triangulo {
    Punto P1;
    Punto P2;
    Punto P3;
    public Triangulo(Punto p1, Punto p2, Punto p3){
        P1 = p1;
        P2 = p2;
        P3 = p3;
    }
    public void MostrarTriangulo(){
        System.out.println(String.format("Triángulo compuesto por los siguientes puntos: "));
        P1.MostrarPunto();
        P2.MostrarPunto();
        P3.MostrarPunto();
    }
}
