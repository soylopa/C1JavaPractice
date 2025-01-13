package Project3;
import java.util.ArrayList;
import java.util.List;
public class Biblioteca {
    List<Libro> LibrosBiblioteca;
    public Biblioteca(){
        LibrosBiblioteca = new ArrayList<Libro>();
    }
    public int NumeroLibros(){
        return LibrosBiblioteca.size();
    }
    public void AñadirLibro(Libro libro){
        LibrosBiblioteca.add(libro);
    }
    public void BorrarLibro(String titulo){
        boolean encontrado = false;

        int posicionaBorrar=-1;

        for(Libro libro: LibrosBiblioteca){
            posicionaBorrar++;
            if(libro.GetTitulo().equals(titulo)){
                encontrado=true;
                break;
            }
        }
        if(encontrado){
            LibrosBiblioteca.remove(posicionaBorrar);
            System.out.println("Libro borrado correctamente");
        }
        else{
            System.out.println("Libro no encontrado");
        }
        
    }
    public void Mostrar(){
        System.out.println("************BIBLIOTECA**********");
        for(Libro libro: LibrosBiblioteca){
            libro.Mostrar();
            System.out.println("****************************");
        }
    }
}

