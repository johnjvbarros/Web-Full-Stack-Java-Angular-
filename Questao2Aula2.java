import java.util.Arrays;
import java.util.Scanner;

public class Questao2Aula2 {

    public static void main(String[] args) {
//Faça um programa que pegue o nome completo que o usuário digitar e imprima o nome com cada parte separada por espaço, um símbolo de exclamação no início. Exemplo:
//Nome: João Mario da Silva
//Resultado: !João !Maria !da !Silva
        
        Scanner print = new Scanner(System.in);
        System.out.println("Insira o nome: ");
        String nome = print.nextLine();

        String[] partesNome = nome.split(" ");
        for(int i=0; i< partesNome.length; i++) {
            partesNome[i] = "!" + partesNome[i];
        }

        nome = String.join(" ", partesNome);

        System.out.println(nome);
    }

}
