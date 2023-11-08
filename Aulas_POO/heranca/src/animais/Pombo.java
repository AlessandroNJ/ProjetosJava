package animais;

public class Pombo extends Ave{

    private int cartasEnviadas;

    public int getCartasEnviadas() {
        return cartasEnviadas;
    }

    public void setCartasEnviadas(int cartasEnviadas) {
        this.cartasEnviadas = cartasEnviadas;
    }

    public Pombo(String nome, int cartasEnviadas) {
        super(nome);
        this.cartasEnviadas = cartasEnviadas;
    }

    public void fazerPruh(){
        System.out.format("O %s fez pruh\n",getNome());
    }

    public void enviarCartas(){
        System.out.format("O %s enviou %d cartas\n",getNome(),getCartasEnviadas());
    }

    
}
