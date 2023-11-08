import java.util.Random;

import javax.swing.JOptionPane;

public class Aula_07 {
    public static void main(String[] args) {
        Random gerador = new Random();
        
        int facesDado = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos lados tem o dado?", "Dado", 3)); 

        int resultado = 1 + gerador.nextInt(facesDado);

        JOptionPane.showMessageDialog(null, "Você sorteou o número: " + resultado, "Jogo de Dados", 1);
    }
}
