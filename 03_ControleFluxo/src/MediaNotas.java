import java.util.Scanner;

public class MediaNotas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();
        System.out.print("Digite a terceira nota: ");
        double nota3 = sc.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        String resultado = switch ((int) media) {
            case 10, 9 -> "Aprovado com louvor";
            case 8, 7 -> "Aprovado";
            case 6, 5 -> "Recuperação";
            case 4, 3, 2, 1, 0 -> "Reprovado";
            default -> "Nota inválida";
        };

        System.out.printf("Média: %.2f - Resultado: %s%n", media, resultado);

        sc.close();
    }
    
}
