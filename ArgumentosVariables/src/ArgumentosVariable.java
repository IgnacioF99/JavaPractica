public class ArgumentosVariable {
    public static void main(String[] args) {
        //imprimirNumeros(1,2,3,4,5); //var args
        variosPrametros("Juan", 1,2,3,4,5,6,7);
    }

    static void variosPrametros(String nombre, int... numeros){
        System.out.println("nombre = " + nombre);
        imprimirNumeros(numeros);
    }

    //Esta forma de pasar un parametro, hace que el espacio en memoria se guarde como arreglo
    static void imprimirNumeros(int... numeros){
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i] + " ");
        }
    }

}
