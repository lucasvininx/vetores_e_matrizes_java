import java.util.Scanner;

public class atv2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos alunos? ");
        int numAlunos = scanner.nextInt();

        int[] notas = new int[numAlunos];

        // Lendo as notas dos alunos
        for (int i = 0; i < numAlunos; i++) {
            System.out.print("Digite a nota do aluno " + (i + 1) + ": ");
            notas[i] = scanner.nextInt();
        }

        // Calculando a média
        double soma = 0;
        for (int nota : notas) {
            soma += nota;
        }
        double media = soma / numAlunos;

        // Imprimindo as notas e a média final
        System.out.println("\nLista de Notas:");
        for (int i = 0; i < numAlunos; i++) {
            System.out.println("Aluno " + (i + 1) + ": " + notas[i]);
        }
        System.out.println("\nMédia final: " + media);

        scanner.close();
    }
}
