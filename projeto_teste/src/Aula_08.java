import javax.swing.JOptionPane;

public class Aula_08 {
    public static void main(String[] args) {

        //&& and
        //|| ou
        //! not

        int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual a sua idade?", "Verificador de maioridade!", 3));
        JOptionPane.showMessageDialog(null, "Você tem "+idade+" anos!", null, 1);

        boolean verificar = idade >= 18;
        
        if (verificar == true){
            JOptionPane.showMessageDialog(null, "Você é maior de idade há " + (idade-18) + " anos!" , "Verificador de maioridade!", 2);
        }
        else //se tiver apenas uma linha embaixo n precisa de chaves
            JOptionPane.showMessageDialog(null, "Você é menor de idade, faltam " + (18-idade) + " anos!" , "Verificador de maioridade!", 0);
    }
}
