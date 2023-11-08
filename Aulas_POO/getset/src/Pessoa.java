public class Pessoa {
    
    private String nome = "joao";
    private int idade = 0;
    private double altura = 0.2;

    //da de criar de forma automatica
    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getNome(){
        return nome;
    }

    public int getIdade(){
        return idade;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

}
