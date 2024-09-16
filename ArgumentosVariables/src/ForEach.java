public class ForEach {
    public static void main(String[] args) {
        int edades[] = {5,10,30,45};

        //el forEach simplifica la sintaxis, de esta forma no se podra acceder al indice
        for (int edad : edades){
            System.out.println("edad = "+ edad);
        }
    }
}
