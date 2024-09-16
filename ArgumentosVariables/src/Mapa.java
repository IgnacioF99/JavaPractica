import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {
        //Los tipos de datos pueden ser cualquier otro
        Map<String, String> persona = new HashMap<>();
        persona.put("nombre", "Diego");
        persona.put("apellido", "Flores");
        persona.put("edad","31");
        persona.put("edad","31"); //No se permiten duplicados

        //Para acceder a los valores del map se debe pedir primero la llave para acceder al valor ya que se guardan con <llave, valor>
        System.out.println("Valores del mapa: ");
        //un Map se debe generar el tipo set primero
        persona.entrySet().forEach(System.out::println); //Funcion lambda

        //Actualizamos la edad
        persona.put("edad","35");
        System.out.println("\nValores nuevos del mapa: ");
        //un Map se debe generar el tipo set primero
        persona.entrySet().forEach(System.out::println); //Funcion lambda

        //Eliminamos un valor
        persona.remove("apellido");
        System.out.println("\nValores nuevos del mapa: ");
        //un Map se debe generar el tipo set primero
        persona.entrySet().forEach(System.out::println); //Funcion lambda

        //Iterar sobre los elementos del mapa por separado
        System.out.println("\nIterando los elementos (llave, valor)");
        persona.forEach((llave, valor)-> {
            System.out.println("Llave: "+ llave + ", Valor: "+ valor);
        });

    }
}
