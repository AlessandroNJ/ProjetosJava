import classes.Circulo;
import classes.Quadrado;

public class App {
    public static void main(String[] args) throws Exception {
        Circulo circulo = new Circulo(2);

        Quadrado quadrado = new Quadrado(3);

        System.out.println("A área do círculo é "+circulo.calcularArea());    
        System.out.println("A área do quadrado é "+quadrado.calcularArea());    
    }
}
