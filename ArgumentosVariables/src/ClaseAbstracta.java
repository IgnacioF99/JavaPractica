public class ClaseAbstracta {
    public static void main(String[] args) {
        FiguraGeometrica figuraGeometrica = new Rectangulo();
        figuraGeometrica.dibujar();
    }
}


//Clase abstracta

abstract class FiguraGeometrica{
    //el metodo abstracto no tiene instrucciones ya q estos se deben de implementar en el metodo que los herede
    public abstract void dibujar();
}

class Rectangulo extends FiguraGeometrica{
    @Override
    public void dibujar(){
        System.out.println("Se dibuja un Rectangulo");
    }
}