import javax.swing.JOptionPane;

public class Aula_04 {
    public static void main(String[] args) {
        int numeroA = 5;
        int numeroB = 2;
        
        double resultado = (double) numeroA % numeroB;

        JOptionPane.showMessageDialog(null, resultado, "Soma", JOptionPane.INFORMATION_MESSAGE);

    }
}
