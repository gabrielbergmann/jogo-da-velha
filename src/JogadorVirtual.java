public class JogadorVirtual extends Jogador {

    public JogadorVirtual(char id) {
        super(id);
    }

    int inteligencia() {
        return Utils.sortear(0, 3);
    }

    public int[] jogar() {
        int[] jogadaVirtual = new int[2];
        for (int i = 0; i < 2; i++) {
            jogadaVirtual[i] = inteligencia();
        }
        return jogadaVirtual;
    }
}