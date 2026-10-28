public class usando_Continue_Break {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("Pulando o 5");
                continue;
            }
            if (i == 8) {
                System.out.println("Parando no 8");
                break;
            }
            System.out.println(i);
        }
    }
}
