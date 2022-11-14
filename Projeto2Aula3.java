package Aula3;

import java.util.Scanner;

public class Projeto2Aula3 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int idade;

            System.out.println("Informe sua idade: ");
            idade = sc.nextInt();

            String resultado = (idade < 16) ? "Sem direito a votar." :
                    ((idade < 18) ? "Voto facultativo.":
                            (idade < 70) ? "Voto obrigatório." : "Voto facultativo.");

            System.out.println(resultado);
        }
    }


