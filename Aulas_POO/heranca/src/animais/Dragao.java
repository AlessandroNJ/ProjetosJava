package animais;

public class Dragao extends Ave{

    public Dragao(String nome){
        super(nome);
    }

    public void soltarFogo(){
        System.out.format("O %s soltou fogo\n",getNome());

    }
    
}
