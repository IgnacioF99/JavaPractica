package archivos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CrearArchivo {
    public static void main(String[] args) {
        var nombreArchivo = "mi_archivo.txt";
        var archivo = new File(nombreArchivo);

        try {
            //revisamos si el archivo ya existe
            if (archivo.exists()){
                System.out.println("El archivo ya existe!");
            } else {
                //Creamos el archivo
                var salida = new PrintWriter(new FileWriter(archivo));
                //Este metodo guarda finalmente el archivo en el disco duro
                salida.close();
                System.out.println("Se ha creado el archivo");
            }
        } catch (IOException e){
            System.out.println("Error al crear archivo: "+ e.getMessage());
            e.printStackTrace();//Esto tira todos los errores de la ejecucion
        }

    }
}
