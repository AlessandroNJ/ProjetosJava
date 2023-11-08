public class Aula_02_poo {
    public static void main(String[] args) {
        Personagem primeiroJogador = new Personagem();

        primeiroJogador.forca = 15;
        primeiroJogador.nivel = 3;
        primeiroJogador.nome = "Mago";

        primeiroJogador.mostrarStatus();
        primeiroJogador.atacar("hydra","dois golpes");
    }
}
