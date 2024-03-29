import java.util.Scanner;

public class JogoDaVelha extends JogoDeTabuleiro {
    protected JogadorHumano jogadorHumano;
    protected JogadorVirtual jogadorVirtual;
    private Scanner s = new Scanner(System.in);

    public JogoDaVelha() {
        super('3', '#');
        jogadorHumano = new JogadorHumano('X');
        jogadorVirtual = new JogadorVirtual('O');
    }

    public boolean venceu(char idJogador) {
        boolean venceu = false;
        for (int i = 0; i < 3; i++) {
            if ((tabuleiro.getPeca(0,i) == tabuleiro.getPeca(1, i)) && (tabuleiro.getPeca(0,i) == tabuleiro.getPeca(2,i) && (tabuleiro.getPeca(0,i) != '#'))) {
                System.out.println("VENCEU PELA VERTICAL!");
                venceu = true;
            } else if ((tabuleiro.getPeca(i,0) == tabuleiro.getPeca(i,1) && (tabuleiro.getPeca(i,0) == tabuleiro.getPeca(i,2)) && (tabuleiro.getPeca(i,0) != '#'))) {
                System.out.println("VENCEU PELA HORIZONTAL!");
                venceu = true;
            }
        }

        if ((tabuleiro.getPeca(0,0) == tabuleiro.getPeca(1,1)) && (tabuleiro.getPeca(0,0) == tabuleiro.getPeca(2,2)) && (tabuleiro.getPeca(0,0) != '#')) {
            System.out.println("VENCEU PELA DIAGONAL!");
            venceu = true;
        } else if ((tabuleiro.getPeca(2,0) == tabuleiro.getPeca(1,1)) && (tabuleiro.getPeca(2,0) == tabuleiro.getPeca(0,2)) && (tabuleiro.getPeca(2,0) != '#')) {
            System.out.println("VENCEU PELA DIAGONAL!");
            venceu = true;
        } else if (tabuleiro.getQtPecas() > 9){
            tabuleiro.removerPeca(0,0);
            System.out.println("DEU VELHA!");
        }
       return venceu;
    }

    void jogar(Jogador jogador) {
        boolean jogada = false;
        do {
            int[] posicoes = jogador.jogar();
            jogada = tabuleiro.adicionarPeca(jogador.getId(), posicoes[0], posicoes[1]);
        } while (!jogada);
        System.out.println(tabuleiro.toString());
    }

    public void jogar() {
        tabuleiro.inicializarTabuleiro();
        boolean venceu = false;
            int opcao;
            char idJogador = '#';
            System.out.println("JOGO DA VELHA");
            System.out.println("ESCOLHA UMA OPÇÃO:");
            System.out.println("1 - JOGAR");
            System.out.println("0 - SAIR");
            opcao = s.nextInt();
        do {
            switch (opcao) {
                case 1:
                    jogar(jogadorHumano);
                    idJogador = jogadorHumano.getId();
                    venceu = venceu(idJogador);
                    if (!venceu) {
                        System.out.println("JOGADOR VIRTUAL");
                        jogar(jogadorVirtual);
                        idJogador = jogadorVirtual.getId();
                        venceu = venceu(idJogador);
                    }
                    break;
                case 0:
                    venceu = true;
                    System.out.println("VOCÊ SAIU!");

                    tabuleiro.removerPeca(0, 0);
                    System.out.println("FORAM JOGADAS " + tabuleiro.getQtPecas() + " PEÇAS NO TABULEIRO.");
            }
        } while (venceu != true);
        if (venceu) {
            tabuleiro.removerPeca(0, 0);
            if (idJogador != '#') {
                System.out.println("JOGADOR "+idJogador+" VENCEU!");
            }
            System.out.println("FORAM JOGADAS " + tabuleiro.getQtPecas() + " PEÇAS NO TABULEIRO.");
            int sair;
            System.out.println("DESEJA JOGAR NOVAMENTE?");
            System.out.println("1 - SIM");
            System.out.println("0 - SAIR");
            sair = s.nextInt();
            if (sair == 1) {
                jogar();
            } else {
                s.close();
            }
        }
    }

}