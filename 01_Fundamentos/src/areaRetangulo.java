import java.util.Scanner;
public class areaRetangulo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.printf("Digite a altura: ");
        int altura = sc.nextInt();

        System.out.printf("Digite a largura");
        int largura = sc.nextInt();

        int areaRetangulo = largura * altura;
        System.out.printf("Um retangulo de %d cm Altura e %d cm largura equivalem a: ", altura, largura);
        System.out.printf("Uma Area quadrada de %d cm²", areaRetangulo);

        sc.close();
    }
    
}
