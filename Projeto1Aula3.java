import java.util.Scanner;

public class Projeto1Aula3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int idade;

        System.out.println("Informe sua idade: ");
        idade = sc.nextInt();

       String resultado;
        if ((idade < 16)) System.out.println("Sem direito a votar.");
        else if (idade < 18) System.out.println("Voto facultativo.");
        else if (idade < 70) System.out.println("Voto obrigatório.");
        else    System.out.println("Voto facultativo.");

    }
}
