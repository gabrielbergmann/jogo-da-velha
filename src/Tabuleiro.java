public class Tabuleiro {
    char pecaDefault;
    char[][] tabuleiro;
    int qPecas;

    public Tabuleiro(int dimensaoDoTabuleiro, char qPecas){
        this.qPecas = dimensaoDoTabuleiro;
        pecaDefault = qPecas;
        for (int i = 0; i < dimensaoDoTabuleiro; i++) {
            for (int j = 0; j < dimensaoDoTabuleiro; j++) {
                tabuleiro[i][j] = qPecas;
                System.out.println(tabuleiro[i][j]);
            }
        }
    };

    public boolean adicionarPeca(char peca, int i, int j){

        return true;
    };

    void removerPeca(int i, int j) {
        
    };

    void inicializarTabuleiro(){
    };

    public String toString() {

        return "";
    };

    char getPeca(int i, int j){
        return 0;
    };

    int getQtPecas(){
        return 0;
    }
}
