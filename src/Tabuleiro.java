public class Tabuleiro {
    char pecaDefault;
    char[][] tabuleiro;
    int qtPecas;

    public Tabuleiro(int dimensaoDoTabuleiro, char pecaDefault) {
        this.pecaDefault = pecaDefault;
        tabuleiro = new char[dimensaoDoTabuleiro][dimensaoDoTabuleiro];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tabuleiro[i][j] = pecaDefault;
            }
        }
    }

    public boolean adicionarPeca(char peca, int i, int j) {
        if (i >= 3 || j >= 3) {
            return false;
        } else {
            return true;
        }
    }

    void removerPeca(int i, int j) {

    }

    void inicializarTabuleiro() {
        System.out.println(toString());
    }

    public String toString() {
        String tabuleiroConvertido = "Tabuleiro:\n";
        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro.length; j++) {
                tabuleiroConvertido += tabuleiro[i][j];
            }
            tabuleiroConvertido += "\n";
        }
        return tabuleiroConvertido;
    }

    char getPeca(int i, int j) {
        return 0;
    }

    int getQtPecas() {
        return 0;
    }


}
