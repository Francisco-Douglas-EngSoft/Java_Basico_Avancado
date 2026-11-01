public class controleBreak {
    public static void main(String[] args) {
        int i = 0;

        // while (true) repete indefinidamente, ate encontrar um break.
        while (true) {
            System.out.println("i = " + i);
            i++;

            if (i == 10) {
                System.out.println("O loop sera interrompido quando i for igual a 10.");
                break;
            }
        }
    }
}
