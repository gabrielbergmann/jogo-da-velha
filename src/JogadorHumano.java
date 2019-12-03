import java.util.Scanner;

public class JogadorHumano extends Jogador{

    JogadorHumano(char id) {
        super(id);
    };

    public int[] jogar(){
        int[] posicao = new int[2];
        Scanner s = new Scanner(System.in);
        System.out.println("JOGADOR INFORME A LINHA:");
        posicao[0] = s.nextInt();
        System.out.println("JOGADOR INFORME A COLUNA:");
        posicao[1] = s.nextInt();
        return posicao;
    }
}
