import java.util.Scanner;

public class Aula_03{
    public static void main(String[] args) {
        int numero;

        String aux;

        Scanner leitor = new Scanner(System.in);

        //sempre usar next line para leitura de terminal
        //mas ela só le string, então tem que usar variável auxiliar
        aux = leitor.nextLine();

        numero = Integer.parseInt(aux);

        System.out.println("O numero digitado é " + (numero+1));

        //é recomendável fechar a leitura
        leitor.close();
    }
}