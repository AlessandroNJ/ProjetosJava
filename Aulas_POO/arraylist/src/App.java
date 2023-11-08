import java.util.ArrayList;
import java.util.Comparator;

public class App {
    public static void main(String[] args) throws Exception {
        /* 
        //Declarar string
        String[] nomes1 = new String[5];

        for(int i = 0; i < nomes1.length; i++){
            nomes1[i] = JOptionPane.showInputDialog("Dige o nome:");
        }
       
       
        //Declarar array
        ArrayList<String> nomes2 = new ArrayList<String>();

        //Completar array
        for(int i = 0; i < 4; i++){
           String aux = JOptionPane.showInputDialog("Digite outros nomes:");
           nomes2.add(aux);
        }

        //imprimir
        for(int i = 0; i < nomes2.size(); i++){
           System.out.println(nomes2.get(i));
        }
        //imprimir
        for(String nome : nomes2){
            System.out.println(nome);
        }
        */

        Pessoa pessoa1 = new Pessoa("Joao", 20);
        Pessoa pessoa2 = new Pessoa("Carlos", 18);
        Pessoa pessoa3 = new Pessoa("Luis", 11);

        ArrayList<Pessoa> listaDePessoas = new ArrayList<Pessoa>();

        listaDePessoas.add(pessoa1);
        listaDePessoas.add(pessoa2);
        listaDePessoas.add(pessoa3);

        for (Pessoa varAuxiliar : listaDePessoas) {
            System.out.println(varAuxiliar.getNome()); 
        }

        listaDePessoas.sort(Comparator.comparing(Pessoa::getNome));

        for (Pessoa varAuxiliar : listaDePessoas) {
            System.out.println(varAuxiliar.getIdade()); 
        }
    }
}

