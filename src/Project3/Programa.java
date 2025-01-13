package Project3;

public class Programa {
    static void MostrarMenu(){
        System.out.println("Menu:");
        System.out.println("1.- Añadir libro a la biblioteca");
        System.out.println("2.- Mostrar biblioteca");
        System.out.println("3.- Borrar libro");
        System.out.println("4.- ¿Número total de libros?");
        System.out.println("5.- Salid");
        System.out.println("Opcion: ");
    }
    static Biblioteca AñadirLibroALaBiblioteca(Biblioteca biblioteca){
        String titulo,isbn, autornombre, autorapellidos;
        System.out.print("Introduzca el nombre del libro: ");
        titulo = System.console().readLine();
        System.out.print("Introduzca el ISBN del libro: ");
        isbn = System.console().readLine();
        System.out.print("Introduzca el nombre del autor del libro: ");
        autornombre= System.console().readLine();
        System.out.print("Introduzca el apellido del autor del libro: ");
        autorapellidos= System.console().readLine();

        Autor autor = new Autor(autornombre, autorapellidos);
        Libro libro = new Libro(titulo, isbn);
        libro.AñadirAutor(autor);
        biblioteca.AñadirLibro(libro);
        return biblioteca;
        /*las variables están agrupadas en libro y autor, libro está dividido en las variables titulo e isbn; la variable autor en el nombre y apellidos del autor siendo cada palabra una variable a introducir en la consola */

    }
    static Biblioteca BorrarLibroDeLaBiblioteca(Biblioteca biblioteca){
        System.out.print("Introduzca el nombre del libro a borrar: ");
        biblioteca.BorrarLibro(System.console().readLine());
        return biblioteca;
    }
    public static void main(String[] args) {
        boolean fin = false;
        Biblioteca biblioteca = new Biblioteca();
        int opcion = 0;
        while (!fin) {
            MostrarMenu();
            opcion = Integer.parseInt(System.console().readLine());
            switch (opcion) {
                case 1:
                    AñadirLibroALaBiblioteca(biblioteca);
                    break;
            
                case 2:
                    biblioteca.Mostrar();
                    break;
                case 3:
                    BorrarLibroDeLaBiblioteca(biblioteca);
                    break;
                case 4:
                    System.out.println("Número total de libros en la biblioteca: " + biblioteca.NumeroLibros());
                    break;
                case 5:
                    fin=true;
                    break;
            }
            
        }
        System.out.println("Fin del programa");
    }
}
