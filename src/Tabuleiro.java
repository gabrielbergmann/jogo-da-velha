public class Tabuleiro {
    char pecaDefault;
    char[][] tabuleiro;
    int qtPecas = 0;

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
            System.out.println("Jogada fora do tabuleiro!");
            return false;
        } else if (tabuleiro[i][j] == peca) {
            System.out.println("Jogada em cima de outra peça!");
            return false;
        } else {
            tabuleiro[i][j] = peca;
            qtPecas++;
            return true;
        }
    }

    void removerPeca(int i, int j) {
        System.out.println(toString());
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
        return qtPecas;
    }


}
