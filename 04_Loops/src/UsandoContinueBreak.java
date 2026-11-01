public class UsandoContinueBreak {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                System.out.println("Pulando o valor: " + i);
                continue; // Pula para a próxima iteração do loop
            }
            if (i == 8) {
                System.out.println("Interrompendo o loop quando i for igual a: " + i);
                break; // Interrompe o loop
            }
            System.out.println("Valor de i: " + i);
        }
    }
}
