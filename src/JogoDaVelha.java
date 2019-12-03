public class JogoDaVelha extends JogoDeTabuleiro {
    protected JogadorHumano jogadorHumano;
    protected JogadorVirtual jogadorVirtual;

    public JogoDaVelha(){
        super('3', '#');
        jogadorHumano = new JogadorHumano('X');
        jogadorVirtual = new JogadorVirtual('O');
    };

    public boolean venceu(char idJogador) {
        return true;
    };

    void jogar(Jogador jogador) {
        tabuleiro.inicializarTabuleiro();
    };

    public void jogar(){
        jogar(jogadorHumano);
    };
}
