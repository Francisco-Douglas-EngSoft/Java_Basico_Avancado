import java.util.Scanner;

public class SwitchCase_expression {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o número do dia (1-7): ");
        int day = sc.nextInt();

        //Switch case expression e a forma mais moderna de se 
        // utilizar o switch case, utilizando a seta "->" 
        // para indicar o bloco de código a ser executado para cada caso.
        
        switch (day){
            case 1 -> System.out.println("Segunga-feira");
            case 2 -> System.out.println("Terça-feira");
            case 3 -> System.out.println("Quarta-feira");
            case 4 -> System.out.println("Quinta-feira");
            case 5 -> System.out.println("Sexta-feira");
            case 6 -> System.out.println("Sábado");
            case 7 -> System.out.println("Domingo");

            default -> System.out.println("Dia inválido");
        }

        sc.close();
    }
}
