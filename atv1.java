import java.util.ArrayList;
import java.util.List;

public class atv1 {
    static List<String> nomesProdutos = new ArrayList<>();
    static List<Double> precosProdutos = new ArrayList<>();
    static List<Integer> quantidadesProdutos = new ArrayList<>();

    public static void adicionarProduto(String nome, double preco, int quantidade) {
        nomesProdutos.add(nome);
        precosProdutos.add(preco);
        quantidadesProdutos.add(quantidade);
    }

    public static void imprimirEstoque() {
        System.out.println("Lista de Produtos:");
        for (int i = 0; i < nomesProdutos.size(); i++) {
            System.out.println("Nome: " + nomesProdutos.get(i) + ", Preço: R$" + precosProdutos.get(i) + ", Quantidade em Estoque: " + quantidadesProdutos.get(i));
        }
    }

    public static void atualizarEstoque(String nomeProduto, int novaQuantidade) {
        for (int i = 0; i < nomesProdutos.size(); i++) {
            if (nomesProdutos.get(i).equals(nomeProduto)) {
                quantidadesProdutos.set(i, novaQuantidade);
                System.out.println("Quantidade em estoque do produto " + nomeProduto + " atualizada para " + novaQuantidade);
                return;
            }
        }
        System.out.println("Produto " + nomeProduto + " não encontrado no estoque");
    }

    public static void main(String[] args) {
        adicionarProduto("Celular", 1500, 10);
        adicionarProduto("Notebook", 3000, 5);

        imprimirEstoque();

        atualizarEstoque("Celular", 8);
        imprimirEstoque();
    }
}
