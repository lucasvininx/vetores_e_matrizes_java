import java.util.Random;

public class atv3 {
    public static void main(String[] args) {
        // Criando um objeto da classe Random para gerar números aleatórios
        Random random = new Random();

        // Simulando o lançamento dos dois dados
        int dado1 = random.nextInt(6) + 1; // Gera um número aleatório entre 1 e 6
        int dado2 = random.nextInt(6) + 1; // Gera um número aleatório entre 1 e 6

        // Calculando o resultado da jogada (soma dos dois dados)
        int resultado = dado1 + dado2;

        // Imprimindo o resultado de cada dado e a soma dos dois dados
        System.out.println("Resultado do primeiro dado: " + dado1);
        System.out.println("Resultado do segundo dado: " + dado2);
        System.out.println("Soma dos dois dados: " + resultado);
    }
}
