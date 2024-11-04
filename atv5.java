import java.util.Scanner;

public class atv5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definindo o número de meses
        int numMeses = 12;

        // Criando um vetor para armazenar as vendas de cada mês
        int[] vendas = new int[numMeses];

        // Lendo as vendas de cada mês
        for (int i = 0; i < numMeses; i++) {
            System.out.print("Digite as vendas do mês " + (i + 1) + ": ");
            vendas[i] = scanner.nextInt();
        }

        // Calculando a média das vendas
        double soma = 0;
        int maximo = vendas[0];
        int minimo = vendas[0];
        for (int venda : vendas) {
            soma += venda;
            if (venda > maximo) {
                maximo = venda;
            }
            if (venda < minimo) {
                minimo = venda;
            }
        }
        double media = soma / numMeses;

        // Imprimindo a lista de vendas, média, máximo e mínimo
        System.out.println("\nLista de Vendas:");
        for (int i = 0; i < numMeses; i++) {
            System.out.println("Mês " + (i + 1) + ": " + vendas[i]);
        }
        System.out.println("\nMédia de Vendas: " + media);
        System.out.println("Máximo de Vendas: " + maximo);
        System.out.println("Mínimo de Vendas: " + minimo);

        scanner.close();
    }
}
