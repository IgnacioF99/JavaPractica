import java.util.ArrayList;
import java.util.List;

public class SnacksServices {
    private static final List<Snack> snacks;

    //Bloque static inicializador
    static {
        snacks = new ArrayList<>();
        snacks.add(new Snack(70,"Papas"));
        snacks.add(new Snack(50, "Refresco"));
        snacks.add(new Snack(120, "Sandwich"));
    }
    //List<Snack> snacks = new ArrayList<Snack>();

    public static void agregarSnack(Snack snack){
        snacks.add(snack);
    }

    public static void mostrarSnack(){
        var inventarioSnack = "";
        for (var snack: snacks){
            inventarioSnack += snack.toString() + "\n";
        }
        System.out.println("---Snacjs en el Inventario ---");
        System.out.println(inventarioSnack);
    }

    public static List<Snack> getSnacks() {
        return snacks;
    }
}
