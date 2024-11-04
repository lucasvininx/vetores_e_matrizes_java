import java.util.Scanner;

public class atv7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definindo o número máximo de contatos
        final int MAX_CONTATOS = 100;
        String[] nomes = new String[MAX_CONTATOS];
        String[] telefones = new String[MAX_CONTATOS];
        String[] emails = new String[MAX_CONTATOS];
        int numContatos = 0;

        // Adicionando contatos de exemplo
        adicionarContato("João", "123456789", "joaopedro@gmail.com", nomes, telefones, emails, numContatos++);
        adicionarContato("Maria", "987654321", "mariaclara@gmail.com", nomes, telefones, emails, numContatos++);
        adicionarContato("Lucas", "1999935625","lucasviniciussff@gmail.com", nomes, telefones, emails, numContatos++);

        // Imprimindo lista de contatos
        System.out.println("Lista de Contatos:");
        for (int i = 0; i < numContatos; i++) {
            System.out.println("Nome: " + nomes[i]);
            System.out.println("Telefone: " + telefones[i]);
            System.out.println("E-mail: " + emails[i]);
            System.out.println();
        }

        // Consulta de contato por nome
        System.out.print("Digite o nome do contato que deseja buscar: ");
        String nomeBusca = scanner.nextLine();
        boolean encontrado = false;
        for (int i = 0; i < numContatos; i++) {
            if (nomes[i].equalsIgnoreCase(nomeBusca)) {
                System.out.println("Contato encontrado:");
                System.out.println("Nome: " + nomes[i]);
                System.out.println("Telefone: " + telefones[i]);
                System.out.println("E-mail: " + emails[i]);
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Contato não encontrado.");
        }

        scanner.close();
    }

    public static void adicionarContato(String nome, String telefone, String email, String[] nomes, String[] telefones, String[] emails, int indice) {
        nomes[indice] = nome;
        telefones[indice] = telefone;
        emails[indice] = email;
    }
}
