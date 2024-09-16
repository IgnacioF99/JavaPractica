import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Listas {
    public static void main(String[] args) {
        List miLista = new ArrayList(); // La clase ArrayList es la que define el comportamiento del objeto
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Viernes");
        miLista.add("Sabado");
        miLista.add("Domingo");
        miLista.add("Domingo");//Una lista de tipo ArrayList permite elementos duplicados
        for(Object dia: miLista){
            System.out.println("Dia de la semana: " + dia);
        }

        /// Funciones lambda (funcion anonima de un codigo muy compacto)
        miLista.forEach( elemento -> {
            System.out.println("Elemento: "+ elemento);
        });


        //La funcion especial de lambda es simplificar lo mas posible el codigo
        miLista.forEach(System.out::println);

        //Otra forma de crear una lista
        //Con el metodo asList nos permite crear la lista directamente en la inicializacion de la lista
        List<String> nombres = Arrays.asList("Pedro", "Ivonne", "Noemi");
        System.out.println("\nLista de nombres:");
        nombres.forEach(System.out::println);

    }


}
