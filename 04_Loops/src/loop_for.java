import java.util.Scanner;
public class loop_for {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");

        int numero = sc.nextInt();

        for(int i = 0; i <= numero; i++){
            System.out.println(i);
        }

        sc.close();
    }
    
}
