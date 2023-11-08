package classes;

public class Videogame {

    private boolean estaLigado;
    private Jogo jogo;

    public void ligar(){
        System.out.println("Ligando....");
        estaLigado = true;
    }

    public void jogar(Jogo jogo){
        if (estaLigado == true){
            System.out.println("Iniciando o jogo...");
            this.jogo = jogo;
            jogo.jogar();
        }
        else    
            System.out.println("O videogame esta desligado");
        
    }

    public void fechar(){
        System.out.println("Fechando o jogo...");
        if(jogo != null){
            jogo.fechar();
            jogo = null;
            estaLigado = false;
        }
        else
            System.out.println("Não tem nenhum jogo rodando");
    }
}
