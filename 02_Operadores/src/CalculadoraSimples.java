import java.util.Scanner;

public class CalculadoraSimples {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Calcula do número: ");
        int n1 = sc.nextInt();

        System.out.printf("Contagem até o número: ");
        int n2 = sc.nextInt();

        for(int i = 1; i <= n2; i++){
            System.out.printf("%d + %d = %d%n", n1, i, n1 + i);
        }

        sc.close();
    }
    
}
