
import java.util.Scanner;

public class Projeto3Aula3 {

    public static void main(String[] args) {

        System.out.println(" 1 - Coca-Cola - R$ 5 \n 2 - Coca-Cola 0 - R$ 4.50\n 3 - Pepsi - R$ 4,40\n 4 - Guaraná Antarctica - R$ 3,50\n 5 - Fanta Laranja - R$ 4,23\n 6 - Água - R$ 2,50");
        Scanner input = new Scanner(System.in);
        int opcao = input.nextInt();
        Double preco = 0.00;
        switch (opcao) {
            case 1:
                preco = 5.00;
                System.out.printf("Coca-Cola - R$ %.2f", preco);
                break;
            case 2:
                preco = 4.50;
                System.out.printf("Coca-Cola 0 - R$ %.2f", preco);
                break;
            case 3:
                preco = 4.40;
                System.out.printf("Pepsi - R$ %.2f", preco);
                break;
            case 4:
                preco = 3.50;
                System.out.printf("Guaraná Antarctica - R$ %.2f", preco);
                break;
            case 5:
                preco = 4.23;
                System.out.printf("Fanta Laranja - R$ %.2f", preco);
                break;
            case 6:
                preco = 2.50;
                System.out.printf("Água - R$ %.2f", preco);
                break;
            default:
                System.out.println("Opcao Invalida!");
                break;

        }
    }
}