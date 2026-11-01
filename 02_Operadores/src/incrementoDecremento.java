public class incrementoDecremento {
    public static void main(String[] args) {
        int valor = 5;

        System.out.println("=== Incremento ===");
        // Pós-incremento: usa o valor atual e depois soma 1.
        System.out.println("Pós-incremento (valor++): " + valor++);
        System.out.println("Valor depois: " + valor);

        // Pré-incremento: soma 1 primeiro e depois usa o novo valor.
        System.out.println("Pré-incremento (++valor): " + (++valor));

        System.out.println("\n=== Decremento ===");
        // Pós-decremento: usa o valor atual e depois subtrai 1.
        System.out.println("Pós-decremento (valor--): " + valor--);
        System.out.println("Valor depois: " + valor);

        // Pré-decremento: subtrai 1 primeiro e depois usa o novo valor.
        System.out.println("Pré-decremento (--valor): " + (--valor));

        System.out.println("\n=== Negação ===");
        int numero = 8;
        // O sinal - inverte o sinal numérico. Ele não altera a variável original.
        System.out.println("Negação de " + numero + ": " + (-numero));
        System.out.println("Valor original continua: " + numero);

        boolean estaChovendo = true;
        // ! inverte um valor booleano: true vira false e false vira true.
        System.out.println("Está chovendo: " + estaChovendo);
        System.out.println("Não está chovendo (!estaChovendo): " + (!estaChovendo));
    }
}
