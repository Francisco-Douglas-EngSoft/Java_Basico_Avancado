import java.util.Scanner;
public class controleEstoque {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);  
        
        System.out.printf("Digite o total de farinha: ");
        int farinha = sc.nextInt();

        System.out.printf("Digite o total de açucar: ");
        int acucar = sc.nextInt();

        System.out.printf("A receita requer %d de farinha e %d acucar", farinha, acucar);
        sc.close();
    }

}
