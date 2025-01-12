package Obj9.Ej6;

public class Obj9_Ej6 {
    public static void main(String[] args) {
        Punto p1= new Punto(4, 5);
        Punto p2 = new Punto(42, 23);
        Punto p3 = new Punto(1, 4);
        Triangulo triangulo= new Triangulo(p1, p2, p3);
        triangulo.MostrarTriangulo();
    }
}
