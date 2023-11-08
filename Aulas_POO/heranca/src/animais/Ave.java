package animais;
public class Ave extends Animal {

    public Ave(String nome) {
        super(nome);
    }

    public void voar(){
        System.out.format("O %s voou\n",getNome());
    }
    
}
