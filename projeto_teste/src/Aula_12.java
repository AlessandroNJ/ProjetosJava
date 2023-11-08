import javax.swing.JOptionPane;

public class Aula_12 {
    public static void main(String[] args) {
        
        String[] nomes = new String[3];

        String[] teste = new String[]{
            "joao","ana","luiz"
        };

        for(int i=0; i<3;i++){
            nomes[i]=JOptionPane.showInputDialog(null, String.format("Insira o %dº nome: ", (i+1)), "Nomes", 2);
        }

        for(int j=0; j<teste.length;j++){
        System.out.println(String.format("O %dº nome é: ", (j+1))+teste[j]);
        }
    }
}
