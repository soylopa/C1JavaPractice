package Obj9.Ej3;

public class Punto {

        private int X;
        private int Y;
        
        public Punto(){
            X = 0;
            Y= 0;
        }
        public Punto(int x, int y){
            X =x;
            Y=y;
        }
        public void setX(int x){
            X=x;
        }
        public void setY(int y){
            Y=y;
        }
        public void MostrarPunto(){
            System.out.println(String.format("El punto es (%s,%s)", X,Y));
        }
    }
