package classes;

public class PingPong implements Jogo {

    public String nomeDoJogo = "Ping Pong";

    @Override
    public void jogar() {
        System.out.println("Cutscene inicial");
        System.out.println("Mostrando menu inicial");
        System.out.println("Tocando musica de fundo");
        
    }
    
    @Override
    public void fechar() {
        System.out.println("Salvar o progresso do jogo");
        System.out.println("Fechar o jogo");
    }
    
}
