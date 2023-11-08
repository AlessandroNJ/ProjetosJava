import javax.swing.JOptionPane;

public class Aula_05 {
    public static void main(String[] args) {
        int contador = 2;
        JOptionPane.showMessageDialog(null, contador, "Contador", JOptionPane.INFORMATION_MESSAGE);
        contador++;
        JOptionPane.showMessageDialog(null, contador, "Contador", JOptionPane.INFORMATION_MESSAGE);
        
        double resultado = Math.pow(contador, contador);
        JOptionPane.showMessageDialog(null, resultado, "Contador", JOptionPane.INFORMATION_MESSAGE);
    }
}
