import java.util.Random;

import javax.swing.JOptionPane;

public class Aula_06 {
    public static void main(String[] args) {
        //int dados6faces = 1+(int)(Math.random()*6);

        //JOptionPane.showMessageDialog(null, dados6faces, "Dado", JOptionPane.INFORMATION_MESSAGE);
   
        Random gerador = new Random();

        int numero = gerador.nextInt(6) + 1;
        JOptionPane.showMessageDialog(null, numero, "Dado", JOptionPane.INFORMATION_MESSAGE);
    }
}
