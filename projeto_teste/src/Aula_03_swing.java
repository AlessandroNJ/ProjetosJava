import javax.swing.JOptionPane;

public class Aula_03_swing {
    public static void main(String[] args) {
        String filme = JOptionPane.showInputDialog(null, "Qual seu filme favorito? ", "Filme favorito", JOptionPane.QUESTION_MESSAGE);

        JOptionPane.showMessageDialog(null, "O filme favorito é "+ filme, "Cinema", JOptionPane.INFORMATION_MESSAGE);
    }
}
