package Project3;

public class Autor {
    private String Nombre;
    private String Apellido;
    public Autor(String nombre, String apellido){
        Nombre= nombre;
        Apellido= apellido;
    }
    public void Mostrar(){
        System.out.println(String.format("Autor: (%s,%s)", Nombre,Apellido));
    }
}
