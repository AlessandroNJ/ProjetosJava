import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Aula_10 {
    public static void main(String[] args) {
        String personagem = JOptionPane.showInputDialog(null, "Digite um personagen de DBZ", "DBZ", 3);
        String nomeIMG , origem = "";

        switch(personagem){
            case "Goku":
                origem = "Planeta Sayajin";
                nomeIMG = "goku-icone";
                break;
            case "Piccolo":
                origem = "Planeta Nameku";
                nomeIMG = "piccolo-icone";
                break;
            case "Bulma":
                origem = "Planeta Terra";
                nomeIMG = "bulma-icone";
                break;
            case "Vegeta":
                origem = "Planeta Sayajin";
                nomeIMG = "vegeta-icone";
                break;
            case "Kuririn":
                origem = "Planeta Terra";
                nomeIMG = "kuririn-icone";
                break;
            default:
                origem = "Desconhecida";
                nomeIMG = "default";
                break;
        }

        String caminhoPasta = String.format("C:/Users/alessandronj/Desktop/ProjetosJava/projeto_teste/src/imagens/%s.png",nomeIMG);

        ImageIcon icone = new ImageIcon(caminhoPasta);

        String informacoes = String.format("Personagem: %s\nOrigem: %s", personagem,origem);
        JOptionPane.showMessageDialog(null, informacoes, "DBZ", 2,icone);
    }
}
