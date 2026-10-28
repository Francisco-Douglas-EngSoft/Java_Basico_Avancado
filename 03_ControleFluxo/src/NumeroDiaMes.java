import java.util.Scanner;

public class NumeroDiaMes {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o número do dia (1-31): ");
        int dia = sc.nextInt();

        //Switch case expression e a forma mais moderna de se 
        // utilizar o switch case, utilizando a seta "->" 
        // para indicar o bloco de código a ser executado para cada caso.
        
        switch (dia){
            case 1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
                 11, 12, 13, 14, 15, 16, 17, 18,
                 19, 20, 21, 22, 23, 24, 25, 26,
                 27, 28 -> System.out.println("Dia do mês: " + dia);
            case 29 -> System.out.println("Dia do mês: " + dia + " (último dia de fevereiro em anos bissextos)");
            case 30 -> System.out.println("Dia do mês: " + dia + " (último dia de abril, junho, setembro e novembro)");
            case 31 -> System.out.println("Dia do mês: " + dia + " (último dia de janeiro, março, maio, julho, agosto, outubro e dezembro)");
            default -> System.out.println("Dia inválido");
        }

        sc.close();
    }
}
