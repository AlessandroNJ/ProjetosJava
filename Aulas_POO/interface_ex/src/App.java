import classes.PingPong;
import classes.Videogame;

public class App {
    public static void main(String[] args) throws Exception {
        Videogame xbox = new Videogame();
        PingPong pingPong_1 = new PingPong();

        xbox.ligar();
        xbox.jogar(pingPong_1);
        xbox.fechar();
    }
}
