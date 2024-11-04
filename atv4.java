import java.util.Scanner;

public class atv4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitando a temperatura em Celsius ao usuário
        System.out.print("Digite a temperatura em Celsius: ");
        double temperaturaCelsius = scanner.nextDouble();

        // Convertendo a temperatura para Fahrenheit
        double temperaturaFahrenheit = (temperaturaCelsius * 9 / 5) + 32;

        // Imprimindo a temperatura em Celsius e Fahrenheit
        System.out.println("Temperatura em Celsius: " + temperaturaCelsius);
        System.out.println("Temperatura em Fahrenheit: " + temperaturaFahrenheit);

        scanner.close();
    }
}
