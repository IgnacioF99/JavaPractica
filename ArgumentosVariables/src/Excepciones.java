public class Excepciones {
    public static void main(String[] args) {
        int valor1 = 10, valor2 = 0;
        try{
            var resultado = valor1 / valor2;
            System.out.println("resultado = "+ resultado);
        } catch (Exception e){//Exception es la clase por defecto de java que maneja las excepciones
            System.out.println("Ocurrio un error: "+ e);
        }
    }
}
