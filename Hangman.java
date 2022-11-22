import java.util.Arrays;
import java.util.Scanner;

public class Hangman {

public static Scanner scanner = new Scanner(System.in);

    public static String display="";
    public static void main(String[] args) {

        // Jogo da Forca
        Boolean fimDoJogo = false;

        // Gerar palavra para adivinhar
        String[] palavras = {"ovo", "gato", "palavra", "cachorro", "pedra", "biblioteca", "aleatorio", "constituir", "construir", "banana","computador","chuvoso"};
        int Random = (int)(Math.random()*9);
        String palavraEscolhida = palavras[Random];
        //System.out.println(palavraEscolhida);
        palavraEscolhida = palavraEscolhida.toLowerCase();
        Integer vidas = 6;

        // Criar casas para as letras
        String display = Display(palavraEscolhida);
        System.out.println(display);
        System.out.println("Jogo da forca! Tente adivinhar a palavra: ");

        while (!fimDoJogo && display.contains("_")){
            System.out.println("escolha uma letra: ");

            String escolha = scanner.next();
            char ch = escolha.charAt(0);
            if (palavraEscolhida.indexOf(ch) == -1) {
                vidas -= 1;
                Forca(vidas);
            }
            if (vidas == 0){
                System.out.println("--------------------");
                System.out.println("---- GAME OVER! ----");
                System.out.println("A palavra era " + palavraEscolhida);
                fimDoJogo = true;
            }
            if(display.contains(String.valueOf(ch))==true){
                System.out.println("Letra já escolhida. Tente novamente..");
            }
            else{
                for(int i = 0; i < palavraEscolhida.length(); i++) {
                    if (ch == palavraEscolhida.charAt(i)) {
                        if (i > 0) {
                            display = display.substring(0, i) + ch + display.substring(i + 1);
                        }
                        if(i == 0) {
                            display = ch + display.substring(1);
                        }
                    }
                }
            }
            System.out.println(display);
            if(!display.contains("_")){
                System.out.println("\n\nParabens! Voce ganhou!");
            }
        }
    }
    public static int Forca(Integer vidas) {
        switch (vidas){
            case 5 ->{
                System.out.println(" +--------+ ");
                System.out.println(" |        O ");
                System.out.println(" |          ");
                System.out.println(" |          ");
                System.out.println(" |          ");
                System.out.println(" |          ");
                System.out.println("============");
            }
            case 4 ->{
                System.out.println(" +-------+  ");
                System.out.println(" |       O  ");
                System.out.println(" |       |  ");
                System.out.println(" |          ");
                System.out.println(" |          ");
                System.out.println(" |          ");
                System.out.println("============");
            }
            case 3 ->{
                System.out.println(" +-------+  ");
                System.out.println(" |       O  ");
                System.out.println(" |      /|  ");
                System.out.println(" |          ");
                System.out.println(" |          ");
                System.out.println(" |          ");
                System.out.println("============");
            }
            case 2 ->{
                System.out.println(" +-------+  ");
                System.out.println(" |       O  ");
                System.out.println(" |      /|\\ ");
                System.out.println(" |          ");
                System.out.println(" |          ");
                System.out.println(" |          ");
                System.out.println("============");
            }
            case 1 ->{
                System.out.println(" +-------+  ");
                System.out.println(" |       O  ");
                System.out.println(" |      /|\\ ");
                System.out.println(" |      /   ");
                System.out.println(" |          ");
                System.out.println(" |          ");
                System.out.println("============");
            }
            case 0 ->{
                System.out.println(" +-------+  ");
                System.out.println(" |       O  ");
                System.out.println(" |      /|\\ ");
                System.out.println(" |      / \\ ");
                System.out.println(" |          ");
                System.out.println(" |          ");
                System.out.println("============");
            }
        }
    return 1;

    }

    public static String Display(String palavraEscolhida) {

        for (int position = 0; position < palavraEscolhida.length(); position++) {
            display += "_";
        }
        return display;
    }
}
