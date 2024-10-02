package maquinadesnack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class  MaquinaSnacks {
    public static void main(String[] args) {
        maquinaSnacks();
    }

    public static void maquinaSnacks(){
        boolean salir = false;
        Scanner scan = new Scanner(System.in);
        //Creamos la lista de productos de tipo snack
        List<Snack> productos = new ArrayList<>();
        System.out.println("*** Maquina de Snack ***");
        SnacksServices.mostrarSnack(); // Mostrar inventario de snacks disponibles

        while (!salir){
            try {
                int opcion = mostrarMenu(scan);
                ejecutarOpciones(opcion,scan, productos);
            } catch (Exception e) {
                System.out.println("Ocurrio un error: "+ e.getMessage());
            }
            finally {
                System.out.println("");//El finally hace un bloque de codigo siempre, en este caso impimimos un salto de linea
            }
        }

    }

    private static int mostrarMenu(Scanner scan){
        System.out.print("""
                Menu:
                1. Comprar snack
                2. Mostrar ticket
                3. Agregar Nuevo Snack
                4. Salir

                Elija una opcion:
                """);
        return Integer.parseInt(scan.nextLine());


    }

    private static boolean ejecutarOpciones(int opcion, Scanner scan, List<Snack> productos){
        boolean salir = false;
        switch (opcion){
            case 1 -> comprarSnack(scan ,productos);
            case 2 -> mostrarTicket(productos);
            case 3 -> agregarSnack(scan);
            case 4 -> {
                System.out.println("Regresa pronto!");
                salir = true;
            }
            default -> System.out.println("Opcion invalida: "+ opcion);
        }
        return salir;
    }

    private static void comprarSnack(Scanner scan, List<Snack> productos){
        System.out.print("Que snack quiere comprar (id)?");
        int idSnack = Integer.parseInt(scan.nextLine());

        //Validamos que el snack exista
        boolean snackEncontrado = false;
        for (Snack snack: SnacksServices.getSnacks()){
            if (idSnack == snack.getIdSnack()){
                //Agregamos el snack a la lista de productos
                productos.add(snack);
                System.out.println("Ok, Snack agregado: "+ snack);
                snackEncontrado = true;
                break;
            }
        }
        if (!snackEncontrado){
            System.out.println("Id de snack no encontrado: " + idSnack);
        }
    }

    private static void mostrarTicket(List<Snack> productos){
        String ticket = "*** Ticket de Venta ***";
        double total = 0.0;
        for (Snack producto: productos){
            ticket += "\n\t-" + producto.getNombre() + " - $"+producto.getPrecio();
            total += producto.getPrecio();
        }
        ticket += "\n\tTotal -> $"+ total;
        System.out.println(ticket);
    }

    private static void agregarSnack(Scanner scan){
        System.out.println("Nombre del snack: ");
        String nombre = scan.nextLine();
        System.out.println("Precio del snack: ");
        double precio = Double.parseDouble(scan.nextLine());
        SnacksServices.agregarSnack(new Snack(precio, nombre));
        System.out.println("Tu snack se ha agregado correctamente");
        SnacksServices.mostrarSnack();
    }
}
