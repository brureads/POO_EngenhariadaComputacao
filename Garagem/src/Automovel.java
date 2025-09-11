public class Automovel {
    public String marca;
    public String modelo;
    public int ano; // pode ser String também, se preferir

    public void ligar() {
        System.out.println("Automóvel ligado!");
    }

    public void ligar(boolean usoAfogador) {
        if (usoAfogador) {
            System.out.println("Automóvel ligado com afogador!");
        } else {
            System.out.println("Automóvel afogado!");
        }
    }
}





