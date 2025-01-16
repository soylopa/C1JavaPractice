package Obj12.Ej2;
import java.io.*;
public class Obj12_Ej2 {
        public static void main(String[] args) {
            String ruta="src\\Obj12\\Ej1\\pruebas.txt";
            String linea;
            BufferedReader reader= null;
            File archivo = new File(ruta);
            if(!archivo.exists()){
                System.out.println("El archivo no existe en la ruta especificada.");
            } else {
                System.out.println("El archivo fue encontrado.");
            }
            
            try{
                reader = new BufferedReader(new FileReader(ruta));
                linea = reader.readLine();
                while(linea!=null){
                    System.out.println(linea);
                    linea=reader.readLine();
                }
                reader.close();
            }catch(IOException ex){
                System.out.println("ERROR: "+ ex.getMessage());
            }
        }
    }

