public class Aula_09 {
    public static void main(String[] args) {
        String time = "Vasco";

        switch (time){
            case "Flamengo":
                System.out.println("O time é Fla");
                break;
            case "Corinthians":
                System.out.println("O time é Cor");
                break;
            case "Palmeiras":   
                System.out.println("O time é Pal");
                break;
            case "Vasco":
                System.out.println("O time é Vas");
                break;
            case "Cruzeiro":
                System.out.println("O time é Cru");
                break;
            default:
                System.out.println("O time é ???");
        }
    }
}
