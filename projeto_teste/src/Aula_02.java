public class Aula_02 {
    public static void main(String[] args) {

        String filme = "Avengers";
        int anoDeLancamento = 2015;

        System.out.println("O filme " + filme + " lançou em " + anoDeLancamento);

        System.out.format("O filme %s lançou em %d\n", filme, anoDeLancamento);
        
        String textoCompleto = "O filme " + filme + " lançou em " + anoDeLancamento;
        
        System.out.println(textoCompleto);

    }
}
