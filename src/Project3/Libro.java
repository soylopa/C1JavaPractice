package Project3;

public class Libro {
    private String Titulo;
    private String ISBN;
    private Autor AutorLibro;
    public Libro(String titulo, String isbn){
        Titulo = titulo;
        ISBN = isbn;
    }
    public void AñadirAutor( Autor autor){
        AutorLibro = autor;
    }
    public String GetTitulo(){
        return Titulo;
    }
    public void Mostrar(){
        System.out.println("-----Libro----");
        System.out.println("Título: " + Titulo);
        System.out.println("ISBN: " + ISBN);
        AutorLibro.Mostrar();
        System.out.println("--------------");
    }
}
