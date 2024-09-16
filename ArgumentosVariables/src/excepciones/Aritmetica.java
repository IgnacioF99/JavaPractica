package excepciones;

public class Aritmetica {
    public static int division(int numerador, int denominador){
        if (denominador == 0){
            //RuntimeException se reporta unicamente en caso de que el programa lance la excepcion
            throw new RuntimeException("Division entre Cero");

        }
        return numerador / denominador;
    }
}
