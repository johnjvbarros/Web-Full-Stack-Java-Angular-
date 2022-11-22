
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarrinhoDeCompras {
    static List<String> listaContatos = new ArrayList<>();
    static Path path = Paths.get("C:\\Users\\joaojvbarros\\Java\\cart.txt");

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        boolean continuar=true;
        String opcaoEntrada;

        while(continuar){
            System.out.println("Escolha um das opções abaixo");
            System.out.println("1 - Adicionar produto");
            System.out.println("2 - Mostrar carrinho");
            System.out.println("3 - Sair");
            opcaoEntrada = input.nextLine();
            switch (opcaoEntrada){
                case "1"-> cadastrarProduto(input);
                case "2"-> listarContato();
                case "3"-> continuar=false;
                default-> System.out.println("Opção inválida");
            }
        }

    }

    public static void cadastrarProduto(Scanner input) throws IOException {
        System.out.println("Digite: o nome do produto");
        String produto = input.nextLine();

        System.out.printf("Digite: o preco de %s: ", produto);
        String preco = input.nextLine();

        System.out.println("Digite a quantidade desejada: ");
        String quantidade = input.nextLine();

        if(!Files.exists(path)){
            Files.createFile(path);
        }
        Files.writeString(path, produto+"|"+preco+"|"+quantidade+" \n", StandardOpenOption.APPEND);
    }
    public static void listarContato() throws IOException {
        List<String> listaStrings = Files.readAllLines(path);
        String produto, quantidade, preco;
        int numeroContato = 1;
        Double precoTotal=0.00, quantidadeTotal=0.0, totalItem;

        for(String string: listaStrings){
            produto = string.split("\\|")[0];
            preco = string.split("\\|")[1];
            quantidade = string.split("\\|")[2];
            System.out.printf("ID: %d | Produto: %s | Preço: R$ %s | quantidade: %s\n", numeroContato, produto, preco, quantidade);
            numeroContato++;
            totalItem = Double.parseDouble(preco)*Double.parseDouble(quantidade);
            quantidadeTotal += Double.parseDouble(quantidade);
            precoTotal += totalItem;
        }
        System.out.println("------------------------------------------------------------------");
        System.out.printf("Total do Carrinho                | Preco: R$ %.2f | quantidade: %.0f\n", precoTotal, quantidadeTotal);

    }
}
