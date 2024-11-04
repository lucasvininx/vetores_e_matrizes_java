import java.util.Scanner;

public class atv6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitando peso e altura do paciente
        System.out.print("Digite o peso do paciente (em kg): ");
        double peso = scanner.nextDouble();

        System.out.print("Digite a altura do paciente (em metros): ");
        double altura = scanner.nextDouble();

        // Calculando o IMC
        double imc = peso / (altura * altura);

        // Imprimindo o IMC do paciente
        System.out.println("IMC do paciente: " + imc);

        // Determinando a classificação do IMC
        String classificacao;
        if (imc < 18.5) {
            classificacao = "Abaixo do peso";
        } else if (imc < 25) {
            classificacao = "Peso normal";
        } else if (imc < 30) {
            classificacao = "Sobrepeso";
        } else {
            classificacao = "Obesidade";
        }

        // Imprimindo a classificação do IMC
        System.out.println("Classificação do IMC: " + classificacao);

        scanner.close();
    }
}
