import javax.swing.JOptionPane;

public class Aula_13 {
    public static void main(String[] args) {
        String[] serie = new String[]{
            "TWD", "TLOU", "The Office", "Sair"
        };

        int opcaoEscolhida = 0;

         while(opcaoEscolhida != 3){
            opcaoEscolhida = JOptionPane.showOptionDialog(null, 
            "O que você deseja assistir:", 
            "Flix",
            JOptionPane.DEFAULT_OPTION, 
            3, 
            null, 
            serie, 
            0);

            if(opcaoEscolhida != 3)
                JOptionPane.showMessageDialog(null, String.format("Você assistiu %s", serie[opcaoEscolhida]), "Flix", 1);
         }

         
    }
}
