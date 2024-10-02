package archivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class LeerArchivo {
    //leer el archivo
    public static void main(String[] args) {
        var nombreArchivo = "mi_archivo.txt";
        var archivo = new File(nombreArchivo);
        try {
            System.out.println("Contenido del Archivo: ");
            //Abrir el archivo para lectura
            //BufferReader lee lineas completas
            var entrada = new BufferedReader(new FileReader(archivo));
            // Leemos linea a linea el archivo
            var linea = entrada.readLine();
            //Leemos todas las lineas
            while (linea != null){
                System.out.println(linea);
                // antes de terminar el ciclo, nos movemos a la siguiente linea
                linea = entrada.readLine();
            }
            // Siempre cerrar el archivo despues de terminar de leerlo
            entrada.close();
        }catch (Exception e){
            System.out.println("Error al leer archivo: "+ e);
        }
    }
}
