public class Questao1Aula2 {
    public static void main(String[] args) {
    //Faça um programa que receba uma frase com "Janeiro: 1543, Fevereiro: 1222, Março: 1234". Imprima sequencialmente em linhas separadas por cada mês e na última linha a frase: "Total: " e o valor da soma de todos os meses. Exemplo:
    //Janeiro: 1543
    //Fevereiro: 1222
    //Março: 1234
    //Total: 3999

        String input = "Janeiro: 1543, Fevereiro: 1222, Março: 1234";

        String[] meses = input.split(",");
        int total = 0;
        // Foreach do Java para somar valores de cada mes
        for (String item : meses){
            
            //somar valores de cada mes e guardar numa variavel
            total += Integer.parseInt(item
                    .substring(item
                            .indexOf(":") + 2));
            // printa cada mes separado
            System.out.println(item.trim());
        }
        System.out.println("Total: " + total);
    }
}
