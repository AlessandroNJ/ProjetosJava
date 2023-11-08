import animais.Cachorro;
import animais.Dragao;
import animais.Gato;
import animais.Pombo;

public class App {
    public static void main(String[] args) throws Exception {
        Cachorro cachorro = new Cachorro("Sonic");

        Gato gato = new Gato("Snow");

        gato.beber();

        cachorro.beber();
        cachorro.lamber();

        Dragao dragao = new Dragao("Banguela");

        dragao.beber();
        dragao.voar();

        Pombo pombo = new Pombo("Richarlison",15);

        pombo.enviarCartas();
        pombo.fazerPruh();

        pombo.voar();

    }
}
