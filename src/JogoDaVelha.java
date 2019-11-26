public class JogoDaVelha extends JogoDeTabuleiro {
    JogadorHumano jogadorHumano;
    JogadorVirtual jogadorVirtual;

    public JogoDaVelha(){
        super('3', '#');
        jogadorHumano = new JogadorHumano('X');
        jogadorVirtual = new JogadorVirtual('O');
    };

    public boolean venceu(char idJogador) {
        return true;
    };

    void jogar(Jogador jogador) {

    };

    public void jogar(){

    };
}
