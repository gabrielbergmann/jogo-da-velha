public class JogoDaVelha extends JogoDeTabuleiro {
    protected JogadorHumano jogadorHumano;
    protected JogadorVirtual jogadorVirtual;

    public JogoDaVelha() {
        super('3', '#');
        jogadorHumano = new JogadorHumano('X');
        jogadorVirtual = new JogadorVirtual('O');
    }

    public boolean venceu(char idJogador) {
        return true;
    }

    void jogar(Jogador jogador) {
        boolean jogada = false;
        do {
            int[] posicoes = jogador.jogar();
             jogada = tabuleiro.adicionarPeca(jogador.getId(), posicoes[0], posicoes[1]);
        } while (!jogada);
    }

    public void jogar() {
        tabuleiro.inicializarTabuleiro();
        boolean venceu = false;
        do {
            jogar(jogadorHumano);
            venceu = venceu(jogadorHumano.getId());

        } while (venceu != true);
    }

}
