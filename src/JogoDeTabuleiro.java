public abstract class JogoDeTabuleiro implements Jogo {

    protected Tabuleiro tabuleiro;

    public JogoDeTabuleiro(int tamanho, char caractereDefault) {
        this.tabuleiro = new Tabuleiro(tamanho, caractereDefault);
    }
}
