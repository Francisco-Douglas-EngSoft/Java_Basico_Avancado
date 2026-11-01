import java.util.Scanner;

public class nivelSatisfacao {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nível de satisfação (1 a 5):");
        int nivel = sc.nextInt();

        switch (nivel) {
            case 1 -> System.out.println("Muito insatisfeito");
            case 2 -> System.out.println("Insatisfeito");
            case 3 -> System.out.println("Neutro");
            case 4 -> System.out.println("Satisfeito");
            case 5 -> System.out.println("Muito satisfeito");
            default -> System.out.println("Nível inválido");
        }

        System.out.println("Fim do programa");

        sc.close();
    }
}
