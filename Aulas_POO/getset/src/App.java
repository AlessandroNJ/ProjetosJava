public class App {
    public static void main(String[] args) throws Exception {
        Pessoa pessoa1 = new Pessoa();

        pessoa1.setNome("carlos");

        pessoa1.setIdade(20);

        pessoa1.setAltura(1.955);


        System.out.println(pessoa1.getNome());
        
        System.out.println(pessoa1.getIdade());

        System.out.println(pessoa1.getAltura());

    }
}
