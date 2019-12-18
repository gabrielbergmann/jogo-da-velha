public abstract class Jogador {

    private final char id;

    public Jogador(char id) {
        this.id = id;
    }

    public char getId() {
        return id;
    }

    public abstract int[] jogar();
}