public class App {
    public static void main(String[] args) throws Exception {
        Serie serie1 = new Serie("TLOU", 3, 2016);
    

        serie1.setAno(2023);

        String informacoes = serie1.pegarInf();

        System.out.println(informacoes);




    }
}
