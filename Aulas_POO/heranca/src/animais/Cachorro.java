package animais;

public class Cachorro extends Animal {

    public Cachorro(String nome){
        super(nome);
    }

    public void latir(){
        System.out.format("O %s latiu\n",getNome());
    }

    public void lamber(){
        System.out.format("O %s lambeu\n",getNome());
    }
}
