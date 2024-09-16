import java.util.Set;
import java.util.TreeSet;

public class Sets {
    public static void main(String[] args) {
        //Set evita tener elementos duplicados
        Set<String> conjunto = new TreeSet<>();
        conjunto.add("Carlos");
        conjunto.add("Carlos");
        conjunto.add("Carla");
        conjunto.add("Victora");

        System.out.println("Elementos del Set");
        //Funcion Lambda
        conjunto.forEach(System.out::println);

        //Remover elemento
        conjunto.remove("Carla");
        System.out.println("\nElementos removido");
        //Funcion Lambda
        conjunto.forEach(System.out::println);

    }
}
