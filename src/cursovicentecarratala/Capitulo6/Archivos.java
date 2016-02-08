package cursovicentecarratala.Capitulo6;

import java.io.File;
import java.util.*;

public class Archivos {

    public static void main(String[] args) {
        File archivo = new File("C://pruebas//archivo.txt");
        final Formatter nuevoarchivo;

        //comprobamos existencia
        if (archivo.exists()) {
            if (archivo.canWrite()) {

                System.out.println("El archivo existe y puedo escribir");
            } else {
                System.out.println("El archivo existe y no puedo escribir");
            }
        } else {
            
            try{
                nuevoarchivo = new Formatter("C://pruebas//archivo.txt");
                System.out.println("El archivo ha sido crea do con exito");
                nuevoarchivo.format("%s%s%s"," Fernanda Monserrat "," Ramirez Ochoa ",22);
                nuevoarchivo.close();
                
            }catch(Exception e){
                System.out.println("Error: "+e);
            }
        }
    }
}
