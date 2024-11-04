import java.util.Scanner;

public class atv8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Tamanho do tabuleiro
        final int TAMANHO_TABULEIRO = 5;

        // Criando os tabuleiros dos jogadores
        char[][] tabuleiroJogador1 = new char[TAMANHO_TABULEIRO][TAMANHO_TABULEIRO];
        char[][] tabuleiroJogador2 = new char[TAMANHO_TABULEIRO][TAMANHO_TABULEIRO];

        // Inicializando os tabuleiros
        inicializarTabuleiro(tabuleiroJogador1);
        inicializarTabuleiro(tabuleiroJogador2);

        // Jogadores posicionam seus navios
        posicionarNavios(tabuleiroJogador1, "Jogador 1", scanner);
        posicionarNavios(tabuleiroJogador2, "Jogador 2", scanner);

        // Exibir tabuleiros
        System.out.println("Tabuleiro do Jogador 1:");
        exibirTabuleiro(tabuleiroJogador1);

        System.out.println("Tabuleiro do Jogador 2:");
        exibirTabuleiro(tabuleiroJogador2);

        scanner.close();
    }

    public static void inicializarTabuleiro(char[][] tabuleiro) {
        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro[i].length; j++) {
                tabuleiro[i][j] = '~'; // '~' representa água
            }
        }
    }

    public static void exibirTabuleiro(char[][] tabuleiro) {
        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro[i].length; j++) {
                System.out.print(tabuleiro[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void posicionarNavios(char[][] tabuleiro, String jogador, Scanner scanner) {
        System.out.println("Posicionamento dos navios para " + jogador + ":");

        for (int i = 0; i < 3; i++) { // Cada jogador tem 3 navios
            System.out.println("Posicione o navio " + (i + 1) + ":");
            System.out.print("Linha: ");
            int linha = scanner.nextInt();
            System.out.print("Coluna: ");
            int coluna = scanner.nextInt();

            if (linha >= 0 && linha < tabuleiro.length && coluna >= 0 && coluna < tabuleiro[0].length) {
                tabuleiro[linha][coluna] = 'N'; // 'N' representa um navio
            } else {
                System.out.println("Posição inválida. Tente novamente.");
                i--; // Repetir a iteração para que o jogador posicione o navio novamente
            }
        }
    }
}
