import java.util.Random;

public class Personagem {
    String nome;
    int forca;
    int nivel;

    void mostrarStatus(){
        System.out.format("\nPersonagem: %s com lvl %d e nível de força %d",nome,nivel,forca);
    }

    void atacar(String alvo, String habilidade){

        int danoCausado = calcularDano();

        if (habilidade.length() == 0)
            System.out.format("\nO personagem %s atacou o personagem %s e causou %d de dano!", nome, alvo, danoCausado);
        else    
          System.out.format("\nO personagem %s atacou o personagem %s com a habilidade %s e causou %d de dano!", nome, alvo, habilidade, (danoCausado*2));
    }    
    
    int calcularDano(){
        Random gerador = new Random();
        int dado20Faces = 1 + gerador.nextInt(19);
        int dano = forca + dado20Faces;
        return dano;
    }
}
